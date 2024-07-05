package helper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;

public class FilePermissionUtil {

    public static void changePermissions(String filePath, String permissions) throws IOException {
        Path path = Paths.get(filePath);
        Files.setPosixFilePermissions(path, PosixFilePermissions.fromString(permissions));
    }

    public static void changeOwnership(String filePath, String username) throws IOException {
        Path path = Paths.get(filePath);
        UserPrincipal user = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName(username);
        Files.setOwner(path, user);
    }

}
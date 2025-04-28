package org.acme.data;

import com.google.devtools.build.runfiles.Runfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataLibrary {

    public static String getMessage() throws IOException {
        Runfiles runfiles = Runfiles.preload().unmapped();
        String location = runfiles.rlocation("_main/datalib/data/message.txt");
        System.out.println("FILE LOCATION: " + location);

        return Files.readString(Paths.get(location));
    }
}

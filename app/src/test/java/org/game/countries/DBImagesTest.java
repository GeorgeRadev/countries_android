package org.game.countries;

import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Checks that every country in {@link DB} has all images the app looks up by ISO code.
 */
public class DBImagesTest {
    // Unit tests run with the module directory as the working directory
    private static final File DRAWABLE_DIR = new File("src/main/res/drawable");

    // Images that are known to be missing; remove an entry once the image is added
    private static final Set<String> KNOWN_MISSING = new HashSet<>(Arrays.asList(
            "quiz_location_vi"
    ));

    @Test
    public void isoCodesAreValidAndUnique() {
        Set<String> codes = new HashSet<>();
        for (String[] row : DB.dbStrings) {
            String code = row[2];
            assertTrue(row[0] + ": invalid ISO code '" + code + "'", code.matches("[a-z]{2}"));
            assertTrue(row[0] + ": duplicate ISO code '" + code + "'", codes.add(code));
        }
    }

    @Test
    public void everyCountryHasAllImages() {
        assertTrue("drawable dir not found: " + DRAWABLE_DIR.getAbsolutePath(), DRAWABLE_DIR.isDirectory());
        List<String> missing = new ArrayList<>();
        for (String[] row : DB.dbStrings) {
            for (String prefix : new String[]{DB.FLAG_PREFIX, DB.QUIZ_FLAG_PREFIX, DB.QUIZ_LOCATION_PREFIX}) {
                String name = prefix + row[2];
                if (!new File(DRAWABLE_DIR, name + ".png").isFile() && !KNOWN_MISSING.contains(name)) {
                    missing.add(name + " (" + row[0] + ")");
                }
            }
        }
        assertEquals("Missing images: " + missing, 0, missing.size());
    }

    @Test
    public void knownMissingImagesAreStillMissing() {
        for (String name : KNOWN_MISSING) {
            assertFalse(name + ".png exists now, remove it from KNOWN_MISSING",
                    new File(DRAWABLE_DIR, name + ".png").isFile());
        }
    }
}

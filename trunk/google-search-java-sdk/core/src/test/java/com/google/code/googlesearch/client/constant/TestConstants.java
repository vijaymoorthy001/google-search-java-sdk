/**
 *
 */
package com.google.code.googlesearch.client.constant;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Nabeel Mukhtar
 *
 */
public final class TestConstants {

    /** Field description */
    public static final String TEST_CONSTANTS_FILE = "TestConstants.properties";

    /** Field description */
    private static final Properties testConstants = new Properties();

    static {
        try {
            testConstants.load(TestConstants.class.getResourceAsStream(TEST_CONSTANTS_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Constructs ...
     *
     */
    private TestConstants() {}
}

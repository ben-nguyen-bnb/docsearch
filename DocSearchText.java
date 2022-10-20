import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;

public class DocSearchText {
    
    @Test
    public void testURLhandler() throws URISyntaxException, IOException{
        Handler handle = new Handler("C:\\Users\\Ben Nguyen\\OneDrive\\Documents\\cs15l\\docsearch");
        URI equals = new URI("http://localhost:4600/");
        assertEquals("path Success", handle.handleRequest(equals));
    }
}

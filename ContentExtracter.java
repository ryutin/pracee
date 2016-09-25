import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.String;

import java.io.InputStream;
import java.net.URL;


import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.xml.XMLParser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.html.BoilerpipeContentHandler;
import org.apache.tika.metadata.TikaCoreProperties;

import org.xml.sax.SAXException;

public class ContentExtractor {

    public static void main(final String[] args) throws IOException, TikaException {

        try {
            //FileInputStream    input       = new FileInputStream(new File("test.html"));
            String             url         = args[0];
            InputStream        input       = new URL(url).openStream();
            BodyContentHandler textHandler = new BodyContentHandler();
            Metadata           metadata    = new Metadata();
            AutoDetectParser   parser      = new AutoDetectParser();
            ParseContext       context     = new ParseContext();

            parser.parse(input, new BoilerpipeContentHandler(textHandler), metadata, context);

            String title = metadata.get(TikaCoreProperties.TITLE);
            String body  = textHandler.toString();

            System.out.println("URL: "+ url + "\n");
            System.out.println("TITLE: " + title + "\n");
            System.out.println("BODY:" + body + "\n");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (TikaException e) {
            e.printStackTrace();
        }

//        return result;
    }
}

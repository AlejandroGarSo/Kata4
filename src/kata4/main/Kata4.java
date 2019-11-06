
package kata4.main;

import java.util.List;
import kata4.model.*;
import kata4.view.*;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = "email.txt";
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        /*histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");*/

        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}

package app.start;

import app.reportGenerator.service.ReportService;
import app.simpleContainer.Container;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        ReportService reportService =
                (ReportService) container.getComponent("reportService");
        reportService.generateAnnualReport(2007);
    }
}

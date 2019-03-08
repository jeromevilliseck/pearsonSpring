package app.reportGenerator.service;

import app.reportGenerator.ReportGenerator;
import app.reportGenerator.impl.PdfReportGenerator;
import app.simpleContainer.Container;

public class ReportService {
    //private ReportGenerator reportGenerator = new PdfReportGenerator(); //Couplage fort ->ancienne version
    //remplacer la création de l’instance de ReportGenerator dans ReportService par une instruction de recherche d’un composant.
    private ReportGenerator reportGenerator =
            (ReportGenerator) Container.instance.getComponent("reportGenerator");

    public void generateAnnualReport(int year) {
        String[][] statistics = null;
        //toimpl Comportement de collecte stat annuel
        reportGenerator.generate(statistics);
    }

    public void generateMonthlyReport(int year, int month) {
        String[][] statistics = null;
        //
        // toimpl Collecter les statistiques pour le mois...
        //
        reportGenerator.generate(statistics);
    }

    public void generateDailyReport(int year, int month, int day) {
        String[][] statistics = null;
        //
        // toimpl Collecter les statistiques pour la journée...
        //
        reportGenerator.generate(statistics);
    }
}

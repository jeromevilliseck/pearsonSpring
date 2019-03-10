package app.reportGenerator.service;

import app.reportGenerator.ReportGenerator;
import app.simpleContainer.Container;

//Séparer la logique de recherche des composants du Container dans les services
public class ServiceLocator {
    private static Container container = Container.instance; //Instance du contener qui initialise la map des impl

    public static ReportGenerator getReportGenerator() {
        return (ReportGenerator) container.getComponent("reportGenerator");
    } //getter de l'interface reportGenerator, retourne en page 8 une instance de reportGenerator


}

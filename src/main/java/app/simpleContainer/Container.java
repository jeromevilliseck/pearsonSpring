package app.simpleContainer;

import app.reportGenerator.ReportGenerator;
import app.reportGenerator.impl.PdfReportGenerator;
import app.reportGenerator.service.ReportService;

import java.util.HashMap;
import java.util.Map;

//permet a d'autres composant de retrouver ce conteneur via son instance statique et de recherche d'autres composant en consultant sa map
public class Container {
    // L’instance globale de cette classe Container afin que les composants
    // puissent la trouver.
    public static Container instance;
    // Un Map pour stocker les composants. L’identifiant du composant
    // sert de clé.
    private Map<String, Object> components;
    public Container() {
        components = new HashMap<String, Object>();
        instance = this;

        //Initialisation composant -> chaque composant est une implementation d'une interface avec un comportement bien précis adapté à un contexte
        ReportGenerator reportGenerator = new PdfReportGenerator();
        components.put("reportGenerator", reportGenerator);

        //Stockage compoant dans la map du container
        ReportService reportService = new ReportService();
        components.put("reportService", reportService);
    }
    public Object getComponent(String id) {
        return components.get(id);
    }
}

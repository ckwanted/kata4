package frecuencia;

public class HistogramView<Type> {
    
    public void print(Histogram<Type> histogram) {
        for (Type type : histogram.keySet()) {
            System.out.println(type + "->" + histogram.get(type));
        }
    }
    
}

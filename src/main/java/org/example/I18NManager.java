package org.example;
import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager {

    private static I18NManager instance;

    private HashMap<String, ResourceBundle> data;
    public static I18NManager getInstance() {
        if(instance == null){
            instance = new I18NManager();
        }
        return instance;
    }

    private I18NManager() {
        data = new HashMap<>();
    }


    public void clear() {
    }

    /**
     *
     * @param language ca, es, en
     * @param key l1, l2
     * @return
     */
    public String getText(String language, String key) {
        ResourceBundle rb = data.get(language);
        if(rb==null){
            rb= ResourceBundle.getBundle("" + language);
            data.put(language, rb);
        }
        return rb.getString(key);
    }
}
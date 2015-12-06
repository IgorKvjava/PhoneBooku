package ua.phbook.dir.objects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import ua.phbook.dir.enums.SearchType;
import javax.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Map;

@Component
public class Utils {


    private Map<String, SearchType> searchTypeList = new HashMap<String, SearchType>();
    private String searchString;



    @Autowired
    private MessageSource msg;


    private Character[] letters = new Character[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

    public Character[] getLetters() {
        return letters;
    }



    public Map<String, SearchType> getSearchTypeList() {
        searchTypeList.clear();
        searchTypeList.put(msg.getMessage("surname_name", null,
                FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.Surname);
        searchTypeList.put(msg.getMessage("fistName_name", null,
                FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.FistName);
        return searchTypeList;
    }


    public void setSearchTypeList(Map<String, SearchType> searchTypeList) {
        this.searchTypeList = searchTypeList;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }


}

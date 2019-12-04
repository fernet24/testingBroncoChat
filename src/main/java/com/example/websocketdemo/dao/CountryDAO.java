package com.example.websocketdemo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import com.example.websocketdemo.model.Country;
import org.springframework.stereotype.Repository;
 
@Repository
public class CountryDAO {
 
    private static final Map<String, Country> COUNTRIES_MAP = new HashMap<>();
 
    static {
        initDATA();
    }
 
    private static void initDATA() {
 
        Country vn = new Country("Library", "Library");
        Country en = new Country("BRIC", "BRIC");
        Country fr = new Country("Games Room", "Games Room");
        Country us = new Country("Starbucks", "Starbucks");
        Country ru = new Country("CS Lab", "CS Lab");
        Country bs = new Country("BSC", "BSC");
 
        COUNTRIES_MAP.put(vn.getCountryCode(), vn);
        COUNTRIES_MAP.put(en.getCountryCode(), en);
        COUNTRIES_MAP.put(fr.getCountryCode(), fr);
        COUNTRIES_MAP.put(us.getCountryCode(), us);
        COUNTRIES_MAP.put(ru.getCountryCode(), ru);
        COUNTRIES_MAP.put(bs.getCountryCode(), bs);
    }
 
    public Country findCountryByCode(String countryCode) {
        return COUNTRIES_MAP.get(countryCode);
    }
 
    public List<Country> getCountries() {
        List<Country> list = new ArrayList<>();
        list.addAll(COUNTRIES_MAP.values());
        return list;
    }
 
}
package org.java.dao;

import java.util.List;
import java.util.Map;


public interface InfMapper {

    public void add(Map<String, Object> m);
    public List<Map<String,Object>> getList();
}

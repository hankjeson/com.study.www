package com.zjj.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class airplane {
    private String name;
    private String id;
    private Map<String,String> maps;
    private Set<String> set;
}

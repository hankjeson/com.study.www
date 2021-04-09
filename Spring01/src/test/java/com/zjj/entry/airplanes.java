package com.zjj.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class airplanes<T> {
    private String id;
    private airplane[] airplane;
    private List<T> list;
}

package com.ecommerce.commerce.test.dev.model;

import lombok.SneakyThrows;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Model {

    public Model() {
    }

    @SneakyThrows
    public Date convertStringToDateWithFormat(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss");
        return formatter.parse(strDate);
    }


}

package com.ideas2it.hospitalmanagement.commons.enums;

public enum PatientType {

    INPATIENT("InPatient"), OUTPATIENT("OutPatient");

    private final String value;

    PatientType(String value){
        this.value = value;
    }

    public static PatientType fromValue(int value){
        for (PatientType type : values()) {  
            if (type.value.equals(value)) {  
                return type;  
            }  
        }  
        throw new IllegalArgumentException("Invalid type: " + value);  
    }

    public String toValue(){
        return value;
    }

}
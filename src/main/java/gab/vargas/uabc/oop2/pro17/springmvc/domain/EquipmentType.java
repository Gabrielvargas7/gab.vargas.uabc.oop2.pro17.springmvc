/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gab.vargas.uabc.oop2.pro17.springmvc.domain;

/**
 *
 * @author gvargas
 */
public class EquipmentType {
    
    private int equipmentTypeId;
    private String equipmentName; // computer,laptop ..  
    private String equipmentLab;

    public EquipmentType() {
    }

    public int getEquipmentTypeId() {
        return equipmentTypeId;
    }

    public void setEquipmentTypeId(int equipmentTypeId) {
        this.equipmentTypeId = equipmentTypeId;
    }

    public String getEquipmentLab() {
        return equipmentLab;
    }

    public void setEquipmentLab(String equipmentLab) {
        this.equipmentLab = equipmentLab;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    
    
    
}

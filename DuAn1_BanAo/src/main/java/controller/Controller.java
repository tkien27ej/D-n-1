/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

/**
 *
 * @author DINH SANG
 */
public interface Controller<Entity> {
    void open();
    void create();
    void update();
    void delete();
    void filltoTable();
    void setForm(Entity entity);
    Entity getForm();
    void clear();
}

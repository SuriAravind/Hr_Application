package com.ashu.humanresource.employee.entity;

/**
 * Created by Suriyanarayanan K
 * on 08/12/20 9:55 PM.
 */


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="DESIGNATION")
public class DesignationEntity implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String designationName;
    private DesignationEntity parent;
    private Set<DesignationEntity> children = new HashSet<>();

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @ManyToOne
    public DesignationEntity getParent() {
        return parent;
    }

    public void setParent(DesignationEntity parent) {
        this.parent=parent;
    }

    @OneToMany(mappedBy = "parent")
    public Set<DesignationEntity> getChildren() {
        return children;
    }

    public void setChildren(Set<DesignationEntity> children) {
        this.children=children;
    }
    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName=designationName;
    }
}

package dev.beregulya.hibernate.dao;

import javax.persistence.*;

@Entity
@Table(name = "OWNERS")
public class OwnersEntity {

    @Id
    @Column(name = "OWNERS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToOne
    @JoinColumn(name = "NOTEBOOKS_ID")
    private NotebooksEntity notebooksEntity;

    public OwnersEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NotebooksEntity getNotebooksEntity() {
        return notebooksEntity;
    }

    public void setNotebooksEntity(NotebooksEntity notebooksEntity) {
        this.notebooksEntity = notebooksEntity;
    }

}

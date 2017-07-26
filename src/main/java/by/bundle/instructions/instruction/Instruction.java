package by.bundle.instructions.instruction;

import by.bundle.instructions.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Instruction {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private Long userId;

    public Instruction() {

    }

    public Instruction(String name) {
        super();
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

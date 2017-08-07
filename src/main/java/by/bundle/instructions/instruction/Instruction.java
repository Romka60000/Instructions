package by.bundle.instructions.instruction;

import by.bundle.instructions.step.Step;
import by.bundle.instructions.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Instruction {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Long userId;
    private List<Step> steps;

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

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}

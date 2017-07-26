package by.bundle.instructions.instruction;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstructionRepository extends CrudRepository<Instruction, Long> {
    public List<Instruction> findByUserId(Long userId);
}

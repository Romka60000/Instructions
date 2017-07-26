package by.bundle.instructions.instruction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstructionService {

    @Autowired
    InstructionRepository instructionRepository;

    public List<Instruction> getAllInstructions(Long id) {
        List<Instruction> instructions = new ArrayList<>();
        instructionRepository.findByUserId(id).forEach(instructions::add);
        return instructions;
    }

    public Instruction getInstruction(Long id) {
        return instructionRepository.findOne(id);
    }

    public void addInstruction(Instruction instruction) {
        instructionRepository.save(instruction);
    }

    public void updateInstruction(Instruction instruction) {
        instructionRepository.save(instruction);
    }

    public void deleteInstruction(Long id) {
        instructionRepository.delete(id);
    }
}

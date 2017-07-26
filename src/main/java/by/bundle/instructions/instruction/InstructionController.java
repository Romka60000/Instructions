package by.bundle.instructions.instruction;

import by.bundle.instructions.user.User;
import by.bundle.instructions.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstructionController {

    @Autowired
    InstructionService instructionService;

    @RequestMapping("/users/{id}/instructions")
    public List<Instruction> getAllInstructions(@PathVariable Long id) {
        return instructionService.getAllInstructions(id);
    }

    @RequestMapping("/users/{userId}/instructions/{id}")
    public Instruction getInstruction(@PathVariable Long id) {
        return instructionService.getInstruction(id);
    }

    @RequestMapping(value = "/users/{userId}/instructions", method = RequestMethod.POST)
    public void addInstruction(@RequestBody Instruction instruction, @PathVariable Long userId) {
        instruction.setUserId(userId);
        instructionService.addInstruction(instruction);
    }

    @RequestMapping(value = "/users/{userId}/instructions{id}", method = RequestMethod.PUT)
    public void updateInstruction(@RequestBody Instruction instruction, @PathVariable Long userId,
                               @PathVariable Long id) {
        instruction.setUserId(userId);
        instructionService.updateInstruction(instruction);
    }

    @RequestMapping(value = "/users/{userId}/instructions{id}", method = RequestMethod.DELETE)
    public void deleteInstruction(@PathVariable Long id) {
        instructionService.deleteInstruction(id);
    }
}

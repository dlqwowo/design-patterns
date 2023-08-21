package Bytecode;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/17/2023
 */
public class main {

    private static final String LITERAL_0 = "LITERAL 0";
    private static final String HEALTH_PATTERN = "%s_HEALTH";
    private static final String GET_AGILITY = "GET_AGILITY";
    private static final String GET_WISDOM = "GET_WISDOM";
    private static final String ADD = "ADD";
    private static final String LITERAL_2 = "LITERAL 2";
    private static final String DIVIDE = "DIVIDE";

    /**
     * Main app method.
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        VirtualMachine vm = new VirtualMachine(
                new Wizard(45, 7, 11, 0, 0),
                new Wizard(36, 18, 8, 0, 0));

        vm.execute(InstructionConverterUtil.convertToByteCode(LITERAL_0));
        vm.execute(InstructionConverterUtil.convertToByteCode(LITERAL_0));
        vm.execute(InstructionConverterUtil.convertToByteCode(String.format(HEALTH_PATTERN, "GET")));
        vm.execute(InstructionConverterUtil.convertToByteCode(LITERAL_0));
        vm.execute(InstructionConverterUtil.convertToByteCode(GET_AGILITY));
        vm.execute(InstructionConverterUtil.convertToByteCode(LITERAL_0));
        vm.execute(InstructionConverterUtil.convertToByteCode(GET_WISDOM));
        vm.execute(InstructionConverterUtil.convertToByteCode(ADD));
        vm.execute(InstructionConverterUtil.convertToByteCode(LITERAL_2));
        vm.execute(InstructionConverterUtil.convertToByteCode(DIVIDE));
        vm.execute(InstructionConverterUtil.convertToByteCode(ADD));
        vm.execute(InstructionConverterUtil.convertToByteCode(String.format(HEALTH_PATTERN, "SET")));
    }
}

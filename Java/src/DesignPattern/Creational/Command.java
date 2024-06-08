//// Interface Command
//interface Comand {
//    void execute();
//}
//
//// Receiver
//class Light {
//    public void turnOn() {
//        System.out.println("Lâmpada ligada");
//    }
//
//    public void turnOff() {
//        System.out.println("Lâmpada desligada");
//    }
//}
//
//// Concrete Command
//class TurnOnLightCommand implements Comand {
//    private Light light;
//
//    public TurnOnLightCommand(Light light) {
//        this.light = light;
//    }
//
//    @Override
//    public void execute() {
//        light.turnOn();
//    }
//}
//
//// Concrete Command
//class TurnOffLightCommand implements Command {
//    private Light light;
//
//    public TurnOffLightCommand(Light light) {
//        this.light = light;
//    }
//
//    @Override
//    public void execute() {
//        light.turnOff();
//    }
//}
//
//// Invoker
//class RemoteControl {
//    private Command command;
//
//    public void setCommand(Command command) {
//        this.command = command;
//    }
//
//    public void pressButton() {
//        command.execute();
//    }
//}
//
//// Client
//public class Command{
//    public static void main(String[] args) {
//        // Criando os objetos
//        Light light = new Light();
//        TurnOnLightCommand turnOnCommand = new TurnOnLightCommand(light);
//        TurnOffLightCommand turnOffCommand = new TurnOffLightCommand(light);
//
//        // Criando o controle remoto
//        RemoteControl remote = new RemoteControl();
//
//        // Configurando os comandos
//        remote.setCommand(turnOnCommand);
//        remote.pressButton(); // Lâmpada ligada
//
//        remote.setCommand(turnOffCommand);
//        remote.pressButton(); // Lâmpada desligada
//    }
//}

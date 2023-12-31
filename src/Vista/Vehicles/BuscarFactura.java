package Vista.Vehicles;

import javax.swing.*;
import java.awt.*;

public class BuscarFactura extends JDialog {
    JLabel vehiculo, nombreCliente, placa, horaEntrada, minEntrada, horaSalida, minSalida, valorHora, horas, totalPagar, NoFactura;
    JButton buscar, cancelar;

    JTextField vehiculoText, nombreClienteText, placaText, horaEntradaText, minEntradaText, horaSalidaText, minSalidaText, valorHoraText, horasText, totalPagarText, NoFacturaText;

    public BuscarFactura(Frame papa, boolean modal){
        super(papa, modal);
        setTitle("Validar Salida");

        //labels

        NoFactura = new JLabel("No. Factura");
        NoFactura.setBounds(20,20, 100, 20);

        vehiculo = new JLabel("Vehiculo");
        vehiculo.setBounds(20,50,100,20);

        nombreCliente = new JLabel("Nombre Cliente");
        nombreCliente.setBounds(20,80,100,20);

        placa = new JLabel("Placa");
        placa.setBounds(20,110,120,20);

        horaEntrada= new JLabel("Hora entrada");
        horaEntrada.setBounds(20,140,100,20);

        minEntrada = new JLabel("Minuto entrada");
        minEntrada.setBounds(20,170,100,20);

        horaSalida = new JLabel("Hora salida");
        horaSalida.setBounds(20,200,100,20);

        minSalida = new JLabel("Minuto salida");
        minSalida.setBounds(20,230,100,20);

        valorHora = new JLabel("Valor hora");
        valorHora.setBounds(20,260,100,20);

        horas = new JLabel("Horas");
        horas.setBounds(20,290,100,20);

        totalPagar = new JLabel("Total a pagar");
        totalPagar.setBounds(20,320,100,20);

        //textFields

        NoFacturaText = new JTextField(10);
        NoFacturaText.setBounds(150,20,50,20);

        vehiculoText = new JTextField(20);
        vehiculoText.setBounds(150,50,150,20);

        nombreClienteText = new JTextField(20);
        nombreClienteText.setBounds(150,80,150,20);

        placaText = new JTextField(20);
        placaText.setBounds(150,110,150,20);

        horaEntradaText = new JTextField(20);
        horaEntradaText.setBounds(150,140,150,20);

        minEntradaText = new JTextField(20);
        minEntradaText.setBounds(150,170,150,20);

        horaSalidaText = new JTextField(20);
        horaSalidaText.setBounds(150,200,150,20);

        minSalidaText = new JTextField(20);
        minSalidaText.setBounds(150,230,150,20);

        valorHoraText = new JTextField(20);
        valorHoraText.setBounds(150,260,150,20);

        totalPagarText = new JTextField(20);
        totalPagarText.setBounds(150,290,150,20);

        horasText = new JTextField(20);
        horasText.setBounds(150,320,150,20);



        //buttons

        buscar = new JButton("Guardar");
        buscar.setBounds(220,20,80,20);

        cancelar = new JButton("Cancelar");
        cancelar.setBounds(100, 370, 100, 30);

        add(NoFactura);
        add(NoFacturaText);
        add(buscar);

        add(vehiculo);
        add(vehiculoText);
        add(nombreCliente);
        add(nombreClienteText);
        add(placa);
        add(placaText);
        add(horaEntrada);
        add(horaEntradaText);
        add(minEntrada);
        add(minEntradaText);
        add(horaSalida);
        add(horaSalidaText);
        add(minSalida);
        add(minSalidaText);
        add(valorHora);
        add(valorHoraText);
        add(horas);
        add(horasText);
        add(totalPagar);
        add(totalPagarText);
        add(cancelar);


        setLayout(null);
        //setResizable(false);
        setLocationRelativeTo(null);
        setSize(320, 450);
        setVisible(true);


    }

    /*public static void main(String[] args) {
        new BuscarFactura(null, true);
    }*/

}
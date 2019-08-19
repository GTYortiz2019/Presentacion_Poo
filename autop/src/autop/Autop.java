/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autop;
import java.util.Scanner;
public class AutoP
{
public static void main(String[] args)
{
boolean OnA = false;
int opcion =0, Rapi=0, Aceite = 0, Gasolina = 0;
Scanner sc = new Scanner(System.in);
do
{
System.out.println();
System.out.println();
System.out.println();
System.out.println("** Verifique El Estado Del Auto **");
System.out.println();
System.out.println("*** Tablero De Comandos****");
System.out.println("*1. Encender/Apagar Auto*");
System.out.println("*2. Aumentar/Disminuir Velocidad*");
System.out.println("*3. Cargar Aceite/Gasolina*");
System.out.println("*4. Estado Del Auto*");
System.out.println("*5. Salir*");
System.out.print("Opción: "); opcion = sc.nextInt();
System.out.println();
System.out.println();
switch(opcion)
{
case 1:
if (OnA == false)
{
OnA = true;
System.out.println("El Auto Esta Encendido");
}
else if (OnA == true)
{
OnA = false;
System.out.println("El Auto Esta Apagado");

}
break;
case 2:
AumDismVel(OnA,Rapi);
break;
case 3:
if(OnA==true)
{
System.out.println("Apague El Auto Para Realizar Esta Acción");
}
else if(OnA==false)
{
System.out.println("Anote Los Galones De Gasolida Deseados: "); Gasolina = sc.nextInt();
System.out.println("Anote Los Litros De Aceite Deseados: "); Aceite = sc.nextInt();
System.out.println("Se Cargaron "+Gasolina+" Gal. De Gasolina Y "+Aceite+" Lts. De Aceite");
}
break;
case 4:
System.out.println("*** Este Es El Estado Del Auto ***");
if(OnA==false)
{
System.out.println("Marca: Honda");
System.out.println("Modelo: CRV");
System.out.println("Placa: P1234-8");
System.out.println("Color: Beige, Lineas Negras");
System.out.println("Año: 2006");
System.out.println("El Auto Esta Apagado Actualmente");
System.out.println("La Gasolina Actualmente Esta A Nivel De "+Gasolina+" Gal.");
System.out.println("El Aceite Actualmente Esta A Nivel De "+Aceite+" Lts.");
}
if(OnA==true)
{
System.out.println("Marca: Honda");
System.out.println("Modelo: CRV");
System.out.println("Placa: P1234-8");
System.out.println("Color: Beige, Lineas Negras");
System.out.println("Año: 2006");
System.out.println("El Auto Esta Encendido Actualmente");
System.out.println("La Velocidad Actual Es "+Rapi+" km/h");
System.out.println("La Gasolina Actualmente Esta A Nivel De "+Gasolina+" Gal.");
System.out.println("El Aceite Actualmente Esta A Nivel De "+Aceite+" Lts.");
}
break;
}
}
while(opcion!=5);
}
//El único método funcional, lo hice asi porque los métodos del pdf aun tengo que estudiarlos mejor
public static void AumDismVel(boolean OnA, int Rapi)
{
int VelA = 0, VelD = 0;
Scanner sc = new Scanner(System.in);
if(OnA==true)
{
if(VelA==0)
{
System.out.println("Ingrese La Velocidad A La Que Desea Aumentar Su Vehiculo: ");VelA = sc.nextInt();
Rapi=VelA;
System.out.println("La Velocidad Se Aumento a "+Rapi+" km/h");
}
if(VelA==250)
{
System.out.println("Ingrese La Velocidad Que Desea Disminuir, La Velocidad Actual Es De "+VelA+" km/h: "); VelD = sc.nextInt();
Rapi=VelA-VelD;
System.out.println("La Velocidad Se Disminuyo a "+Rapi+" km/h");
}
}
else if(OnA==false)
{
System.out.println("El Auto Esta Apagado, Verifique El Estado");
}
}
}
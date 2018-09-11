using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Input;
namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Hello I LOVE SAYLER!!!");
            Console.WriteLine("1 - give Heineken, 2 - give new Slayer album, 3 - give drugs, 4 - check");
            string choice = Console.ReadLine();
            Console.Read();
            if (choice == "1")
            {
                SlayerFun.nakormit();
                Console.WriteLine("I LOVE HEINEKEN!!!");
                Console.Read();
            }
            else if (choice == "2")
            {
                SlayerFun.newSlayerAlbum();
                Console.WriteLine("AAAA SLEEEER!!!");
                Console.Read();
            }
            else if (choice == "3")
            {
                SlayerFun.vulechit();
                Console.WriteLine("...");
                Console.Read();
            }
            else if (choice == "4")
            {
                Console.WriteLine("Health: ", SlayerFun.Health);
                Console.WriteLine("Hungriness: ", SlayerFun.Hungriness);
                Console.WriteLine("Happiness: ", SlayerFun.Happiness);
                Console.Read();
            }
            else //fool defence 
            {
                Console.WriteLine("AAA WRONG KEY YOU WERE JUST A WASTE OF SPERM");
                Console.Read();
            }



        }
    }

    public class SlayerFun
    {



        public static int Health = 100;
        public static int Hungriness = 100;
        public static int Happiness = 100;

        //methods 
        public static int nakormit()
        {
            return Hungriness = Hungriness + 10;
        }
        public static int newSlayerAlbum()
        {
            return Happiness = Happiness + 10;
        }
        public static int vulechit()
        {
            return Health = Health + 10;
        }

        public void voskresit()
        {
            Health = 100;
            Hungriness = 100;
            Happiness = 100;
        }

        public string checkstate()
        {

            if (Hungriness == 0 || Happiness == 0 || Health == 0)
            {
                return "Walking DEAD";
            }
            if (Hungriness < 20)
            {
                return "Hungry FOR YOUR BLOOD!!!(and Heineken)";
            }
            if (Health < 20)
            {
                return "FUCKIN SICK";
            }
            if (Happiness < 20)
            {
                return "WHERE IS FUCKIN SLAYER AAAA";
            }
            return "SSSLLLAAAYYYEEERRR!!!";
        }



    }



}
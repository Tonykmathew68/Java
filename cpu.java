class CPU
{
	int price=50000;

	class Processor
	{
		int cores=5;
		String manufacturer="Ryzen";
		void display1()
		{
		System.out.println("No:of cores are "+cores+" and manufactured by "+manufacturer);
		}
	}
	
	static class RAM
		{
			int memory=4;
			String manufacturer="Sandisk";
			void display2()
			{
			System.out.println("The memory space is "+memory+" and manufactured by "+manufacturer);
			}
		}
public static void main(String args[])
{
	CPU cpu=new CPU();
	CPU.Processor pro=cpu.new Processor();
	pro.display1();
	CPU.RAM ram=new CPU.RAM();
	ram.display2();
}
}

//Output:
//No:of cores are 5 and manufactured by Ryzen
//The memory space is 4 and manufactured by Sandisk


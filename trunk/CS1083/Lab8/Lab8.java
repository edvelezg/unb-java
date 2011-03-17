/**********************************************************************
Application: Lab8
	  Author: Steven Osborne
		 Date: March 3, 2011
Description: 

		Input: 
				
	  Output: 
**********************************************************************/

import java.io.*;		// Required for Scanner class

public class Lab8
{
	public static void main(String[] args) throws FileNotFoundException,
																 IOException,
																 ClassNotFoundException
	{
		int inputValue;
		FileInputStream inputFile = new FileInputStream("binary.dat");
		
		System.out.print(inputFile.read());
		
		while ( (inputValue = inputFile.read()) != -1)
		{
			System.out.print(", " + inputValue);
		}
		
		inputFile.close();

		inputFile = new FileInputStream("binary.dat");
		
		System.out.println();
		while ( (inputValue = inputFile.read()) != -1)
		{
			System.out.print((char)inputValue);
		}
		System.out.println();

		inputFile.close();
		
		ObjectOutputStream outputFile = new ObjectOutputStream(new FileOutputStream("output.dat"));
		outputFile.writeShort(32767);
		outputFile.writeShort(-1);
		outputFile.writeUTF("Steven Osborne");
		outputFile.writeBoolean(true);
		outputFile.writeChars("Steven Osborne");
		outputFile.writeBoolean(false);
		outputFile.writeObject("Steven Osborne");
		outputFile.writeObject(new Owner());
		outputFile.close();
		
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("output.dat"));
		short value = input.readShort();
		System.out.println(value);
		value = input.readShort();
		System.out.println(value);
		String utf = input.readUTF();
		System.out.println(utf);
		boolean bValue = input.readBoolean();
		System.out.println(bValue);
		char chars;
		for (int i = 0; i < 14; i++)
		{
			chars = input.readChar();
			System.out.print(chars);
		}
		System.out.println();
		bValue = input.readBoolean();
		System.out.println(bValue);
		String myName = (String)input.readObject();
		System.out.println(myName);
		Owner myOwner = (Owner)input.readObject();
		System.out.print(myOwner);
		input.close();
	}
}
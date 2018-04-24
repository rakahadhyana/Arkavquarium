import java.io.*;

public class ReadWrite {
    public void writeStateGuppy(LinkedList<Guppy> ListGuppy, String fileName) {
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            int idx = 0;
            while(idx < ListGuppy.getIdx()) {
                bufferedWriter.write(ListGuppy.get(idx).getX());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getY());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getPhase());
                bufferedWriter.newLine();  
                bufferedWriter.write(ListGuppy.get(idx).getDestX());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getDestY());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getFoodCounter());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getTime());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getDirection());
                bufferedWriter.newLine();
                idx++;
            }

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }

    public void writeStateCoins(LinkedList<Coins> ListCoins, String fileName) {
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            int idx = 0;
            while(idx < ListGuppy.getIdx()) {
                bufferedWriter.write(ListGuppy.get(idx).getX());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getY());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getValue());
                bufferedWriter.newLine();  
                idx++;
            }

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
    public void writeStateFood(LinkedList<Food> ListFood, String fileName) {
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            int idx = 0;
            while(idx < ListGuppy.getIdx()) {
                bufferedWriter.write(ListGuppy.get(idx).getX());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getY());
                bufferedWriter.newLine();
                idx++;
            }

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
    public void writeStatePiranha(LinkedList<Piranha> ListPiranha, String fileName) {
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            int idx = 0;
            while(idx < ListGuppy.getIdx()) {
                bufferedWriter.write(ListGuppy.get(idx).getX());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getY());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getDestX());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getDestY());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getSpeed());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getTime());
                bufferedWriter.newLine();
                bufferedWriter.write(ListGuppy.get(idx).getDirection());
                bufferedWriter.newLine();
                idx++;
            }

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
    public void writeStateMoney(int value, String fileName) {
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            bufferedWriter.write(value);
            bufferedWriter.newLine();
                

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
    public void readStateGuppy(LinkedList<Guppy> ListGuppy, String fileName) {
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                int X = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int Y = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int phase = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int DestX = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int DestY = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int foodCounter = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int time = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int direction = Integer.parseInt(data); 
                
                Guppy G = new Guppy(X, Y);
                G.setPhase(phase);
                G.setDest(DestX, DestY);
                G.setFoodCounter(foodCounter);
                G.setTime(time);
                G.setDirection(direction);
                ListGuppy.add(G);
            }

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
    public void readStateCoins(LinkedList<Coins> ListCoins, String fileName) {
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                int X = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int Y = Integer.parseInt(data);
                
                Coins C = new Coins(x, y, value);
                ListCoins.add(C);
            }

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
    public void readStateFood(LinkedList<Food> ListFood, String fileName) {
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                int X = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int Y = Integer.parseInt(data);
                
                Food F = new Food(x, y);
                ListFood.add(F);
            }

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
    public void readStatePiranha(LinkedList<Piranha> ListPiranha, String fileName) {
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                int X = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int Y = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int DestX = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int DestY = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int speed = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int time = Integer.parseInt(data);
                line = bufferedReader.readLine();
                int direction = Integer.parseInt(data); 
                
                Piranha P = new Piranha(X, Y);
                P.setDest(DestX, DestY);
                P.setSpeed(speed);
                P.setTime(time);
                P.setDirection(direction);
                ListPiranha.add(P);
            }

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
    public int readStateMoney(LinkedList<Money> ListMoney, String fileName) {
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            line = bufferedReader.readLine();
            int value = Integer.parseInt(data);
            
            Money M = new Money(value);
            ListMoney.add(M);
        
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
import java.io.*;
import java.lang.Math;

public class ReadWrite {
    public void writeStateGuppy(LinkedList<Guppy> ListGuppy, String fileName) {
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            System.out.println(ListGuppy.getIdx());
            int idx = 0;
            while(!ListGuppy.isEmpty() && idx < ListGuppy.getIdx()) {
                bufferedWriter.write(String.format("%f",ListGuppy.get(idx).getX()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%f",ListGuppy.get(idx).getY()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%d",ListGuppy.get(idx).getPhase()));
                bufferedWriter.newLine();  
                bufferedWriter.write(String.format("%f",ListGuppy.get(idx).getDestX()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%f",ListGuppy.get(idx).getDestY()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%d",ListGuppy.get(idx).getFoodCounter()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%d",ListGuppy.get(idx).getTime()));
                bufferedWriter.newLine();
                // bufferedWriter.write(ListGuppy.get(idx).getDirection().toString().split("Direction")[0].split(".")[0]);
                // bufferedWriter.newLine();
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
            while(!ListCoins.isEmpty() && idx < ListCoins.getIdx()) {
                bufferedWriter.write(String.format("%f",ListCoins.get(idx).getX()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%f",ListCoins.get(idx).getY()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%d",ListCoins.get(idx).getValue()));
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
            while(!ListFood.isEmpty() && idx < ListFood.getIdx()) {
                bufferedWriter.write(String.format("%f",ListFood.get(idx).getX()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%f",ListFood.get(idx).getY()));
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
            while(!ListPiranha.isEmpty() && idx < ListPiranha.getIdx()) {
                bufferedWriter.write(String.format("%f",ListPiranha.get(idx).getX()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%f",ListPiranha.get(idx).getY()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%f",ListPiranha.get(idx).getDestX()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%f",ListPiranha.get(idx).getDestY()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%f",ListPiranha.get(idx).getSpeed()));
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%d",ListPiranha.get(idx).getTime()));
                bufferedWriter.newLine();
                // bufferedWriter.write(ListPiranha.get(idx).getDirection().toString().split("Direction")[0].split(".")[0]);
                // bufferedWriter.newLine();
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

            bufferedWriter.write(String.format("%d", value));
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
    public void writeStateEgg(int value, String fileName) {
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            bufferedWriter.write(String.format("%d", value));
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
    public void writeStateEggPrice(int value, String fileName) {
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            bufferedWriter.write(String.format("%d", value));
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
                Double X = Double.parseDouble(line);
                line = bufferedReader.readLine();
                Double Y = Double.parseDouble(line);
                line = bufferedReader.readLine();
                int phase = Integer.parseInt(line);
                line = bufferedReader.readLine();
                Double DestX = Double.parseDouble(line);
                line = bufferedReader.readLine();
                Double DestY = Double.parseDouble(line);
                line = bufferedReader.readLine();
                int foodCounter = Integer.parseInt(line);
                line = bufferedReader.readLine();
                int time = Integer.parseInt(line);
                // line = bufferedReader.readLine();
                // String direction = line; 
                
                Guppy G = new Guppy();
                G.setX(X);
                G.setY(Y);
                G.setPhase(phase);
                G.setDest(DestX, DestY);
                G.setFoodCounter(foodCounter);
                G.setTime(time);
                // G.setDirection(Direction.valueOf(direction));
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
                Double X = Double.parseDouble(line);
                line = bufferedReader.readLine();
                Double Y = Double.parseDouble(line);
                line = bufferedReader.readLine();
                int value = Integer.parseInt(line);
                
                Coins C = new Coins(X, Y, value);
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
                Double X = Double.parseDouble(line);
                line = bufferedReader.readLine();
                Double Y = Double.parseDouble(line);
                
                Food F = new Food(X, Y);
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
                Double X = Double.parseDouble(line);
                line = bufferedReader.readLine();
                Double Y = Double.parseDouble(line);
                line = bufferedReader.readLine();
                Double DestX = Double.parseDouble(line);
                line = bufferedReader.readLine();
                Double DestY = Double.parseDouble(line);
                line = bufferedReader.readLine();
                Double speed = Double.parseDouble(line);
                line = bufferedReader.readLine();
                int time = Integer.parseInt(line);
                // line = bufferedReader.readLine();
                // String direction = line; 
                
                Piranha P = new Piranha();
                P.setX(X);
                P.setY(Y);
                P.setDest(DestX, DestY);
                P.setSpeed(speed);
                P.setTime(time);
                // P.setDirection(Direction.valueOf(direction));
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
    public int readStateMoney(String fileName) {
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
            int value = Integer.parseInt(line);
            
            // Always close files.
            bufferedReader.close();     
            return value;    
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
        return 0;
    }
    public int readStateEgg(String fileName) {
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
            int value = Integer.parseInt(line);
            
            // Always close files.
            bufferedReader.close();     
            return value;    
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
        return 0;
    }
    public int readStateEggPrice(String fileName) {
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
            int value = Integer.parseInt(line);
            
            // Always close files.
            bufferedReader.close();     
            return value;    
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
        return 0;
    }
}
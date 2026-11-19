//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String fileName = "Test.exe";
    ArrayList<Data> allData = new ArrayList<>();
    ArrayList<Data> allDataCopy = new ArrayList<>();
    for(int i = 0; i < 5; i++){
        allData.add(new Data());
    }

    System.out.println("Original allData");
    for(Data data : allData){
        System.out.println(data.toString());
    }

    new DataFileWriter(fileName, allData);

    DataFileReader reader = new DataFileReader();

    try{
        allDataCopy = reader.readData(fileName);

        System.out.println("Copy allData");

        for(Data data : allDataCopy){
            System.out.println(data.toString());
        }
    }   catch(Exception e){
        e.printStackTrace();
    }
}

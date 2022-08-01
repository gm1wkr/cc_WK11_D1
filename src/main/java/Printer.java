public class Printer {

    private int numberOfSheets;
    private int tonerVolume;


    public Printer(int numberOfSheets, int tonerVolume){
        this.numberOfSheets = numberOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }
    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public boolean hasEnoughPaper(int pagesToPrint, int numberOfCopies){
        return (pagesToPrint * numberOfCopies) < this.getNumberOfSheets();
    }

    public boolean hasEnoughToner(int pagesToPrint, int numberOfCopies) {
        return (pagesToPrint * numberOfCopies) < this.getTonerVolume();
    }


    public void print(int pagesToPrint, int numberOfCopies) {
        if (hasEnoughPaper(pagesToPrint ,numberOfCopies) && hasEnoughToner(pagesToPrint, numberOfCopies)){
            int sheetsToPrint = pagesToPrint * numberOfCopies;
            this.numberOfSheets -= sheetsToPrint;
            this.tonerVolume -= sheetsToPrint;
        }
    }

}

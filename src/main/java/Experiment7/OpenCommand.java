package Experiment7;

public class OpenCommand extends Command{
    private BoardScrean boardScrean;

    @Override
    public void excute(){
        boardScrean.open();
    }

    public OpenCommand(BoardScrean boardScrean){
        this.boardScrean=boardScrean;
    }
}

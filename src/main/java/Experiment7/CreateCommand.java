package Experiment7;

public class CreateCommand extends Command{
    private BoardScrean boardScrean;

    @Override
    public void excute(){
        boardScrean.create();
    }

    public CreateCommand(BoardScrean boardScrean){
        this.boardScrean=boardScrean;
    }
}

package Experiment7;
//
public class EditeCommand extends Command{
    private BoardScrean boardScrean;

    @Override
    public void excute(){
        boardScrean.edite();
    }

    public EditeCommand(BoardScrean boardScrean){
        this.boardScrean=boardScrean;
    }
}

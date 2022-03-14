import java.util.Comparator;

public class CompareGrid implements Comparator<Grid> {



    //* -1 if grid1 <  grid2
    //*  1 if grid1 >  grid2
    //*  0 if grid1 == grid2

    @Override
    public int compare(Grid grid1, Grid grid2) {
        return Integer.compare(grid1.Cost, grid2.Cost);
    }
}

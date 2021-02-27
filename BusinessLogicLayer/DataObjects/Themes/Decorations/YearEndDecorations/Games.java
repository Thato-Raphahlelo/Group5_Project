package BusinessLogicLayer.DataObjects.Themes.Decorations.YearEndDecorations;

import BusinessLogicLayer.Abstractions.YearEndDecor;

public class Games extends YearEndDecor {

    @Override
    public String getItemType() {

        return "Decoration";
    }

    @Override
    public String getItemName() {

        return "Games";
    }

    @Override
    public double getPrice() {

        return 49.99;
    }

}
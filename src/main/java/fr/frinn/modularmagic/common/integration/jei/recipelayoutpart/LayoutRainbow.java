package fr.frinn.modularmagic.common.integration.jei.recipelayoutpart;

import fr.frinn.modularmagic.common.integration.jei.ingredient.Rainbow;
import fr.frinn.modularmagic.common.integration.jei.render.RainbowRenderer;
import hellfirepvp.modularmachinery.common.integration.recipe.RecipeLayoutPart;
import java.awt.*;
import mezz.jei.api.ingredients.IIngredientRenderer;
import net.minecraft.client.Minecraft;

public class LayoutRainbow extends RecipeLayoutPart<Rainbow> {

    public LayoutRainbow(Point offset) {
        super(offset);
    }

    @Override
    public int getComponentWidth() {
        return 18;
    }

    @Override
    public int getComponentHeight() {
        return 18;
    }

    @Override
    public Class<Rainbow> getLayoutTypeClass() {
        return Rainbow.class;
    }

    @Override
    public IIngredientRenderer<Rainbow> provideIngredientRenderer() {
        return new RainbowRenderer();
    }

    @Override
    public int getRendererPaddingX() {
        return 0;
    }

    @Override
    public int getRendererPaddingY() {
        return 0;
    }

    @Override
    public int getMaxHorizontalCount() {
        return 1;
    }

    @Override
    public int getComponentHorizontalGap() {
        return 0;
    }

    @Override
    public int getComponentVerticalGap() {
        return 0;
    }

    @Override
    public int getComponentHorizontalSortingOrder() {
        return 0;
    }

    @Override
    public boolean canBeScaled() {
        return false;
    }

    @Override
    public void drawBackground(Minecraft mc) {

    }
}

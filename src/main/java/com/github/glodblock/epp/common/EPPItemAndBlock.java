package com.github.glodblock.epp.common;

import appeng.items.parts.PartItem;
import com.github.glodblock.epp.common.blocks.BlockExDrive;
import com.github.glodblock.epp.common.blocks.BlockExInterface;
import com.github.glodblock.epp.common.blocks.BlockExPatternProvider;
import com.github.glodblock.epp.common.blocks.BlockIngredientBuffer;
import com.github.glodblock.epp.common.blocks.BlockWirelessConnector;
import com.github.glodblock.epp.common.items.InfinityCell;
import com.github.glodblock.epp.common.items.ItemDriveUpgrade;
import com.github.glodblock.epp.common.items.ItemIOBusUpgrade;
import com.github.glodblock.epp.common.items.ItemInterfaceUpgrade;
import com.github.glodblock.epp.common.items.ItemMEPackingTape;
import com.github.glodblock.epp.common.items.ItemPackedDevice;
import com.github.glodblock.epp.common.items.ItemPatternAccessTerminalUpgrade;
import com.github.glodblock.epp.common.items.ItemPatternModifier;
import com.github.glodblock.epp.common.items.ItemPatternProviderUpgrade;
import com.github.glodblock.epp.common.items.ItemWirelessConnectTool;
import com.github.glodblock.epp.common.parts.PartExExportBus;
import com.github.glodblock.epp.common.parts.PartExImportBus;
import com.github.glodblock.epp.common.parts.PartExInterface;
import com.github.glodblock.epp.common.parts.PartExPatternAccessTerminal;
import com.github.glodblock.epp.common.parts.PartExPatternProvider;
import com.github.glodblock.epp.common.tileentities.TileExDrive;
import com.github.glodblock.epp.common.tileentities.TileExInterface;
import com.github.glodblock.epp.common.tileentities.TileExPatternProvider;
import com.github.glodblock.epp.common.tileentities.TileIngredientBuffer;
import com.github.glodblock.epp.common.tileentities.TileWirelessConnector;
import net.minecraft.world.item.Item;

public class EPPItemAndBlock {

    public static BlockExPatternProvider EX_PATTERN_PROVIDER;
    public static PartItem<PartExPatternProvider> EX_PATTERN_PROVIDER_PART;
    public static BlockExInterface EX_INTERFACE;
    public static PartItem<PartExInterface> EX_INTERFACE_PART;
    public static InfinityCell INFINITY_CELL;
    public static PartItem<PartExExportBus> EX_EXPORT_BUS;
    public static PartItem<PartExImportBus> EX_IMPORT_BUS;
    public static PartItem<PartExPatternAccessTerminal> EX_PATTERN_TERMINAL;
    public static ItemMEPackingTape PACKING_TAPE;
    public static ItemPackedDevice PACKAGE;
    public static ItemPatternProviderUpgrade PATTERN_PROVIDER_UPGRADE;
    public static ItemInterfaceUpgrade INTERFACE_UPGRADE;
    public static ItemIOBusUpgrade IO_BUS_UPGRADE;
    public static ItemPatternAccessTerminalUpgrade PATTERN_UPGRADE;
    public static BlockWirelessConnector WIRELESS_CONNECTOR;
    public static ItemWirelessConnectTool WIRELESS_TOOL;
    public static BlockIngredientBuffer INGREDIENT_BUFFER;
    public static BlockExDrive EX_DRIVE;
    public static ItemDriveUpgrade DRIVE_UPGRADE;
    public static ItemPatternModifier PATTERN_MODIFIER;

    public static void init(RegistryHandler regHandler) {
        EX_PATTERN_PROVIDER = new BlockExPatternProvider();
        EX_PATTERN_PROVIDER_PART = new PartItem<>(new Item.Properties(), PartExPatternProvider.class, PartExPatternProvider::new);
        EX_INTERFACE = new BlockExInterface();
        EX_INTERFACE_PART = new PartItem<>(new Item.Properties(), PartExInterface.class, PartExInterface::new);
        INFINITY_CELL = new InfinityCell();
        EX_EXPORT_BUS = new PartItem<>(new Item.Properties(), PartExExportBus.class, PartExExportBus::new);
        EX_IMPORT_BUS = new PartItem<>(new Item.Properties(), PartExImportBus.class, PartExImportBus::new);
        EX_PATTERN_TERMINAL = new PartItem<>(new Item.Properties(), PartExPatternAccessTerminal.class, PartExPatternAccessTerminal::new);
        PATTERN_PROVIDER_UPGRADE = new ItemPatternProviderUpgrade();
        INTERFACE_UPGRADE = new ItemInterfaceUpgrade();
        IO_BUS_UPGRADE = new ItemIOBusUpgrade();
        PATTERN_UPGRADE = new ItemPatternAccessTerminalUpgrade();
        PACKING_TAPE = new ItemMEPackingTape();
        PACKAGE = new ItemPackedDevice();
        WIRELESS_CONNECTOR = new BlockWirelessConnector();
        WIRELESS_TOOL = new ItemWirelessConnectTool();
        INGREDIENT_BUFFER = new BlockIngredientBuffer();
        EX_DRIVE = new BlockExDrive();
        DRIVE_UPGRADE = new ItemDriveUpgrade();
        PATTERN_MODIFIER = new ItemPatternModifier();
        regHandler.block("ex_pattern_provider", EX_PATTERN_PROVIDER, TileExPatternProvider.class, TileExPatternProvider::new);
        regHandler.block("ex_interface", EX_INTERFACE, TileExInterface.class, TileExInterface::new);
        regHandler.block("wireless_connect", WIRELESS_CONNECTOR, TileWirelessConnector.class, TileWirelessConnector::new);
        regHandler.block("ingredient_buffer", INGREDIENT_BUFFER, TileIngredientBuffer.class, TileIngredientBuffer::new);
        regHandler.block("ex_drive", EX_DRIVE, TileExDrive.class, TileExDrive::new);
        regHandler.item("ex_pattern_provider_part", EX_PATTERN_PROVIDER_PART);
        regHandler.item("ex_interface_part", EX_INTERFACE_PART);
        regHandler.item("infinity_cell", INFINITY_CELL);
        regHandler.item("ex_export_bus_part", EX_EXPORT_BUS);
        regHandler.item("ex_import_bus_part", EX_IMPORT_BUS);
        regHandler.item("ex_pattern_access_part", EX_PATTERN_TERMINAL);
        regHandler.item("pattern_provider_upgrade", PATTERN_PROVIDER_UPGRADE);
        regHandler.item("interface_upgrade", INTERFACE_UPGRADE);
        regHandler.item("io_bus_upgrade", IO_BUS_UPGRADE);
        regHandler.item("pattern_terminal_upgrade", PATTERN_UPGRADE);
        regHandler.item("me_packing_tape", PACKING_TAPE);
        regHandler.item("package", PACKAGE);
        regHandler.item("wireless_tool", WIRELESS_TOOL);
        regHandler.item("drive_upgrade", DRIVE_UPGRADE);
        regHandler.item("pattern_modifier", PATTERN_MODIFIER);
    }

}

package org.fundaciobit.pluginsib.exportdata;

import org.fundaciobit.pluginsib.core.v3.IPluginIB;

/**
 * 
 * @author anadal
 * 
 */
public interface IExportDataPlugin extends IPluginIB {

    /**
     * 
     * @return
     */
    public String getName();

    /**
     * 
     * @return
     */
    public ExportFile getIcon();

    /**
     * 
     * @param exportData
     * @return
     * @throws Exception
     */
    public ExportFile getExportFile(ExportData exportData) throws Exception;

}

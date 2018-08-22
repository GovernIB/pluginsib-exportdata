package org.fundaciobit.pluginsib.exportdata;

import org.fundaciobit.pluginsib.core.IPlugin;

/**
 * 
 * @author anadal
 * 
 */
public interface IExportDataPlugin extends IPlugin {

  public String getName();

  public ExportFile getIcon();

  public ExportFile getExportFile(ExportData exportData) throws Exception;

}

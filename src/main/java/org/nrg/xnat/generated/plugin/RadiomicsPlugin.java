package org.nrg.xnat.generated.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;

@XnatPlugin(value = "nrg_plugin_radiomics", name = "XNAT 1.7 Radiomics Plugin", description = "This is the XNAT 1.7 Radiomics Plugin.",
        dataModels = {@XnatDataModel(value = "radm:radiomics",
                singular = "Radiomics Data",
                plural = "Radiomics Data")})
public class RadiomicsPlugin {
}

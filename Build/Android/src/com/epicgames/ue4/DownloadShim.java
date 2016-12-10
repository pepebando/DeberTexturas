package com.epicgames.ue4;

import com.YourCompany.ProyectoTexturas.OBBDownloaderService;
import com.YourCompany.ProyectoTexturas.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}


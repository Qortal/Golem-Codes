/* SPDX-License-Identifier: GPL-2.0 */
/******************************************************************************
 *
 * Copyright(c) 2007 - 2017 Realtek Corporation.
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of version 2 of the GNU General Public License as
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 *****************************************************************************/
#ifndef __RTL8814A_DM_H__
#define __RTL8814A_DM_H__

void rtl8814_init_dm_priv(IN PADAPTER Adapter);
void rtl8814_deinit_dm_priv(IN PADAPTER Adapter);
void rtl8814_InitHalDm(IN PADAPTER Adapter);
void rtl8814_HalDmWatchDog(IN PADAPTER Adapter);

#endif

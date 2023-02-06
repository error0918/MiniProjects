package com.taeyeon.iconviewer.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.sharp.*
import androidx.compose.material.icons.twotone.*
import androidx.compose.ui.graphics.vector.ImageVector

data class IconData(
    val name: String,
    val filled: ImageVector,
    val outlined: ImageVector,
    val rounded: ImageVector,
    val sharp: ImageVector,
    val twoTone: ImageVector
) {
    companion object {
        val libraryList = listOf("All", "Core", "Extended")

        val material_icons_core = listOf(
            IconData(
                name = "AccountBox",
                filled = Icons.Filled.AccountBox,
                outlined = Icons.Outlined.AccountBox,
                rounded = Icons.Rounded.AccountBox,
                sharp = Icons.Sharp.AccountBox,
                twoTone = Icons.TwoTone.AccountBox
            ),
            IconData(
                name = "AccountCircle",
                filled = Icons.Filled.AccountCircle,
                outlined = Icons.Outlined.AccountCircle,
                rounded = Icons.Rounded.AccountCircle,
                sharp = Icons.Sharp.AccountCircle,
                twoTone = Icons.TwoTone.AccountCircle
            ),
            IconData(
                name = "Add",
                filled = Icons.Filled.Add,
                outlined = Icons.Outlined.Add,
                rounded = Icons.Rounded.Add,
                sharp = Icons.Sharp.Add,
                twoTone = Icons.TwoTone.Add
            ),
            IconData(
                name = "AddCircle",
                filled = Icons.Filled.AddCircle,
                outlined = Icons.Outlined.AddCircle,
                rounded = Icons.Rounded.AddCircle,
                sharp = Icons.Sharp.AddCircle,
                twoTone = Icons.TwoTone.AddCircle
            ),
            IconData(
                name = "ArrowBack",
                filled = Icons.Filled.ArrowBack,
                outlined = Icons.Outlined.ArrowBack,
                rounded = Icons.Rounded.ArrowBack,
                sharp = Icons.Sharp.ArrowBack,
                twoTone = Icons.TwoTone.ArrowBack
            ),
            IconData(
                name = "ArrowDropDown",
                filled = Icons.Filled.ArrowDropDown,
                outlined = Icons.Outlined.ArrowDropDown,
                rounded = Icons.Rounded.ArrowDropDown,
                sharp = Icons.Sharp.ArrowDropDown,
                twoTone = Icons.TwoTone.ArrowDropDown
            ),
            IconData(
                name = "ArrowForward",
                filled = Icons.Filled.ArrowForward,
                outlined = Icons.Outlined.ArrowForward,
                rounded = Icons.Rounded.ArrowForward,
                sharp = Icons.Sharp.ArrowForward,
                twoTone = Icons.TwoTone.ArrowForward
            ),
            IconData(
                name = "Build",
                filled = Icons.Filled.Build,
                outlined = Icons.Outlined.Build,
                rounded = Icons.Rounded.Build,
                sharp = Icons.Sharp.Build,
                twoTone = Icons.TwoTone.Build
            ),
            IconData(
                name = "Call",
                filled = Icons.Filled.Call,
                outlined = Icons.Outlined.Call,
                rounded = Icons.Rounded.Call,
                sharp = Icons.Sharp.Call,
                twoTone = Icons.TwoTone.Call
            ),
            IconData(
                name = "Check",
                filled = Icons.Filled.Check,
                outlined = Icons.Outlined.Check,
                rounded = Icons.Rounded.Check,
                sharp = Icons.Sharp.Check,
                twoTone = Icons.TwoTone.Check
            ),
            IconData(
                name = "CheckCircle",
                filled = Icons.Filled.CheckCircle,
                outlined = Icons.Outlined.CheckCircle,
                rounded = Icons.Rounded.CheckCircle,
                sharp = Icons.Sharp.CheckCircle,
                twoTone = Icons.TwoTone.CheckCircle
            ),
            IconData(
                name = "Clear",
                filled = Icons.Filled.Clear,
                outlined = Icons.Outlined.Clear,
                rounded = Icons.Rounded.Clear,
                sharp = Icons.Sharp.Clear,
                twoTone = Icons.TwoTone.Clear
            ),
            IconData(
                name = "Close",
                filled = Icons.Filled.Close,
                outlined = Icons.Outlined.Close,
                rounded = Icons.Rounded.Close,
                sharp = Icons.Sharp.Close,
                twoTone = Icons.TwoTone.Close
            ),
            IconData(
                name = "Create",
                filled = Icons.Filled.Create,
                outlined = Icons.Outlined.Create,
                rounded = Icons.Rounded.Create,
                sharp = Icons.Sharp.Create,
                twoTone = Icons.TwoTone.Create
            ),
            IconData(
                name = "DateRange",
                filled = Icons.Filled.DateRange,
                outlined = Icons.Outlined.DateRange,
                rounded = Icons.Rounded.DateRange,
                sharp = Icons.Sharp.DateRange,
                twoTone = Icons.TwoTone.DateRange
            ),
            IconData(
                name = "Delete",
                filled = Icons.Filled.Delete,
                outlined = Icons.Outlined.Delete,
                rounded = Icons.Rounded.Delete,
                sharp = Icons.Sharp.Delete,
                twoTone = Icons.TwoTone.Delete
            ),
            IconData(
                name = "Done",
                filled = Icons.Filled.Done,
                outlined = Icons.Outlined.Done,
                rounded = Icons.Rounded.Done,
                sharp = Icons.Sharp.Done,
                twoTone = Icons.TwoTone.Done
            ),
            IconData(
                name = "Edit",
                filled = Icons.Filled.Edit,
                outlined = Icons.Outlined.Edit,
                rounded = Icons.Rounded.Edit,
                sharp = Icons.Sharp.Edit,
                twoTone = Icons.TwoTone.Edit
            ),
            IconData(
                name = "Email",
                filled = Icons.Filled.Email,
                outlined = Icons.Outlined.Email,
                rounded = Icons.Rounded.Email,
                sharp = Icons.Sharp.Email,
                twoTone = Icons.TwoTone.Email
            ),
            IconData(
                name = "ExitToApp",
                filled = Icons.Filled.ExitToApp,
                outlined = Icons.Outlined.ExitToApp,
                rounded = Icons.Rounded.ExitToApp,
                sharp = Icons.Sharp.ExitToApp,
                twoTone = Icons.TwoTone.ExitToApp
            ),
            IconData(
                name = "Face",
                filled = Icons.Filled.Face,
                outlined = Icons.Outlined.Face,
                rounded = Icons.Rounded.Face,
                sharp = Icons.Sharp.Face,
                twoTone = Icons.TwoTone.Face
            ),
            IconData(
                name = "Favorite",
                filled = Icons.Filled.Favorite,
                outlined = Icons.Outlined.Favorite,
                rounded = Icons.Rounded.Favorite,
                sharp = Icons.Sharp.Favorite,
                twoTone = Icons.TwoTone.Favorite
            ),
            IconData(
                name = "FavoriteBorder",
                filled = Icons.Filled.FavoriteBorder,
                outlined = Icons.Outlined.FavoriteBorder,
                rounded = Icons.Rounded.FavoriteBorder,
                sharp = Icons.Sharp.FavoriteBorder,
                twoTone = Icons.TwoTone.FavoriteBorder
            ),
            IconData(
                name = "Home",
                filled = Icons.Filled.Home,
                outlined = Icons.Outlined.Home,
                rounded = Icons.Rounded.Home,
                sharp = Icons.Sharp.Home,
                twoTone = Icons.TwoTone.Home
            ),
            IconData(
                name = "Info",
                filled = Icons.Filled.Info,
                outlined = Icons.Outlined.Info,
                rounded = Icons.Rounded.Info,
                sharp = Icons.Sharp.Info,
                twoTone = Icons.TwoTone.Info
            ),
            IconData(
                name = "KeyboardArrowDown",
                filled = Icons.Filled.KeyboardArrowDown,
                outlined = Icons.Outlined.KeyboardArrowDown,
                rounded = Icons.Rounded.KeyboardArrowDown,
                sharp = Icons.Sharp.KeyboardArrowDown,
                twoTone = Icons.TwoTone.KeyboardArrowDown
            ),
            IconData(
                name = "KeyboardArrowLeft",
                filled = Icons.Filled.KeyboardArrowLeft,
                outlined = Icons.Outlined.KeyboardArrowLeft,
                rounded = Icons.Rounded.KeyboardArrowLeft,
                sharp = Icons.Sharp.KeyboardArrowLeft,
                twoTone = Icons.TwoTone.KeyboardArrowLeft
            ),
            IconData(
                name = "KeyboardArrowRight",
                filled = Icons.Filled.KeyboardArrowRight,
                outlined = Icons.Outlined.KeyboardArrowRight,
                rounded = Icons.Rounded.KeyboardArrowRight,
                sharp = Icons.Sharp.KeyboardArrowRight,
                twoTone = Icons.TwoTone.KeyboardArrowRight
            ),
            IconData(
                name = "KeyboardArrowUp",
                filled = Icons.Filled.KeyboardArrowUp,
                outlined = Icons.Outlined.KeyboardArrowUp,
                rounded = Icons.Rounded.KeyboardArrowUp,
                sharp = Icons.Sharp.KeyboardArrowUp,
                twoTone = Icons.TwoTone.KeyboardArrowUp
            ),
            IconData(
                name = "List",
                filled = Icons.Filled.List,
                outlined = Icons.Outlined.List,
                rounded = Icons.Rounded.List,
                sharp = Icons.Sharp.List,
                twoTone = Icons.TwoTone.List
            ),
            IconData(
                name = "LocationOn",
                filled = Icons.Filled.LocationOn,
                outlined = Icons.Outlined.LocationOn,
                rounded = Icons.Rounded.LocationOn,
                sharp = Icons.Sharp.LocationOn,
                twoTone = Icons.TwoTone.LocationOn
            ),
            IconData(
                name = "Lock",
                filled = Icons.Filled.Lock,
                outlined = Icons.Outlined.Lock,
                rounded = Icons.Rounded.Lock,
                sharp = Icons.Sharp.Lock,
                twoTone = Icons.TwoTone.Lock
            ),
            IconData(
                name = "MailOutline",
                filled = Icons.Filled.MailOutline,
                outlined = Icons.Outlined.MailOutline,
                rounded = Icons.Rounded.MailOutline,
                sharp = Icons.Sharp.MailOutline,
                twoTone = Icons.TwoTone.MailOutline
            ),
            IconData(
                name = "Menu",
                filled = Icons.Filled.Menu,
                outlined = Icons.Outlined.Menu,
                rounded = Icons.Rounded.Menu,
                sharp = Icons.Sharp.Menu,
                twoTone = Icons.TwoTone.Menu
            ),
            IconData(
                name = "MoreVert",
                filled = Icons.Filled.MoreVert,
                outlined = Icons.Outlined.MoreVert,
                rounded = Icons.Rounded.MoreVert,
                sharp = Icons.Sharp.MoreVert,
                twoTone = Icons.TwoTone.MoreVert
            ),
            IconData(
                name = "Notifications",
                filled = Icons.Filled.Notifications,
                outlined = Icons.Outlined.Notifications,
                rounded = Icons.Rounded.Notifications,
                sharp = Icons.Sharp.Notifications,
                twoTone = Icons.TwoTone.Notifications
            ),
            IconData(
                name = "Person",
                filled = Icons.Filled.Person,
                outlined = Icons.Outlined.Person,
                rounded = Icons.Rounded.Person,
                sharp = Icons.Sharp.Person,
                twoTone = Icons.TwoTone.Person
            ),
            IconData(
                name = "Phone",
                filled = Icons.Filled.Phone,
                outlined = Icons.Outlined.Phone,
                rounded = Icons.Rounded.Phone,
                sharp = Icons.Sharp.Phone,
                twoTone = Icons.TwoTone.Phone
            ),
            IconData(
                name = "Place",
                filled = Icons.Filled.Place,
                outlined = Icons.Outlined.Place,
                rounded = Icons.Rounded.Place,
                sharp = Icons.Sharp.Place,
                twoTone = Icons.TwoTone.Place
            ),
            IconData(
                name = "PlayArrow",
                filled = Icons.Filled.PlayArrow,
                outlined = Icons.Outlined.PlayArrow,
                rounded = Icons.Rounded.PlayArrow,
                sharp = Icons.Sharp.PlayArrow,
                twoTone = Icons.TwoTone.PlayArrow
            ),
            IconData(
                name = "Refresh",
                filled = Icons.Filled.Refresh,
                outlined = Icons.Outlined.Refresh,
                rounded = Icons.Rounded.Refresh,
                sharp = Icons.Sharp.Refresh,
                twoTone = Icons.TwoTone.Refresh
            ),
            IconData(
                name = "Search",
                filled = Icons.Filled.Search,
                outlined = Icons.Outlined.Search,
                rounded = Icons.Rounded.Search,
                sharp = Icons.Sharp.Search,
                twoTone = Icons.TwoTone.Search
            ),
            IconData(
                name = "Send",
                filled = Icons.Filled.Send,
                outlined = Icons.Outlined.Send,
                rounded = Icons.Rounded.Send,
                sharp = Icons.Sharp.Send,
                twoTone = Icons.TwoTone.Send
            ),
            IconData(
                name = "Settings",
                filled = Icons.Filled.Settings,
                outlined = Icons.Outlined.Settings,
                rounded = Icons.Rounded.Settings,
                sharp = Icons.Sharp.Settings,
                twoTone = Icons.TwoTone.Settings
            ),
            IconData(
                name = "Share",
                filled = Icons.Filled.Share,
                outlined = Icons.Outlined.Share,
                rounded = Icons.Rounded.Share,
                sharp = Icons.Sharp.Share,
                twoTone = Icons.TwoTone.Share
            ),
            IconData(
                name = "ShoppingCart",
                filled = Icons.Filled.ShoppingCart,
                outlined = Icons.Outlined.ShoppingCart,
                rounded = Icons.Rounded.ShoppingCart,
                sharp = Icons.Sharp.ShoppingCart,
                twoTone = Icons.TwoTone.ShoppingCart
            ),
            IconData(
                name = "Star",
                filled = Icons.Filled.Star,
                outlined = Icons.Outlined.Star,
                rounded = Icons.Rounded.Star,
                sharp = Icons.Sharp.Star,
                twoTone = Icons.TwoTone.Star
            ),
            IconData(
                name = "ThumbUp",
                filled = Icons.Filled.ThumbUp,
                outlined = Icons.Outlined.ThumbUp,
                rounded = Icons.Rounded.ThumbUp,
                sharp = Icons.Sharp.ThumbUp,
                twoTone = Icons.TwoTone.ThumbUp
            ),
            IconData(
                name = "Warning",
                filled = Icons.Filled.Warning,
                outlined = Icons.Outlined.Warning,
                rounded = Icons.Rounded.Warning,
                sharp = Icons.Sharp.Warning,
                twoTone = Icons.TwoTone.Warning
            )
        )
        val material_icons_extended = listOf(
            IconData(
                name = "AcUnit",
                filled = Icons.Filled.AcUnit,
                outlined = Icons.Outlined.AcUnit,
                rounded = Icons.Rounded.AcUnit,
                sharp = Icons.Sharp.AcUnit,
                twoTone = Icons.TwoTone.AcUnit
            ),
            IconData(
                name = "AccessAlarm",
                filled = Icons.Filled.AccessAlarm,
                outlined = Icons.Outlined.AccessAlarm,
                rounded = Icons.Rounded.AccessAlarm,
                sharp = Icons.Sharp.AccessAlarm,
                twoTone = Icons.TwoTone.AccessAlarm
            ),
            IconData(
                name = "AccessAlarms",
                filled = Icons.Filled.AccessAlarms,
                outlined = Icons.Outlined.AccessAlarms,
                rounded = Icons.Rounded.AccessAlarms,
                sharp = Icons.Sharp.AccessAlarms,
                twoTone = Icons.TwoTone.AccessAlarms
            ),
            IconData(
                name = "AccessTime",
                filled = Icons.Filled.AccessTime,
                outlined = Icons.Outlined.AccessTime,
                rounded = Icons.Rounded.AccessTime,
                sharp = Icons.Sharp.AccessTime,
                twoTone = Icons.TwoTone.AccessTime
            ),
            IconData(
                name = "Accessibility",
                filled = Icons.Filled.Accessibility,
                outlined = Icons.Outlined.Accessibility,
                rounded = Icons.Rounded.Accessibility,
                sharp = Icons.Sharp.Accessibility,
                twoTone = Icons.TwoTone.Accessibility
            ),
            IconData(
                name = "AccessibilityNew",
                filled = Icons.Filled.AccessibilityNew,
                outlined = Icons.Outlined.AccessibilityNew,
                rounded = Icons.Rounded.AccessibilityNew,
                sharp = Icons.Sharp.AccessibilityNew,
                twoTone = Icons.TwoTone.AccessibilityNew
            ),
            IconData(
                name = "Accessible",
                filled = Icons.Filled.Accessible,
                outlined = Icons.Outlined.Accessible,
                rounded = Icons.Rounded.Accessible,
                sharp = Icons.Sharp.Accessible,
                twoTone = Icons.TwoTone.Accessible
            ),
            IconData(
                name = "AccessibleForward",
                filled = Icons.Filled.AccessibleForward,
                outlined = Icons.Outlined.AccessibleForward,
                rounded = Icons.Rounded.AccessibleForward,
                sharp = Icons.Sharp.AccessibleForward,
                twoTone = Icons.TwoTone.AccessibleForward
            ),
            IconData(
                name = "AccountBalance",
                filled = Icons.Filled.AccountBalance,
                outlined = Icons.Outlined.AccountBalance,
                rounded = Icons.Rounded.AccountBalance,
                sharp = Icons.Sharp.AccountBalance,
                twoTone = Icons.TwoTone.AccountBalance
            ),
            IconData(
                name = "AccountBalanceWallet",
                filled = Icons.Filled.AccountBalanceWallet,
                outlined = Icons.Outlined.AccountBalanceWallet,
                rounded = Icons.Rounded.AccountBalanceWallet,
                sharp = Icons.Sharp.AccountBalanceWallet,
                twoTone = Icons.TwoTone.AccountBalanceWallet
            ),
            IconData(
                name = "AccountTree",
                filled = Icons.Filled.AccountTree,
                outlined = Icons.Outlined.AccountTree,
                rounded = Icons.Rounded.AccountTree,
                sharp = Icons.Sharp.AccountTree,
                twoTone = Icons.TwoTone.AccountTree
            ),
            IconData(
                name = "AdUnits",
                filled = Icons.Filled.AdUnits,
                outlined = Icons.Outlined.AdUnits,
                rounded = Icons.Rounded.AdUnits,
                sharp = Icons.Sharp.AdUnits,
                twoTone = Icons.TwoTone.AdUnits
            ),
            IconData(
                name = "Adb",
                filled = Icons.Filled.Adb,
                outlined = Icons.Outlined.Adb,
                rounded = Icons.Rounded.Adb,
                sharp = Icons.Sharp.Adb,
                twoTone = Icons.TwoTone.Adb
            ),
            IconData(
                name = "AddAPhoto",
                filled = Icons.Filled.AddAPhoto,
                outlined = Icons.Outlined.AddAPhoto,
                rounded = Icons.Rounded.AddAPhoto,
                sharp = Icons.Sharp.AddAPhoto,
                twoTone = Icons.TwoTone.AddAPhoto
            ),
            IconData(
                name = "AddAlarm",
                filled = Icons.Filled.AddAlarm,
                outlined = Icons.Outlined.AddAlarm,
                rounded = Icons.Rounded.AddAlarm,
                sharp = Icons.Sharp.AddAlarm,
                twoTone = Icons.TwoTone.AddAlarm
            ),
            IconData(
                name = "AddAlert",
                filled = Icons.Filled.AddAlert,
                outlined = Icons.Outlined.AddAlert,
                rounded = Icons.Rounded.AddAlert,
                sharp = Icons.Sharp.AddAlert,
                twoTone = Icons.TwoTone.AddAlert
            ),
            IconData(
                name = "AddBox",
                filled = Icons.Filled.AddBox,
                outlined = Icons.Outlined.AddBox,
                rounded = Icons.Rounded.AddBox,
                sharp = Icons.Sharp.AddBox,
                twoTone = Icons.TwoTone.AddBox
            ),
            IconData(
                name = "AddBusiness",
                filled = Icons.Filled.AddBusiness,
                outlined = Icons.Outlined.AddBusiness,
                rounded = Icons.Rounded.AddBusiness,
                sharp = Icons.Sharp.AddBusiness,
                twoTone = Icons.TwoTone.AddBusiness
            ),
            IconData(
                name = "AddCircleOutline",
                filled = Icons.Filled.AddCircleOutline,
                outlined = Icons.Outlined.AddCircleOutline,
                rounded = Icons.Rounded.AddCircleOutline,
                sharp = Icons.Sharp.AddCircleOutline,
                twoTone = Icons.TwoTone.AddCircleOutline
            ),
            IconData(
                name = "AddComment",
                filled = Icons.Filled.AddComment,
                outlined = Icons.Outlined.AddComment,
                rounded = Icons.Rounded.AddComment,
                sharp = Icons.Sharp.AddComment,
                twoTone = Icons.TwoTone.AddComment
            ),
            IconData(
                name = "AddIcCall",
                filled = Icons.Filled.AddIcCall,
                outlined = Icons.Outlined.AddIcCall,
                rounded = Icons.Rounded.AddIcCall,
                sharp = Icons.Sharp.AddIcCall,
                twoTone = Icons.TwoTone.AddIcCall
            ),
            IconData(
                name = "AddLocation",
                filled = Icons.Filled.AddLocation,
                outlined = Icons.Outlined.AddLocation,
                rounded = Icons.Rounded.AddLocation,
                sharp = Icons.Sharp.AddLocation,
                twoTone = Icons.TwoTone.AddLocation
            ),
            IconData(
                name = "AddLocationAlt",
                filled = Icons.Filled.AddLocationAlt,
                outlined = Icons.Outlined.AddLocationAlt,
                rounded = Icons.Rounded.AddLocationAlt,
                sharp = Icons.Sharp.AddLocationAlt,
                twoTone = Icons.TwoTone.AddLocationAlt
            ),
            IconData(
                name = "AddPhotoAlternate",
                filled = Icons.Filled.AddPhotoAlternate,
                outlined = Icons.Outlined.AddPhotoAlternate,
                rounded = Icons.Rounded.AddPhotoAlternate,
                sharp = Icons.Sharp.AddPhotoAlternate,
                twoTone = Icons.TwoTone.AddPhotoAlternate
            ),
            IconData(
                name = "AddRoad",
                filled = Icons.Filled.AddRoad,
                outlined = Icons.Outlined.AddRoad,
                rounded = Icons.Rounded.AddRoad,
                sharp = Icons.Sharp.AddRoad,
                twoTone = Icons.TwoTone.AddRoad
            ),
            IconData(
                name = "AddShoppingCart",
                filled = Icons.Filled.AddShoppingCart,
                outlined = Icons.Outlined.AddShoppingCart,
                rounded = Icons.Rounded.AddShoppingCart,
                sharp = Icons.Sharp.AddShoppingCart,
                twoTone = Icons.TwoTone.AddShoppingCart
            ),
            IconData(
                name = "AddTask",
                filled = Icons.Filled.AddTask,
                outlined = Icons.Outlined.AddTask,
                rounded = Icons.Rounded.AddTask,
                sharp = Icons.Sharp.AddTask,
                twoTone = Icons.TwoTone.AddTask
            ),
            IconData(
                name = "AddToHomeScreen",
                filled = Icons.Filled.AddToHomeScreen,
                outlined = Icons.Outlined.AddToHomeScreen,
                rounded = Icons.Rounded.AddToHomeScreen,
                sharp = Icons.Sharp.AddToHomeScreen,
                twoTone = Icons.TwoTone.AddToHomeScreen
            ),
            IconData(
                name = "AddToPhotos",
                filled = Icons.Filled.AddToPhotos,
                outlined = Icons.Outlined.AddToPhotos,
                rounded = Icons.Rounded.AddToPhotos,
                sharp = Icons.Sharp.AddToPhotos,
                twoTone = Icons.TwoTone.AddToPhotos
            ),
            IconData(
                name = "AddToQueue",
                filled = Icons.Filled.AddToQueue,
                outlined = Icons.Outlined.AddToQueue,
                rounded = Icons.Rounded.AddToQueue,
                sharp = Icons.Sharp.AddToQueue,
                twoTone = Icons.TwoTone.AddToQueue
            ),
            IconData(
                name = "Addchart",
                filled = Icons.Filled.Addchart,
                outlined = Icons.Outlined.Addchart,
                rounded = Icons.Rounded.Addchart,
                sharp = Icons.Sharp.Addchart,
                twoTone = Icons.TwoTone.Addchart
            ),
            IconData(
                name = "Adjust",
                filled = Icons.Filled.Adjust,
                outlined = Icons.Outlined.Adjust,
                rounded = Icons.Rounded.Adjust,
                sharp = Icons.Sharp.Adjust,
                twoTone = Icons.TwoTone.Adjust
            ),
            IconData(
                name = "AdminPanelSettings",
                filled = Icons.Filled.AdminPanelSettings,
                outlined = Icons.Outlined.AdminPanelSettings,
                rounded = Icons.Rounded.AdminPanelSettings,
                sharp = Icons.Sharp.AdminPanelSettings,
                twoTone = Icons.TwoTone.AdminPanelSettings
            ),
            IconData(
                name = "Agriculture",
                filled = Icons.Filled.Agriculture,
                outlined = Icons.Outlined.Agriculture,
                rounded = Icons.Rounded.Agriculture,
                sharp = Icons.Sharp.Agriculture,
                twoTone = Icons.TwoTone.Agriculture
            ),
            IconData(
                name = "AirlineSeatFlat",
                filled = Icons.Filled.AirlineSeatFlat,
                outlined = Icons.Outlined.AirlineSeatFlat,
                rounded = Icons.Rounded.AirlineSeatFlat,
                sharp = Icons.Sharp.AirlineSeatFlat,
                twoTone = Icons.TwoTone.AirlineSeatFlat
            ),
            IconData(
                name = "AirlineSeatFlatAngled",
                filled = Icons.Filled.AirlineSeatFlatAngled,
                outlined = Icons.Outlined.AirlineSeatFlatAngled,
                rounded = Icons.Rounded.AirlineSeatFlatAngled,
                sharp = Icons.Sharp.AirlineSeatFlatAngled,
                twoTone = Icons.TwoTone.AirlineSeatFlatAngled
            ),
            IconData(
                name = "AirlineSeatIndividualSuite",
                filled = Icons.Filled.AirlineSeatIndividualSuite,
                outlined = Icons.Outlined.AirlineSeatIndividualSuite,
                rounded = Icons.Rounded.AirlineSeatIndividualSuite,
                sharp = Icons.Sharp.AirlineSeatIndividualSuite,
                twoTone = Icons.TwoTone.AirlineSeatIndividualSuite
            ),
            IconData(
                name = "AirlineSeatLegroomExtra",
                filled = Icons.Filled.AirlineSeatLegroomExtra,
                outlined = Icons.Outlined.AirlineSeatLegroomExtra,
                rounded = Icons.Rounded.AirlineSeatLegroomExtra,
                sharp = Icons.Sharp.AirlineSeatLegroomExtra,
                twoTone = Icons.TwoTone.AirlineSeatLegroomExtra
            ),
            IconData(
                name = "AirlineSeatLegroomNormal",
                filled = Icons.Filled.AirlineSeatLegroomNormal,
                outlined = Icons.Outlined.AirlineSeatLegroomNormal,
                rounded = Icons.Rounded.AirlineSeatLegroomNormal,
                sharp = Icons.Sharp.AirlineSeatLegroomNormal,
                twoTone = Icons.TwoTone.AirlineSeatLegroomNormal
            ),
            IconData(
                name = "AirlineSeatLegroomReduced",
                filled = Icons.Filled.AirlineSeatLegroomReduced,
                outlined = Icons.Outlined.AirlineSeatLegroomReduced,
                rounded = Icons.Rounded.AirlineSeatLegroomReduced,
                sharp = Icons.Sharp.AirlineSeatLegroomReduced,
                twoTone = Icons.TwoTone.AirlineSeatLegroomReduced
            ),
            IconData(
                name = "AirlineSeatReclineExtra",
                filled = Icons.Filled.AirlineSeatReclineExtra,
                outlined = Icons.Outlined.AirlineSeatReclineExtra,
                rounded = Icons.Rounded.AirlineSeatReclineExtra,
                sharp = Icons.Sharp.AirlineSeatReclineExtra,
                twoTone = Icons.TwoTone.AirlineSeatReclineExtra
            ),
            IconData(
                name = "AirlineSeatReclineNormal",
                filled = Icons.Filled.AirlineSeatReclineNormal,
                outlined = Icons.Outlined.AirlineSeatReclineNormal,
                rounded = Icons.Rounded.AirlineSeatReclineNormal,
                sharp = Icons.Sharp.AirlineSeatReclineNormal,
                twoTone = Icons.TwoTone.AirlineSeatReclineNormal
            ),
            IconData(
                name = "AirplanemodeActive",
                filled = Icons.Filled.AirplanemodeActive,
                outlined = Icons.Outlined.AirplanemodeActive,
                rounded = Icons.Rounded.AirplanemodeActive,
                sharp = Icons.Sharp.AirplanemodeActive,
                twoTone = Icons.TwoTone.AirplanemodeActive
            ),
            IconData(
                name = "AirplanemodeInactive",
                filled = Icons.Filled.AirplanemodeInactive,
                outlined = Icons.Outlined.AirplanemodeInactive,
                rounded = Icons.Rounded.AirplanemodeInactive,
                sharp = Icons.Sharp.AirplanemodeInactive,
                twoTone = Icons.TwoTone.AirplanemodeInactive
            ),
            IconData(
                name = "Airplay",
                filled = Icons.Filled.Airplay,
                outlined = Icons.Outlined.Airplay,
                rounded = Icons.Rounded.Airplay,
                sharp = Icons.Sharp.Airplay,
                twoTone = Icons.TwoTone.Airplay
            ),
            IconData(
                name = "AirportShuttle",
                filled = Icons.Filled.AirportShuttle,
                outlined = Icons.Outlined.AirportShuttle,
                rounded = Icons.Rounded.AirportShuttle,
                sharp = Icons.Sharp.AirportShuttle,
                twoTone = Icons.TwoTone.AirportShuttle
            ),
            IconData(
                name = "Alarm",
                filled = Icons.Filled.Alarm,
                outlined = Icons.Outlined.Alarm,
                rounded = Icons.Rounded.Alarm,
                sharp = Icons.Sharp.Alarm,
                twoTone = Icons.TwoTone.Alarm
            ),
            IconData(
                name = "AlarmAdd",
                filled = Icons.Filled.AlarmAdd,
                outlined = Icons.Outlined.AlarmAdd,
                rounded = Icons.Rounded.AlarmAdd,
                sharp = Icons.Sharp.AlarmAdd,
                twoTone = Icons.TwoTone.AlarmAdd
            ),
            IconData(
                name = "AlarmOff",
                filled = Icons.Filled.AlarmOff,
                outlined = Icons.Outlined.AlarmOff,
                rounded = Icons.Rounded.AlarmOff,
                sharp = Icons.Sharp.AlarmOff,
                twoTone = Icons.TwoTone.AlarmOff
            ),
            IconData(
                name = "AlarmOn",
                filled = Icons.Filled.AlarmOn,
                outlined = Icons.Outlined.AlarmOn,
                rounded = Icons.Rounded.AlarmOn,
                sharp = Icons.Sharp.AlarmOn,
                twoTone = Icons.TwoTone.AlarmOn
            ),
            IconData(
                name = "Album",
                filled = Icons.Filled.Album,
                outlined = Icons.Outlined.Album,
                rounded = Icons.Rounded.Album,
                sharp = Icons.Sharp.Album,
                twoTone = Icons.TwoTone.Album
            ),
            IconData(
                name = "AlignHorizontalCenter",
                filled = Icons.Filled.AlignHorizontalCenter,
                outlined = Icons.Outlined.AlignHorizontalCenter,
                rounded = Icons.Rounded.AlignHorizontalCenter,
                sharp = Icons.Sharp.AlignHorizontalCenter,
                twoTone = Icons.TwoTone.AlignHorizontalCenter
            ),
            IconData(
                name = "AlignHorizontalLeft",
                filled = Icons.Filled.AlignHorizontalLeft,
                outlined = Icons.Outlined.AlignHorizontalLeft,
                rounded = Icons.Rounded.AlignHorizontalLeft,
                sharp = Icons.Sharp.AlignHorizontalLeft,
                twoTone = Icons.TwoTone.AlignHorizontalLeft
            ),
            IconData(
                name = "AlignHorizontalRight",
                filled = Icons.Filled.AlignHorizontalRight,
                outlined = Icons.Outlined.AlignHorizontalRight,
                rounded = Icons.Rounded.AlignHorizontalRight,
                sharp = Icons.Sharp.AlignHorizontalRight,
                twoTone = Icons.TwoTone.AlignHorizontalRight
            ),
            IconData(
                name = "AlignVerticalBottom",
                filled = Icons.Filled.AlignVerticalBottom,
                outlined = Icons.Outlined.AlignVerticalBottom,
                rounded = Icons.Rounded.AlignVerticalBottom,
                sharp = Icons.Sharp.AlignVerticalBottom,
                twoTone = Icons.TwoTone.AlignVerticalBottom
            ),
            IconData(
                name = "AlignVerticalCenter",
                filled = Icons.Filled.AlignVerticalCenter,
                outlined = Icons.Outlined.AlignVerticalCenter,
                rounded = Icons.Rounded.AlignVerticalCenter,
                sharp = Icons.Sharp.AlignVerticalCenter,
                twoTone = Icons.TwoTone.AlignVerticalCenter
            ),
            IconData(
                name = "AlignVerticalTop",
                filled = Icons.Filled.AlignVerticalTop,
                outlined = Icons.Outlined.AlignVerticalTop,
                rounded = Icons.Rounded.AlignVerticalTop,
                sharp = Icons.Sharp.AlignVerticalTop,
                twoTone = Icons.TwoTone.AlignVerticalTop
            ),
            IconData(
                name = "AllInbox",
                filled = Icons.Filled.AllInbox,
                outlined = Icons.Outlined.AllInbox,
                rounded = Icons.Rounded.AllInbox,
                sharp = Icons.Sharp.AllInbox,
                twoTone = Icons.TwoTone.AllInbox
            ),
            IconData(
                name = "AllInclusive",
                filled = Icons.Filled.AllInclusive,
                outlined = Icons.Outlined.AllInclusive,
                rounded = Icons.Rounded.AllInclusive,
                sharp = Icons.Sharp.AllInclusive,
                twoTone = Icons.TwoTone.AllInclusive
            ),
            IconData(
                name = "AllOut",
                filled = Icons.Filled.AllOut,
                outlined = Icons.Outlined.AllOut,
                rounded = Icons.Rounded.AllOut,
                sharp = Icons.Sharp.AllOut,
                twoTone = Icons.TwoTone.AllOut
            ),
            IconData(
                name = "AltRoute",
                filled = Icons.Filled.AltRoute,
                outlined = Icons.Outlined.AltRoute,
                rounded = Icons.Rounded.AltRoute,
                sharp = Icons.Sharp.AltRoute,
                twoTone = Icons.TwoTone.AltRoute
            ),
            IconData(
                name = "AlternateEmail",
                filled = Icons.Filled.AlternateEmail,
                outlined = Icons.Outlined.AlternateEmail,
                rounded = Icons.Rounded.AlternateEmail,
                sharp = Icons.Sharp.AlternateEmail,
                twoTone = Icons.TwoTone.AlternateEmail
            ),
            IconData(
                name = "AmpStories",
                filled = Icons.Filled.AmpStories,
                outlined = Icons.Outlined.AmpStories,
                rounded = Icons.Rounded.AmpStories,
                sharp = Icons.Sharp.AmpStories,
                twoTone = Icons.TwoTone.AmpStories
            ),
            IconData(
                name = "Analytics",
                filled = Icons.Filled.Analytics,
                outlined = Icons.Outlined.Analytics,
                rounded = Icons.Rounded.Analytics,
                sharp = Icons.Sharp.Analytics,
                twoTone = Icons.TwoTone.Analytics
            ),
            IconData(
                name = "Anchor",
                filled = Icons.Filled.Anchor,
                outlined = Icons.Outlined.Anchor,
                rounded = Icons.Rounded.Anchor,
                sharp = Icons.Sharp.Anchor,
                twoTone = Icons.TwoTone.Anchor
            ),
            IconData(
                name = "Android",
                filled = Icons.Filled.Android,
                outlined = Icons.Outlined.Android,
                rounded = Icons.Rounded.Android,
                sharp = Icons.Sharp.Android,
                twoTone = Icons.TwoTone.Android
            ),
            IconData(
                name = "Announcement",
                filled = Icons.Filled.Announcement,
                outlined = Icons.Outlined.Announcement,
                rounded = Icons.Rounded.Announcement,
                sharp = Icons.Sharp.Announcement,
                twoTone = Icons.TwoTone.Announcement
            ),
            IconData(
                name = "Apartment",
                filled = Icons.Filled.Apartment,
                outlined = Icons.Outlined.Apartment,
                rounded = Icons.Rounded.Apartment,
                sharp = Icons.Sharp.Apartment,
                twoTone = Icons.TwoTone.Apartment
            ),
            IconData(
                name = "Api",
                filled = Icons.Filled.Api,
                outlined = Icons.Outlined.Api,
                rounded = Icons.Rounded.Api,
                sharp = Icons.Sharp.Api,
                twoTone = Icons.TwoTone.Api
            ),
            IconData(
                name = "AppBlocking",
                filled = Icons.Filled.AppBlocking,
                outlined = Icons.Outlined.AppBlocking,
                rounded = Icons.Rounded.AppBlocking,
                sharp = Icons.Sharp.AppBlocking,
                twoTone = Icons.TwoTone.AppBlocking
            ),
            IconData(
                name = "AppSettingsAlt",
                filled = Icons.Filled.AppSettingsAlt,
                outlined = Icons.Outlined.AppSettingsAlt,
                rounded = Icons.Rounded.AppSettingsAlt,
                sharp = Icons.Sharp.AppSettingsAlt,
                twoTone = Icons.TwoTone.AppSettingsAlt
            ),
            IconData(
                name = "Apps",
                filled = Icons.Filled.Apps,
                outlined = Icons.Outlined.Apps,
                rounded = Icons.Rounded.Apps,
                sharp = Icons.Sharp.Apps,
                twoTone = Icons.TwoTone.Apps
            ),
            IconData(
                name = "Architecture",
                filled = Icons.Filled.Architecture,
                outlined = Icons.Outlined.Architecture,
                rounded = Icons.Rounded.Architecture,
                sharp = Icons.Sharp.Architecture,
                twoTone = Icons.TwoTone.Architecture
            ),
            IconData(
                name = "Archive",
                filled = Icons.Filled.Archive,
                outlined = Icons.Outlined.Archive,
                rounded = Icons.Rounded.Archive,
                sharp = Icons.Sharp.Archive,
                twoTone = Icons.TwoTone.Archive
            ),
            IconData(
                name = "ArrowBackIos",
                filled = Icons.Filled.ArrowBackIos,
                outlined = Icons.Outlined.ArrowBackIos,
                rounded = Icons.Rounded.ArrowBackIos,
                sharp = Icons.Sharp.ArrowBackIos,
                twoTone = Icons.TwoTone.ArrowBackIos
            ),
            IconData(
                name = "ArrowCircleDown",
                filled = Icons.Filled.ArrowCircleDown,
                outlined = Icons.Outlined.ArrowCircleDown,
                rounded = Icons.Rounded.ArrowCircleDown,
                sharp = Icons.Sharp.ArrowCircleDown,
                twoTone = Icons.TwoTone.ArrowCircleDown
            ),
            IconData(
                name = "ArrowCircleUp",
                filled = Icons.Filled.ArrowCircleUp,
                outlined = Icons.Outlined.ArrowCircleUp,
                rounded = Icons.Rounded.ArrowCircleUp,
                sharp = Icons.Sharp.ArrowCircleUp,
                twoTone = Icons.TwoTone.ArrowCircleUp
            ),
            IconData(
                name = "ArrowDownward",
                filled = Icons.Filled.ArrowDownward,
                outlined = Icons.Outlined.ArrowDownward,
                rounded = Icons.Rounded.ArrowDownward,
                sharp = Icons.Sharp.ArrowDownward,
                twoTone = Icons.TwoTone.ArrowDownward
            ),
            IconData(
                name = "ArrowDropDownCircle",
                filled = Icons.Filled.ArrowDropDownCircle,
                outlined = Icons.Outlined.ArrowDropDownCircle,
                rounded = Icons.Rounded.ArrowDropDownCircle,
                sharp = Icons.Sharp.ArrowDropDownCircle,
                twoTone = Icons.TwoTone.ArrowDropDownCircle
            ),
            IconData(
                name = "ArrowDropUp",
                filled = Icons.Filled.ArrowDropUp,
                outlined = Icons.Outlined.ArrowDropUp,
                rounded = Icons.Rounded.ArrowDropUp,
                sharp = Icons.Sharp.ArrowDropUp,
                twoTone = Icons.TwoTone.ArrowDropUp
            ),
            IconData(
                name = "ArrowForwardIos",
                filled = Icons.Filled.ArrowForwardIos,
                outlined = Icons.Outlined.ArrowForwardIos,
                rounded = Icons.Rounded.ArrowForwardIos,
                sharp = Icons.Sharp.ArrowForwardIos,
                twoTone = Icons.TwoTone.ArrowForwardIos
            ),
            IconData(
                name = "ArrowLeft",
                filled = Icons.Filled.ArrowLeft,
                outlined = Icons.Outlined.ArrowLeft,
                rounded = Icons.Rounded.ArrowLeft,
                sharp = Icons.Sharp.ArrowLeft,
                twoTone = Icons.TwoTone.ArrowLeft
            ),
            IconData(
                name = "ArrowRight",
                filled = Icons.Filled.ArrowRight,
                outlined = Icons.Outlined.ArrowRight,
                rounded = Icons.Rounded.ArrowRight,
                sharp = Icons.Sharp.ArrowRight,
                twoTone = Icons.TwoTone.ArrowRight
            ),
            IconData(
                name = "ArrowRightAlt",
                filled = Icons.Filled.ArrowRightAlt,
                outlined = Icons.Outlined.ArrowRightAlt,
                rounded = Icons.Rounded.ArrowRightAlt,
                sharp = Icons.Sharp.ArrowRightAlt,
                twoTone = Icons.TwoTone.ArrowRightAlt
            ),
            IconData(
                name = "ArrowUpward",
                filled = Icons.Filled.ArrowUpward,
                outlined = Icons.Outlined.ArrowUpward,
                rounded = Icons.Rounded.ArrowUpward,
                sharp = Icons.Sharp.ArrowUpward,
                twoTone = Icons.TwoTone.ArrowUpward
            ),
            IconData(
                name = "ArtTrack",
                filled = Icons.Filled.ArtTrack,
                outlined = Icons.Outlined.ArtTrack,
                rounded = Icons.Rounded.ArtTrack,
                sharp = Icons.Sharp.ArtTrack,
                twoTone = Icons.TwoTone.ArtTrack
            ),
            IconData(
                name = "Article",
                filled = Icons.Filled.Article,
                outlined = Icons.Outlined.Article,
                rounded = Icons.Rounded.Article,
                sharp = Icons.Sharp.Article,
                twoTone = Icons.TwoTone.Article
            ),
            IconData(
                name = "AspectRatio",
                filled = Icons.Filled.AspectRatio,
                outlined = Icons.Outlined.AspectRatio,
                rounded = Icons.Rounded.AspectRatio,
                sharp = Icons.Sharp.AspectRatio,
                twoTone = Icons.TwoTone.AspectRatio
            ),
            IconData(
                name = "Assessment",
                filled = Icons.Filled.Assessment,
                outlined = Icons.Outlined.Assessment,
                rounded = Icons.Rounded.Assessment,
                sharp = Icons.Sharp.Assessment,
                twoTone = Icons.TwoTone.Assessment
            ),
            IconData(
                name = "Assignment",
                filled = Icons.Filled.Assignment,
                outlined = Icons.Outlined.Assignment,
                rounded = Icons.Rounded.Assignment,
                sharp = Icons.Sharp.Assignment,
                twoTone = Icons.TwoTone.Assignment
            ),
            IconData(
                name = "AssignmentInd",
                filled = Icons.Filled.AssignmentInd,
                outlined = Icons.Outlined.AssignmentInd,
                rounded = Icons.Rounded.AssignmentInd,
                sharp = Icons.Sharp.AssignmentInd,
                twoTone = Icons.TwoTone.AssignmentInd
            ),
            IconData(
                name = "AssignmentLate",
                filled = Icons.Filled.AssignmentLate,
                outlined = Icons.Outlined.AssignmentLate,
                rounded = Icons.Rounded.AssignmentLate,
                sharp = Icons.Sharp.AssignmentLate,
                twoTone = Icons.TwoTone.AssignmentLate
            ),
            IconData(
                name = "AssignmentReturn",
                filled = Icons.Filled.AssignmentReturn,
                outlined = Icons.Outlined.AssignmentReturn,
                rounded = Icons.Rounded.AssignmentReturn,
                sharp = Icons.Sharp.AssignmentReturn,
                twoTone = Icons.TwoTone.AssignmentReturn
            ),
            IconData(
                name = "AssignmentReturned",
                filled = Icons.Filled.AssignmentReturned,
                outlined = Icons.Outlined.AssignmentReturned,
                rounded = Icons.Rounded.AssignmentReturned,
                sharp = Icons.Sharp.AssignmentReturned,
                twoTone = Icons.TwoTone.AssignmentReturned
            ),
            IconData(
                name = "AssignmentTurnedIn",
                filled = Icons.Filled.AssignmentTurnedIn,
                outlined = Icons.Outlined.AssignmentTurnedIn,
                rounded = Icons.Rounded.AssignmentTurnedIn,
                sharp = Icons.Sharp.AssignmentTurnedIn,
                twoTone = Icons.TwoTone.AssignmentTurnedIn
            ),
            IconData(
                name = "Assistant",
                filled = Icons.Filled.Assistant,
                outlined = Icons.Outlined.Assistant,
                rounded = Icons.Rounded.Assistant,
                sharp = Icons.Sharp.Assistant,
                twoTone = Icons.TwoTone.Assistant
            ),
            IconData(
                name = "AssistantPhoto",
                filled = Icons.Filled.AssistantPhoto,
                outlined = Icons.Outlined.AssistantPhoto,
                rounded = Icons.Rounded.AssistantPhoto,
                sharp = Icons.Sharp.AssistantPhoto,
                twoTone = Icons.TwoTone.AssistantPhoto
            ),
            IconData(
                name = "Atm",
                filled = Icons.Filled.Atm,
                outlined = Icons.Outlined.Atm,
                rounded = Icons.Rounded.Atm,
                sharp = Icons.Sharp.Atm,
                twoTone = Icons.TwoTone.Atm
            ),
            IconData(
                name = "AttachEmail",
                filled = Icons.Filled.AttachEmail,
                outlined = Icons.Outlined.AttachEmail,
                rounded = Icons.Rounded.AttachEmail,
                sharp = Icons.Sharp.AttachEmail,
                twoTone = Icons.TwoTone.AttachEmail
            ),
            IconData(
                name = "AttachFile",
                filled = Icons.Filled.AttachFile,
                outlined = Icons.Outlined.AttachFile,
                rounded = Icons.Rounded.AttachFile,
                sharp = Icons.Sharp.AttachFile,
                twoTone = Icons.TwoTone.AttachFile
            ),
            IconData(
                name = "AttachMoney",
                filled = Icons.Filled.AttachMoney,
                outlined = Icons.Outlined.AttachMoney,
                rounded = Icons.Rounded.AttachMoney,
                sharp = Icons.Sharp.AttachMoney,
                twoTone = Icons.TwoTone.AttachMoney
            ),
            IconData(
                name = "Attachment",
                filled = Icons.Filled.Attachment,
                outlined = Icons.Outlined.Attachment,
                rounded = Icons.Rounded.Attachment,
                sharp = Icons.Sharp.Attachment,
                twoTone = Icons.TwoTone.Attachment
            ),
            IconData(
                name = "Audiotrack",
                filled = Icons.Filled.Audiotrack,
                outlined = Icons.Outlined.Audiotrack,
                rounded = Icons.Rounded.Audiotrack,
                sharp = Icons.Sharp.Audiotrack,
                twoTone = Icons.TwoTone.Audiotrack
            ),
            IconData(
                name = "AutoDelete",
                filled = Icons.Filled.AutoDelete,
                outlined = Icons.Outlined.AutoDelete,
                rounded = Icons.Rounded.AutoDelete,
                sharp = Icons.Sharp.AutoDelete,
                twoTone = Icons.TwoTone.AutoDelete
            ),
            IconData(
                name = "Autorenew",
                filled = Icons.Filled.Autorenew,
                outlined = Icons.Outlined.Autorenew,
                rounded = Icons.Rounded.Autorenew,
                sharp = Icons.Sharp.Autorenew,
                twoTone = Icons.TwoTone.Autorenew
            ),
            IconData(
                name = "AvTimer",
                filled = Icons.Filled.AvTimer,
                outlined = Icons.Outlined.AvTimer,
                rounded = Icons.Rounded.AvTimer,
                sharp = Icons.Sharp.AvTimer,
                twoTone = Icons.TwoTone.AvTimer
            ),
            IconData(
                name = "BabyChangingStation",
                filled = Icons.Filled.BabyChangingStation,
                outlined = Icons.Outlined.BabyChangingStation,
                rounded = Icons.Rounded.BabyChangingStation,
                sharp = Icons.Sharp.BabyChangingStation,
                twoTone = Icons.TwoTone.BabyChangingStation
            ),
            IconData(
                name = "Backpack",
                filled = Icons.Filled.Backpack,
                outlined = Icons.Outlined.Backpack,
                rounded = Icons.Rounded.Backpack,
                sharp = Icons.Sharp.Backpack,
                twoTone = Icons.TwoTone.Backpack
            ),
            IconData(
                name = "Backspace",
                filled = Icons.Filled.Backspace,
                outlined = Icons.Outlined.Backspace,
                rounded = Icons.Rounded.Backspace,
                sharp = Icons.Sharp.Backspace,
                twoTone = Icons.TwoTone.Backspace
            ),
            IconData(
                name = "Backup",
                filled = Icons.Filled.Backup,
                outlined = Icons.Outlined.Backup,
                rounded = Icons.Rounded.Backup,
                sharp = Icons.Sharp.Backup,
                twoTone = Icons.TwoTone.Backup
            ),
            IconData(
                name = "BackupTable",
                filled = Icons.Filled.BackupTable,
                outlined = Icons.Outlined.BackupTable,
                rounded = Icons.Rounded.BackupTable,
                sharp = Icons.Sharp.BackupTable,
                twoTone = Icons.TwoTone.BackupTable
            ),
            IconData(
                name = "Ballot",
                filled = Icons.Filled.Ballot,
                outlined = Icons.Outlined.Ballot,
                rounded = Icons.Rounded.Ballot,
                sharp = Icons.Sharp.Ballot,
                twoTone = Icons.TwoTone.Ballot
            ),
            IconData(
                name = "BarChart",
                filled = Icons.Filled.BarChart,
                outlined = Icons.Outlined.BarChart,
                rounded = Icons.Rounded.BarChart,
                sharp = Icons.Sharp.BarChart,
                twoTone = Icons.TwoTone.BarChart
            ),
            IconData(
                name = "BatchPrediction",
                filled = Icons.Filled.BatchPrediction,
                outlined = Icons.Outlined.BatchPrediction,
                rounded = Icons.Rounded.BatchPrediction,
                sharp = Icons.Sharp.BatchPrediction,
                twoTone = Icons.TwoTone.BatchPrediction
            ),
            IconData(
                name = "Bathtub",
                filled = Icons.Filled.Bathtub,
                outlined = Icons.Outlined.Bathtub,
                rounded = Icons.Rounded.Bathtub,
                sharp = Icons.Sharp.Bathtub,
                twoTone = Icons.TwoTone.Bathtub
            ),
            IconData(
                name = "BatteryAlert",
                filled = Icons.Filled.BatteryAlert,
                outlined = Icons.Outlined.BatteryAlert,
                rounded = Icons.Rounded.BatteryAlert,
                sharp = Icons.Sharp.BatteryAlert,
                twoTone = Icons.TwoTone.BatteryAlert
            ),
            IconData(
                name = "BatteryChargingFull",
                filled = Icons.Filled.BatteryChargingFull,
                outlined = Icons.Outlined.BatteryChargingFull,
                rounded = Icons.Rounded.BatteryChargingFull,
                sharp = Icons.Sharp.BatteryChargingFull,
                twoTone = Icons.TwoTone.BatteryChargingFull
            ),
            IconData(
                name = "BatteryFull",
                filled = Icons.Filled.BatteryFull,
                outlined = Icons.Outlined.BatteryFull,
                rounded = Icons.Rounded.BatteryFull,
                sharp = Icons.Sharp.BatteryFull,
                twoTone = Icons.TwoTone.BatteryFull
            ),
            IconData(
                name = "BatteryStd",
                filled = Icons.Filled.BatteryStd,
                outlined = Icons.Outlined.BatteryStd,
                rounded = Icons.Rounded.BatteryStd,
                sharp = Icons.Sharp.BatteryStd,
                twoTone = Icons.TwoTone.BatteryStd
            ),
            IconData(
                name = "BatteryUnknown",
                filled = Icons.Filled.BatteryUnknown,
                outlined = Icons.Outlined.BatteryUnknown,
                rounded = Icons.Rounded.BatteryUnknown,
                sharp = Icons.Sharp.BatteryUnknown,
                twoTone = Icons.TwoTone.BatteryUnknown
            ),
            IconData(
                name = "BeachAccess",
                filled = Icons.Filled.BeachAccess,
                outlined = Icons.Outlined.BeachAccess,
                rounded = Icons.Rounded.BeachAccess,
                sharp = Icons.Sharp.BeachAccess,
                twoTone = Icons.TwoTone.BeachAccess
            ),
            IconData(
                name = "Bedtime",
                filled = Icons.Filled.Bedtime,
                outlined = Icons.Outlined.Bedtime,
                rounded = Icons.Rounded.Bedtime,
                sharp = Icons.Sharp.Bedtime,
                twoTone = Icons.TwoTone.Bedtime
            ),
            IconData(
                name = "Beenhere",
                filled = Icons.Filled.Beenhere,
                outlined = Icons.Outlined.Beenhere,
                rounded = Icons.Rounded.Beenhere,
                sharp = Icons.Sharp.Beenhere,
                twoTone = Icons.TwoTone.Beenhere
            ),
            IconData(
                name = "Bento",
                filled = Icons.Filled.Bento,
                outlined = Icons.Outlined.Bento,
                rounded = Icons.Rounded.Bento,
                sharp = Icons.Sharp.Bento,
                twoTone = Icons.TwoTone.Bento
            ),
            IconData(
                name = "BikeScooter",
                filled = Icons.Filled.BikeScooter,
                outlined = Icons.Outlined.BikeScooter,
                rounded = Icons.Rounded.BikeScooter,
                sharp = Icons.Sharp.BikeScooter,
                twoTone = Icons.TwoTone.BikeScooter
            ),
            IconData(
                name = "Biotech",
                filled = Icons.Filled.Biotech,
                outlined = Icons.Outlined.Biotech,
                rounded = Icons.Rounded.Biotech,
                sharp = Icons.Sharp.Biotech,
                twoTone = Icons.TwoTone.Biotech
            ),
            IconData(
                name = "Block",
                filled = Icons.Filled.Block,
                outlined = Icons.Outlined.Block,
                rounded = Icons.Rounded.Block,
                sharp = Icons.Sharp.Block,
                twoTone = Icons.TwoTone.Block
            ),
            IconData(
                name = "Bluetooth",
                filled = Icons.Filled.Bluetooth,
                outlined = Icons.Outlined.Bluetooth,
                rounded = Icons.Rounded.Bluetooth,
                sharp = Icons.Sharp.Bluetooth,
                twoTone = Icons.TwoTone.Bluetooth
            ),
            IconData(
                name = "BluetoothAudio",
                filled = Icons.Filled.BluetoothAudio,
                outlined = Icons.Outlined.BluetoothAudio,
                rounded = Icons.Rounded.BluetoothAudio,
                sharp = Icons.Sharp.BluetoothAudio,
                twoTone = Icons.TwoTone.BluetoothAudio
            ),
            IconData(
                name = "BluetoothConnected",
                filled = Icons.Filled.BluetoothConnected,
                outlined = Icons.Outlined.BluetoothConnected,
                rounded = Icons.Rounded.BluetoothConnected,
                sharp = Icons.Sharp.BluetoothConnected,
                twoTone = Icons.TwoTone.BluetoothConnected
            ),
            IconData(
                name = "BluetoothDisabled",
                filled = Icons.Filled.BluetoothDisabled,
                outlined = Icons.Outlined.BluetoothDisabled,
                rounded = Icons.Rounded.BluetoothDisabled,
                sharp = Icons.Sharp.BluetoothDisabled,
                twoTone = Icons.TwoTone.BluetoothDisabled
            ),
            IconData(
                name = "BluetoothSearching",
                filled = Icons.Filled.BluetoothSearching,
                outlined = Icons.Outlined.BluetoothSearching,
                rounded = Icons.Rounded.BluetoothSearching,
                sharp = Icons.Sharp.BluetoothSearching,
                twoTone = Icons.TwoTone.BluetoothSearching
            ),
            IconData(
                name = "BlurCircular",
                filled = Icons.Filled.BlurCircular,
                outlined = Icons.Outlined.BlurCircular,
                rounded = Icons.Rounded.BlurCircular,
                sharp = Icons.Sharp.BlurCircular,
                twoTone = Icons.TwoTone.BlurCircular
            ),
            IconData(
                name = "BlurLinear",
                filled = Icons.Filled.BlurLinear,
                outlined = Icons.Outlined.BlurLinear,
                rounded = Icons.Rounded.BlurLinear,
                sharp = Icons.Sharp.BlurLinear,
                twoTone = Icons.TwoTone.BlurLinear
            ),
            IconData(
                name = "BlurOff",
                filled = Icons.Filled.BlurOff,
                outlined = Icons.Outlined.BlurOff,
                rounded = Icons.Rounded.BlurOff,
                sharp = Icons.Sharp.BlurOff,
                twoTone = Icons.TwoTone.BlurOff
            ),
            IconData(
                name = "BlurOn",
                filled = Icons.Filled.BlurOn,
                outlined = Icons.Outlined.BlurOn,
                rounded = Icons.Rounded.BlurOn,
                sharp = Icons.Sharp.BlurOn,
                twoTone = Icons.TwoTone.BlurOn
            ),
            IconData(
                name = "Book",
                filled = Icons.Filled.Book,
                outlined = Icons.Outlined.Book,
                rounded = Icons.Rounded.Book,
                sharp = Icons.Sharp.Book,
                twoTone = Icons.TwoTone.Book
            ),
            IconData(
                name = "BookOnline",
                filled = Icons.Filled.BookOnline,
                outlined = Icons.Outlined.BookOnline,
                rounded = Icons.Rounded.BookOnline,
                sharp = Icons.Sharp.BookOnline,
                twoTone = Icons.TwoTone.BookOnline
            ),
            IconData(
                name = "Bookmark",
                filled = Icons.Filled.Bookmark,
                outlined = Icons.Outlined.Bookmark,
                rounded = Icons.Rounded.Bookmark,
                sharp = Icons.Sharp.Bookmark,
                twoTone = Icons.TwoTone.Bookmark
            ),
            IconData(
                name = "BookmarkBorder",
                filled = Icons.Filled.BookmarkBorder,
                outlined = Icons.Outlined.BookmarkBorder,
                rounded = Icons.Rounded.BookmarkBorder,
                sharp = Icons.Sharp.BookmarkBorder,
                twoTone = Icons.TwoTone.BookmarkBorder
            ),
            IconData(
                name = "Bookmarks",
                filled = Icons.Filled.Bookmarks,
                outlined = Icons.Outlined.Bookmarks,
                rounded = Icons.Rounded.Bookmarks,
                sharp = Icons.Sharp.Bookmarks,
                twoTone = Icons.TwoTone.Bookmarks
            ),
            IconData(
                name = "BorderAll",
                filled = Icons.Filled.BorderAll,
                outlined = Icons.Outlined.BorderAll,
                rounded = Icons.Rounded.BorderAll,
                sharp = Icons.Sharp.BorderAll,
                twoTone = Icons.TwoTone.BorderAll
            ),
            IconData(
                name = "BorderBottom",
                filled = Icons.Filled.BorderBottom,
                outlined = Icons.Outlined.BorderBottom,
                rounded = Icons.Rounded.BorderBottom,
                sharp = Icons.Sharp.BorderBottom,
                twoTone = Icons.TwoTone.BorderBottom
            ),
            IconData(
                name = "BorderClear",
                filled = Icons.Filled.BorderClear,
                outlined = Icons.Outlined.BorderClear,
                rounded = Icons.Rounded.BorderClear,
                sharp = Icons.Sharp.BorderClear,
                twoTone = Icons.TwoTone.BorderClear
            ),
            IconData(
                name = "BorderHorizontal",
                filled = Icons.Filled.BorderHorizontal,
                outlined = Icons.Outlined.BorderHorizontal,
                rounded = Icons.Rounded.BorderHorizontal,
                sharp = Icons.Sharp.BorderHorizontal,
                twoTone = Icons.TwoTone.BorderHorizontal
            ),
            IconData(
                name = "BorderInner",
                filled = Icons.Filled.BorderInner,
                outlined = Icons.Outlined.BorderInner,
                rounded = Icons.Rounded.BorderInner,
                sharp = Icons.Sharp.BorderInner,
                twoTone = Icons.TwoTone.BorderInner
            ),
            IconData(
                name = "BorderLeft",
                filled = Icons.Filled.BorderLeft,
                outlined = Icons.Outlined.BorderLeft,
                rounded = Icons.Rounded.BorderLeft,
                sharp = Icons.Sharp.BorderLeft,
                twoTone = Icons.TwoTone.BorderLeft
            ),
            IconData(
                name = "BorderOuter",
                filled = Icons.Filled.BorderOuter,
                outlined = Icons.Outlined.BorderOuter,
                rounded = Icons.Rounded.BorderOuter,
                sharp = Icons.Sharp.BorderOuter,
                twoTone = Icons.TwoTone.BorderOuter
            ),
            IconData(
                name = "BorderRight",
                filled = Icons.Filled.BorderRight,
                outlined = Icons.Outlined.BorderRight,
                rounded = Icons.Rounded.BorderRight,
                sharp = Icons.Sharp.BorderRight,
                twoTone = Icons.TwoTone.BorderRight
            ),
            IconData(
                name = "BorderStyle",
                filled = Icons.Filled.BorderStyle,
                outlined = Icons.Outlined.BorderStyle,
                rounded = Icons.Rounded.BorderStyle,
                sharp = Icons.Sharp.BorderStyle,
                twoTone = Icons.TwoTone.BorderStyle
            ),
            IconData(
                name = "BorderTop",
                filled = Icons.Filled.BorderTop,
                outlined = Icons.Outlined.BorderTop,
                rounded = Icons.Rounded.BorderTop,
                sharp = Icons.Sharp.BorderTop,
                twoTone = Icons.TwoTone.BorderTop
            ),
            IconData(
                name = "BorderVertical",
                filled = Icons.Filled.BorderVertical,
                outlined = Icons.Outlined.BorderVertical,
                rounded = Icons.Rounded.BorderVertical,
                sharp = Icons.Sharp.BorderVertical,
                twoTone = Icons.TwoTone.BorderVertical
            ),
            IconData(
                name = "BrandingWatermark",
                filled = Icons.Filled.BrandingWatermark,
                outlined = Icons.Outlined.BrandingWatermark,
                rounded = Icons.Rounded.BrandingWatermark,
                sharp = Icons.Sharp.BrandingWatermark,
                twoTone = Icons.TwoTone.BrandingWatermark
            ),
            IconData(
                name = "Brightness1",
                filled = Icons.Filled.Brightness1,
                outlined = Icons.Outlined.Brightness1,
                rounded = Icons.Rounded.Brightness1,
                sharp = Icons.Sharp.Brightness1,
                twoTone = Icons.TwoTone.Brightness1
            ),
            IconData(
                name = "Brightness2",
                filled = Icons.Filled.Brightness2,
                outlined = Icons.Outlined.Brightness2,
                rounded = Icons.Rounded.Brightness2,
                sharp = Icons.Sharp.Brightness2,
                twoTone = Icons.TwoTone.Brightness2
            ),
            IconData(
                name = "Brightness3",
                filled = Icons.Filled.Brightness3,
                outlined = Icons.Outlined.Brightness3,
                rounded = Icons.Rounded.Brightness3,
                sharp = Icons.Sharp.Brightness3,
                twoTone = Icons.TwoTone.Brightness3
            ),
            IconData(
                name = "Brightness4",
                filled = Icons.Filled.Brightness4,
                outlined = Icons.Outlined.Brightness4,
                rounded = Icons.Rounded.Brightness4,
                sharp = Icons.Sharp.Brightness4,
                twoTone = Icons.TwoTone.Brightness4
            ),
            IconData(
                name = "Brightness5",
                filled = Icons.Filled.Brightness5,
                outlined = Icons.Outlined.Brightness5,
                rounded = Icons.Rounded.Brightness5,
                sharp = Icons.Sharp.Brightness5,
                twoTone = Icons.TwoTone.Brightness5
            ),
            IconData(
                name = "Brightness6",
                filled = Icons.Filled.Brightness6,
                outlined = Icons.Outlined.Brightness6,
                rounded = Icons.Rounded.Brightness6,
                sharp = Icons.Sharp.Brightness6,
                twoTone = Icons.TwoTone.Brightness6
            ),
            IconData(
                name = "Brightness7",
                filled = Icons.Filled.Brightness7,
                outlined = Icons.Outlined.Brightness7,
                rounded = Icons.Rounded.Brightness7,
                sharp = Icons.Sharp.Brightness7,
                twoTone = Icons.TwoTone.Brightness7
            ),
            IconData(
                name = "BrightnessAuto",
                filled = Icons.Filled.BrightnessAuto,
                outlined = Icons.Outlined.BrightnessAuto,
                rounded = Icons.Rounded.BrightnessAuto,
                sharp = Icons.Sharp.BrightnessAuto,
                twoTone = Icons.TwoTone.BrightnessAuto
            ),
            IconData(
                name = "BrightnessHigh",
                filled = Icons.Filled.BrightnessHigh,
                outlined = Icons.Outlined.BrightnessHigh,
                rounded = Icons.Rounded.BrightnessHigh,
                sharp = Icons.Sharp.BrightnessHigh,
                twoTone = Icons.TwoTone.BrightnessHigh
            ),
            IconData(
                name = "BrightnessLow",
                filled = Icons.Filled.BrightnessLow,
                outlined = Icons.Outlined.BrightnessLow,
                rounded = Icons.Rounded.BrightnessLow,
                sharp = Icons.Sharp.BrightnessLow,
                twoTone = Icons.TwoTone.BrightnessLow
            ),
            IconData(
                name = "BrightnessMedium",
                filled = Icons.Filled.BrightnessMedium,
                outlined = Icons.Outlined.BrightnessMedium,
                rounded = Icons.Rounded.BrightnessMedium,
                sharp = Icons.Sharp.BrightnessMedium,
                twoTone = Icons.TwoTone.BrightnessMedium
            ),
            IconData(
                name = "BrokenImage",
                filled = Icons.Filled.BrokenImage,
                outlined = Icons.Outlined.BrokenImage,
                rounded = Icons.Rounded.BrokenImage,
                sharp = Icons.Sharp.BrokenImage,
                twoTone = Icons.TwoTone.BrokenImage
            ),
            IconData(
                name = "BrowserNotSupported",
                filled = Icons.Filled.BrowserNotSupported,
                outlined = Icons.Outlined.BrowserNotSupported,
                rounded = Icons.Rounded.BrowserNotSupported,
                sharp = Icons.Sharp.BrowserNotSupported,
                twoTone = Icons.TwoTone.BrowserNotSupported
            ),
            IconData(
                name = "Brush",
                filled = Icons.Filled.Brush,
                outlined = Icons.Outlined.Brush,
                rounded = Icons.Rounded.Brush,
                sharp = Icons.Sharp.Brush,
                twoTone = Icons.TwoTone.Brush
            ),
            IconData(
                name = "BubbleChart",
                filled = Icons.Filled.BubbleChart,
                outlined = Icons.Outlined.BubbleChart,
                rounded = Icons.Rounded.BubbleChart,
                sharp = Icons.Sharp.BubbleChart,
                twoTone = Icons.TwoTone.BubbleChart
            ),
            IconData(
                name = "BugReport",
                filled = Icons.Filled.BugReport,
                outlined = Icons.Outlined.BugReport,
                rounded = Icons.Rounded.BugReport,
                sharp = Icons.Sharp.BugReport,
                twoTone = Icons.TwoTone.BugReport
            ),
            IconData(
                name = "BuildCircle",
                filled = Icons.Filled.BuildCircle,
                outlined = Icons.Outlined.BuildCircle,
                rounded = Icons.Rounded.BuildCircle,
                sharp = Icons.Sharp.BuildCircle,
                twoTone = Icons.TwoTone.BuildCircle
            ),
            IconData(
                name = "BurstMode",
                filled = Icons.Filled.BurstMode,
                outlined = Icons.Outlined.BurstMode,
                rounded = Icons.Rounded.BurstMode,
                sharp = Icons.Sharp.BurstMode,
                twoTone = Icons.TwoTone.BurstMode
            ),
            IconData(
                name = "Business",
                filled = Icons.Filled.Business,
                outlined = Icons.Outlined.Business,
                rounded = Icons.Rounded.Business,
                sharp = Icons.Sharp.Business,
                twoTone = Icons.TwoTone.Business
            ),
            IconData(
                name = "BusinessCenter",
                filled = Icons.Filled.BusinessCenter,
                outlined = Icons.Outlined.BusinessCenter,
                rounded = Icons.Rounded.BusinessCenter,
                sharp = Icons.Sharp.BusinessCenter,
                twoTone = Icons.TwoTone.BusinessCenter
            ),
            IconData(
                name = "Cached",
                filled = Icons.Filled.Cached,
                outlined = Icons.Outlined.Cached,
                rounded = Icons.Rounded.Cached,
                sharp = Icons.Sharp.Cached,
                twoTone = Icons.TwoTone.Cached
            ),
            IconData(
                name = "Cake",
                filled = Icons.Filled.Cake,
                outlined = Icons.Outlined.Cake,
                rounded = Icons.Rounded.Cake,
                sharp = Icons.Sharp.Cake,
                twoTone = Icons.TwoTone.Cake
            ),
            IconData(
                name = "Calculate",
                filled = Icons.Filled.Calculate,
                outlined = Icons.Outlined.Calculate,
                rounded = Icons.Rounded.Calculate,
                sharp = Icons.Sharp.Calculate,
                twoTone = Icons.TwoTone.Calculate
            ),
            IconData(
                name = "CalendarToday",
                filled = Icons.Filled.CalendarToday,
                outlined = Icons.Outlined.CalendarToday,
                rounded = Icons.Rounded.CalendarToday,
                sharp = Icons.Sharp.CalendarToday,
                twoTone = Icons.TwoTone.CalendarToday
            ),
            IconData(
                name = "CalendarViewDay",
                filled = Icons.Filled.CalendarViewDay,
                outlined = Icons.Outlined.CalendarViewDay,
                rounded = Icons.Rounded.CalendarViewDay,
                sharp = Icons.Sharp.CalendarViewDay,
                twoTone = Icons.TwoTone.CalendarViewDay
            ),
            IconData(
                name = "CallEnd",
                filled = Icons.Filled.CallEnd,
                outlined = Icons.Outlined.CallEnd,
                rounded = Icons.Rounded.CallEnd,
                sharp = Icons.Sharp.CallEnd,
                twoTone = Icons.TwoTone.CallEnd
            ),
            IconData(
                name = "CallMade",
                filled = Icons.Filled.CallMade,
                outlined = Icons.Outlined.CallMade,
                rounded = Icons.Rounded.CallMade,
                sharp = Icons.Sharp.CallMade,
                twoTone = Icons.TwoTone.CallMade
            ),
            IconData(
                name = "CallMerge",
                filled = Icons.Filled.CallMerge,
                outlined = Icons.Outlined.CallMerge,
                rounded = Icons.Rounded.CallMerge,
                sharp = Icons.Sharp.CallMerge,
                twoTone = Icons.TwoTone.CallMerge
            ),
            IconData(
                name = "CallMissed",
                filled = Icons.Filled.CallMissed,
                outlined = Icons.Outlined.CallMissed,
                rounded = Icons.Rounded.CallMissed,
                sharp = Icons.Sharp.CallMissed,
                twoTone = Icons.TwoTone.CallMissed
            ),
            IconData(
                name = "CallMissedOutgoing",
                filled = Icons.Filled.CallMissedOutgoing,
                outlined = Icons.Outlined.CallMissedOutgoing,
                rounded = Icons.Rounded.CallMissedOutgoing,
                sharp = Icons.Sharp.CallMissedOutgoing,
                twoTone = Icons.TwoTone.CallMissedOutgoing
            ),
            IconData(
                name = "CallReceived",
                filled = Icons.Filled.CallReceived,
                outlined = Icons.Outlined.CallReceived,
                rounded = Icons.Rounded.CallReceived,
                sharp = Icons.Sharp.CallReceived,
                twoTone = Icons.TwoTone.CallReceived
            ),
            IconData(
                name = "CallSplit",
                filled = Icons.Filled.CallSplit,
                outlined = Icons.Outlined.CallSplit,
                rounded = Icons.Rounded.CallSplit,
                sharp = Icons.Sharp.CallSplit,
                twoTone = Icons.TwoTone.CallSplit
            ),
            IconData(
                name = "CallToAction",
                filled = Icons.Filled.CallToAction,
                outlined = Icons.Outlined.CallToAction,
                rounded = Icons.Rounded.CallToAction,
                sharp = Icons.Sharp.CallToAction,
                twoTone = Icons.TwoTone.CallToAction
            ),
            IconData(
                name = "Camera",
                filled = Icons.Filled.Camera,
                outlined = Icons.Outlined.Camera,
                rounded = Icons.Rounded.Camera,
                sharp = Icons.Sharp.Camera,
                twoTone = Icons.TwoTone.Camera
            ),
            IconData(
                name = "CameraAlt",
                filled = Icons.Filled.CameraAlt,
                outlined = Icons.Outlined.CameraAlt,
                rounded = Icons.Rounded.CameraAlt,
                sharp = Icons.Sharp.CameraAlt,
                twoTone = Icons.TwoTone.CameraAlt
            ),
            IconData(
                name = "CameraEnhance",
                filled = Icons.Filled.CameraEnhance,
                outlined = Icons.Outlined.CameraEnhance,
                rounded = Icons.Rounded.CameraEnhance,
                sharp = Icons.Sharp.CameraEnhance,
                twoTone = Icons.TwoTone.CameraEnhance
            ),
            IconData(
                name = "CameraFront",
                filled = Icons.Filled.CameraFront,
                outlined = Icons.Outlined.CameraFront,
                rounded = Icons.Rounded.CameraFront,
                sharp = Icons.Sharp.CameraFront,
                twoTone = Icons.TwoTone.CameraFront
            ),
            IconData(
                name = "CameraRear",
                filled = Icons.Filled.CameraRear,
                outlined = Icons.Outlined.CameraRear,
                rounded = Icons.Rounded.CameraRear,
                sharp = Icons.Sharp.CameraRear,
                twoTone = Icons.TwoTone.CameraRear
            ),
            IconData(
                name = "CameraRoll",
                filled = Icons.Filled.CameraRoll,
                outlined = Icons.Outlined.CameraRoll,
                rounded = Icons.Rounded.CameraRoll,
                sharp = Icons.Sharp.CameraRoll,
                twoTone = Icons.TwoTone.CameraRoll
            ),
            IconData(
                name = "Campaign",
                filled = Icons.Filled.Campaign,
                outlined = Icons.Outlined.Campaign,
                rounded = Icons.Rounded.Campaign,
                sharp = Icons.Sharp.Campaign,
                twoTone = Icons.TwoTone.Campaign
            ),
            IconData(
                name = "Cancel",
                filled = Icons.Filled.Cancel,
                outlined = Icons.Outlined.Cancel,
                rounded = Icons.Rounded.Cancel,
                sharp = Icons.Sharp.Cancel,
                twoTone = Icons.TwoTone.Cancel
            ),
            IconData(
                name = "CancelPresentation",
                filled = Icons.Filled.CancelPresentation,
                outlined = Icons.Outlined.CancelPresentation,
                rounded = Icons.Rounded.CancelPresentation,
                sharp = Icons.Sharp.CancelPresentation,
                twoTone = Icons.TwoTone.CancelPresentation
            ),
            IconData(
                name = "CancelScheduleSend",
                filled = Icons.Filled.CancelScheduleSend,
                outlined = Icons.Outlined.CancelScheduleSend,
                rounded = Icons.Rounded.CancelScheduleSend,
                sharp = Icons.Sharp.CancelScheduleSend,
                twoTone = Icons.TwoTone.CancelScheduleSend
            ),
            IconData(
                name = "CardGiftcard",
                filled = Icons.Filled.CardGiftcard,
                outlined = Icons.Outlined.CardGiftcard,
                rounded = Icons.Rounded.CardGiftcard,
                sharp = Icons.Sharp.CardGiftcard,
                twoTone = Icons.TwoTone.CardGiftcard
            ),
            IconData(
                name = "CardMembership",
                filled = Icons.Filled.CardMembership,
                outlined = Icons.Outlined.CardMembership,
                rounded = Icons.Rounded.CardMembership,
                sharp = Icons.Sharp.CardMembership,
                twoTone = Icons.TwoTone.CardMembership
            ),
            IconData(
                name = "CardTravel",
                filled = Icons.Filled.CardTravel,
                outlined = Icons.Outlined.CardTravel,
                rounded = Icons.Rounded.CardTravel,
                sharp = Icons.Sharp.CardTravel,
                twoTone = Icons.TwoTone.CardTravel
            ),
            IconData(
                name = "Carpenter",
                filled = Icons.Filled.Carpenter,
                outlined = Icons.Outlined.Carpenter,
                rounded = Icons.Rounded.Carpenter,
                sharp = Icons.Sharp.Carpenter,
                twoTone = Icons.TwoTone.Carpenter
            ),
            IconData(
                name = "Casino",
                filled = Icons.Filled.Casino,
                outlined = Icons.Outlined.Casino,
                rounded = Icons.Rounded.Casino,
                sharp = Icons.Sharp.Casino,
                twoTone = Icons.TwoTone.Casino
            ),
            IconData(
                name = "Cast",
                filled = Icons.Filled.Cast,
                outlined = Icons.Outlined.Cast,
                rounded = Icons.Rounded.Cast,
                sharp = Icons.Sharp.Cast,
                twoTone = Icons.TwoTone.Cast
            ),
            IconData(
                name = "CastConnected",
                filled = Icons.Filled.CastConnected,
                outlined = Icons.Outlined.CastConnected,
                rounded = Icons.Rounded.CastConnected,
                sharp = Icons.Sharp.CastConnected,
                twoTone = Icons.TwoTone.CastConnected
            ),
            IconData(
                name = "CastForEducation",
                filled = Icons.Filled.CastForEducation,
                outlined = Icons.Outlined.CastForEducation,
                rounded = Icons.Rounded.CastForEducation,
                sharp = Icons.Sharp.CastForEducation,
                twoTone = Icons.TwoTone.CastForEducation
            ),
            IconData(
                name = "Category",
                filled = Icons.Filled.Category,
                outlined = Icons.Outlined.Category,
                rounded = Icons.Rounded.Category,
                sharp = Icons.Sharp.Category,
                twoTone = Icons.TwoTone.Category
            ),
            IconData(
                name = "CenterFocusStrong",
                filled = Icons.Filled.CenterFocusStrong,
                outlined = Icons.Outlined.CenterFocusStrong,
                rounded = Icons.Rounded.CenterFocusStrong,
                sharp = Icons.Sharp.CenterFocusStrong,
                twoTone = Icons.TwoTone.CenterFocusStrong
            ),
            IconData(
                name = "CenterFocusWeak",
                filled = Icons.Filled.CenterFocusWeak,
                outlined = Icons.Outlined.CenterFocusWeak,
                rounded = Icons.Rounded.CenterFocusWeak,
                sharp = Icons.Sharp.CenterFocusWeak,
                twoTone = Icons.TwoTone.CenterFocusWeak
            ),
            IconData(
                name = "ChangeHistory",
                filled = Icons.Filled.ChangeHistory,
                outlined = Icons.Outlined.ChangeHistory,
                rounded = Icons.Rounded.ChangeHistory,
                sharp = Icons.Sharp.ChangeHistory,
                twoTone = Icons.TwoTone.ChangeHistory
            ),
            IconData(
                name = "ChargingStation",
                filled = Icons.Filled.ChargingStation,
                outlined = Icons.Outlined.ChargingStation,
                rounded = Icons.Rounded.ChargingStation,
                sharp = Icons.Sharp.ChargingStation,
                twoTone = Icons.TwoTone.ChargingStation
            ),
            IconData(
                name = "Chat",
                filled = Icons.Filled.Chat,
                outlined = Icons.Outlined.Chat,
                rounded = Icons.Rounded.Chat,
                sharp = Icons.Sharp.Chat,
                twoTone = Icons.TwoTone.Chat
            ),
            IconData(
                name = "ChatBubble",
                filled = Icons.Filled.ChatBubble,
                outlined = Icons.Outlined.ChatBubble,
                rounded = Icons.Rounded.ChatBubble,
                sharp = Icons.Sharp.ChatBubble,
                twoTone = Icons.TwoTone.ChatBubble
            ),
            IconData(
                name = "ChatBubbleOutline",
                filled = Icons.Filled.ChatBubbleOutline,
                outlined = Icons.Outlined.ChatBubbleOutline,
                rounded = Icons.Rounded.ChatBubbleOutline,
                sharp = Icons.Sharp.ChatBubbleOutline,
                twoTone = Icons.TwoTone.ChatBubbleOutline
            ),
            IconData(
                name = "CheckBox",
                filled = Icons.Filled.CheckBox,
                outlined = Icons.Outlined.CheckBox,
                rounded = Icons.Rounded.CheckBox,
                sharp = Icons.Sharp.CheckBox,
                twoTone = Icons.TwoTone.CheckBox
            ),
            IconData(
                name = "CheckBoxOutlineBlank",
                filled = Icons.Filled.CheckBoxOutlineBlank,
                outlined = Icons.Outlined.CheckBoxOutlineBlank,
                rounded = Icons.Rounded.CheckBoxOutlineBlank,
                sharp = Icons.Sharp.CheckBoxOutlineBlank,
                twoTone = Icons.TwoTone.CheckBoxOutlineBlank
            ),
            IconData(
                name = "CheckCircleOutline",
                filled = Icons.Filled.CheckCircleOutline,
                outlined = Icons.Outlined.CheckCircleOutline,
                rounded = Icons.Rounded.CheckCircleOutline,
                sharp = Icons.Sharp.CheckCircleOutline,
                twoTone = Icons.TwoTone.CheckCircleOutline
            ),
            IconData(
                name = "Checkroom",
                filled = Icons.Filled.Checkroom,
                outlined = Icons.Outlined.Checkroom,
                rounded = Icons.Rounded.Checkroom,
                sharp = Icons.Sharp.Checkroom,
                twoTone = Icons.TwoTone.Checkroom
            ),
            IconData(
                name = "ChevronLeft",
                filled = Icons.Filled.ChevronLeft,
                outlined = Icons.Outlined.ChevronLeft,
                rounded = Icons.Rounded.ChevronLeft,
                sharp = Icons.Sharp.ChevronLeft,
                twoTone = Icons.TwoTone.ChevronLeft
            ),
            IconData(
                name = "ChevronRight",
                filled = Icons.Filled.ChevronRight,
                outlined = Icons.Outlined.ChevronRight,
                rounded = Icons.Rounded.ChevronRight,
                sharp = Icons.Sharp.ChevronRight,
                twoTone = Icons.TwoTone.ChevronRight
            ),
            IconData(
                name = "ChildCare",
                filled = Icons.Filled.ChildCare,
                outlined = Icons.Outlined.ChildCare,
                rounded = Icons.Rounded.ChildCare,
                sharp = Icons.Sharp.ChildCare,
                twoTone = Icons.TwoTone.ChildCare
            ),
            IconData(
                name = "ChildFriendly",
                filled = Icons.Filled.ChildFriendly,
                outlined = Icons.Outlined.ChildFriendly,
                rounded = Icons.Rounded.ChildFriendly,
                sharp = Icons.Sharp.ChildFriendly,
                twoTone = Icons.TwoTone.ChildFriendly
            ),
            IconData(
                name = "ChromeReaderMode",
                filled = Icons.Filled.ChromeReaderMode,
                outlined = Icons.Outlined.ChromeReaderMode,
                rounded = Icons.Rounded.ChromeReaderMode,
                sharp = Icons.Sharp.ChromeReaderMode,
                twoTone = Icons.TwoTone.ChromeReaderMode
            ),
            IconData(
                name = "Class",
                filled = Icons.Filled.Class,
                outlined = Icons.Outlined.Class,
                rounded = Icons.Rounded.Class,
                sharp = Icons.Sharp.Class,
                twoTone = Icons.TwoTone.Class
            ),
            IconData(
                name = "CleanHands",
                filled = Icons.Filled.CleanHands,
                outlined = Icons.Outlined.CleanHands,
                rounded = Icons.Rounded.CleanHands,
                sharp = Icons.Sharp.CleanHands,
                twoTone = Icons.TwoTone.CleanHands
            ),
            IconData(
                name = "CleaningServices",
                filled = Icons.Filled.CleaningServices,
                outlined = Icons.Outlined.CleaningServices,
                rounded = Icons.Rounded.CleaningServices,
                sharp = Icons.Sharp.CleaningServices,
                twoTone = Icons.TwoTone.CleaningServices
            ),
            IconData(
                name = "ClearAll",
                filled = Icons.Filled.ClearAll,
                outlined = Icons.Outlined.ClearAll,
                rounded = Icons.Rounded.ClearAll,
                sharp = Icons.Sharp.ClearAll,
                twoTone = Icons.TwoTone.ClearAll
            ),
            IconData(
                name = "CloseFullscreen",
                filled = Icons.Filled.CloseFullscreen,
                outlined = Icons.Outlined.CloseFullscreen,
                rounded = Icons.Rounded.CloseFullscreen,
                sharp = Icons.Sharp.CloseFullscreen,
                twoTone = Icons.TwoTone.CloseFullscreen
            ),
            IconData(
                name = "ClosedCaption",
                filled = Icons.Filled.ClosedCaption,
                outlined = Icons.Outlined.ClosedCaption,
                rounded = Icons.Rounded.ClosedCaption,
                sharp = Icons.Sharp.ClosedCaption,
                twoTone = Icons.TwoTone.ClosedCaption
            ),
            IconData(
                name = "ClosedCaptionDisabled",
                filled = Icons.Filled.ClosedCaptionDisabled,
                outlined = Icons.Outlined.ClosedCaptionDisabled,
                rounded = Icons.Rounded.ClosedCaptionDisabled,
                sharp = Icons.Sharp.ClosedCaptionDisabled,
                twoTone = Icons.TwoTone.ClosedCaptionDisabled
            ),
            IconData(
                name = "Cloud",
                filled = Icons.Filled.Cloud,
                outlined = Icons.Outlined.Cloud,
                rounded = Icons.Rounded.Cloud,
                sharp = Icons.Sharp.Cloud,
                twoTone = Icons.TwoTone.Cloud
            ),
            IconData(
                name = "CloudCircle",
                filled = Icons.Filled.CloudCircle,
                outlined = Icons.Outlined.CloudCircle,
                rounded = Icons.Rounded.CloudCircle,
                sharp = Icons.Sharp.CloudCircle,
                twoTone = Icons.TwoTone.CloudCircle
            ),
            IconData(
                name = "CloudDone",
                filled = Icons.Filled.CloudDone,
                outlined = Icons.Outlined.CloudDone,
                rounded = Icons.Rounded.CloudDone,
                sharp = Icons.Sharp.CloudDone,
                twoTone = Icons.TwoTone.CloudDone
            ),
            IconData(
                name = "CloudDownload",
                filled = Icons.Filled.CloudDownload,
                outlined = Icons.Outlined.CloudDownload,
                rounded = Icons.Rounded.CloudDownload,
                sharp = Icons.Sharp.CloudDownload,
                twoTone = Icons.TwoTone.CloudDownload
            ),
            IconData(
                name = "CloudOff",
                filled = Icons.Filled.CloudOff,
                outlined = Icons.Outlined.CloudOff,
                rounded = Icons.Rounded.CloudOff,
                sharp = Icons.Sharp.CloudOff,
                twoTone = Icons.TwoTone.CloudOff
            ),
            IconData(
                name = "CloudQueue",
                filled = Icons.Filled.CloudQueue,
                outlined = Icons.Outlined.CloudQueue,
                rounded = Icons.Rounded.CloudQueue,
                sharp = Icons.Sharp.CloudQueue,
                twoTone = Icons.TwoTone.CloudQueue
            ),
            IconData(
                name = "CloudUpload",
                filled = Icons.Filled.CloudUpload,
                outlined = Icons.Outlined.CloudUpload,
                rounded = Icons.Rounded.CloudUpload,
                sharp = Icons.Sharp.CloudUpload,
                twoTone = Icons.TwoTone.CloudUpload
            ),
            IconData(
                name = "Code",
                filled = Icons.Filled.Code,
                outlined = Icons.Outlined.Code,
                rounded = Icons.Rounded.Code,
                sharp = Icons.Sharp.Code,
                twoTone = Icons.TwoTone.Code
            ),
            IconData(
                name = "Collections",
                filled = Icons.Filled.Collections,
                outlined = Icons.Outlined.Collections,
                rounded = Icons.Rounded.Collections,
                sharp = Icons.Sharp.Collections,
                twoTone = Icons.TwoTone.Collections
            ),
            IconData(
                name = "CollectionsBookmark",
                filled = Icons.Filled.CollectionsBookmark,
                outlined = Icons.Outlined.CollectionsBookmark,
                rounded = Icons.Rounded.CollectionsBookmark,
                sharp = Icons.Sharp.CollectionsBookmark,
                twoTone = Icons.TwoTone.CollectionsBookmark
            ),
            IconData(
                name = "ColorLens",
                filled = Icons.Filled.ColorLens,
                outlined = Icons.Outlined.ColorLens,
                rounded = Icons.Rounded.ColorLens,
                sharp = Icons.Sharp.ColorLens,
                twoTone = Icons.TwoTone.ColorLens
            ),
            IconData(
                name = "Colorize",
                filled = Icons.Filled.Colorize,
                outlined = Icons.Outlined.Colorize,
                rounded = Icons.Rounded.Colorize,
                sharp = Icons.Sharp.Colorize,
                twoTone = Icons.TwoTone.Colorize
            ),
            IconData(
                name = "Comment",
                filled = Icons.Filled.Comment,
                outlined = Icons.Outlined.Comment,
                rounded = Icons.Rounded.Comment,
                sharp = Icons.Sharp.Comment,
                twoTone = Icons.TwoTone.Comment
            ),
            IconData(
                name = "CommentBank",
                filled = Icons.Filled.CommentBank,
                outlined = Icons.Outlined.CommentBank,
                rounded = Icons.Rounded.CommentBank,
                sharp = Icons.Sharp.CommentBank,
                twoTone = Icons.TwoTone.CommentBank
            ),
            IconData(
                name = "Commute",
                filled = Icons.Filled.Commute,
                outlined = Icons.Outlined.Commute,
                rounded = Icons.Rounded.Commute,
                sharp = Icons.Sharp.Commute,
                twoTone = Icons.TwoTone.Commute
            ),
            IconData(
                name = "Compare",
                filled = Icons.Filled.Compare,
                outlined = Icons.Outlined.Compare,
                rounded = Icons.Rounded.Compare,
                sharp = Icons.Sharp.Compare,
                twoTone = Icons.TwoTone.Compare
            ),
            IconData(
                name = "CompareArrows",
                filled = Icons.Filled.CompareArrows,
                outlined = Icons.Outlined.CompareArrows,
                rounded = Icons.Rounded.CompareArrows,
                sharp = Icons.Sharp.CompareArrows,
                twoTone = Icons.TwoTone.CompareArrows
            ),
            IconData(
                name = "CompassCalibration",
                filled = Icons.Filled.CompassCalibration,
                outlined = Icons.Outlined.CompassCalibration,
                rounded = Icons.Rounded.CompassCalibration,
                sharp = Icons.Sharp.CompassCalibration,
                twoTone = Icons.TwoTone.CompassCalibration
            ),
            IconData(
                name = "Computer",
                filled = Icons.Filled.Computer,
                outlined = Icons.Outlined.Computer,
                rounded = Icons.Rounded.Computer,
                sharp = Icons.Sharp.Computer,
                twoTone = Icons.TwoTone.Computer
            ),
            IconData(
                name = "ConfirmationNumber",
                filled = Icons.Filled.ConfirmationNumber,
                outlined = Icons.Outlined.ConfirmationNumber,
                rounded = Icons.Rounded.ConfirmationNumber,
                sharp = Icons.Sharp.ConfirmationNumber,
                twoTone = Icons.TwoTone.ConfirmationNumber
            ),
            IconData(
                name = "ConnectWithoutContact",
                filled = Icons.Filled.ConnectWithoutContact,
                outlined = Icons.Outlined.ConnectWithoutContact,
                rounded = Icons.Rounded.ConnectWithoutContact,
                sharp = Icons.Sharp.ConnectWithoutContact,
                twoTone = Icons.TwoTone.ConnectWithoutContact
            ),
            IconData(
                name = "Construction",
                filled = Icons.Filled.Construction,
                outlined = Icons.Outlined.Construction,
                rounded = Icons.Rounded.Construction,
                sharp = Icons.Sharp.Construction,
                twoTone = Icons.TwoTone.Construction
            ),
            IconData(
                name = "ContactMail",
                filled = Icons.Filled.ContactMail,
                outlined = Icons.Outlined.ContactMail,
                rounded = Icons.Rounded.ContactMail,
                sharp = Icons.Sharp.ContactMail,
                twoTone = Icons.TwoTone.ContactMail
            ),
            IconData(
                name = "ContactPage",
                filled = Icons.Filled.ContactPage,
                outlined = Icons.Outlined.ContactPage,
                rounded = Icons.Rounded.ContactPage,
                sharp = Icons.Sharp.ContactPage,
                twoTone = Icons.TwoTone.ContactPage
            ),
            IconData(
                name = "ContactPhone",
                filled = Icons.Filled.ContactPhone,
                outlined = Icons.Outlined.ContactPhone,
                rounded = Icons.Rounded.ContactPhone,
                sharp = Icons.Sharp.ContactPhone,
                twoTone = Icons.TwoTone.ContactPhone
            ),
            IconData(
                name = "ContactSupport",
                filled = Icons.Filled.ContactSupport,
                outlined = Icons.Outlined.ContactSupport,
                rounded = Icons.Rounded.ContactSupport,
                sharp = Icons.Sharp.ContactSupport,
                twoTone = Icons.TwoTone.ContactSupport
            ),
            IconData(
                name = "Contactless",
                filled = Icons.Filled.Contactless,
                outlined = Icons.Outlined.Contactless,
                rounded = Icons.Rounded.Contactless,
                sharp = Icons.Sharp.Contactless,
                twoTone = Icons.TwoTone.Contactless
            ),
            IconData(
                name = "Contacts",
                filled = Icons.Filled.Contacts,
                outlined = Icons.Outlined.Contacts,
                rounded = Icons.Rounded.Contacts,
                sharp = Icons.Sharp.Contacts,
                twoTone = Icons.TwoTone.Contacts
            ),
            IconData(
                name = "ContentCopy",
                filled = Icons.Filled.ContentCopy,
                outlined = Icons.Outlined.ContentCopy,
                rounded = Icons.Rounded.ContentCopy,
                sharp = Icons.Sharp.ContentCopy,
                twoTone = Icons.TwoTone.ContentCopy
            ),
            IconData(
                name = "ContentCut",
                filled = Icons.Filled.ContentCut,
                outlined = Icons.Outlined.ContentCut,
                rounded = Icons.Rounded.ContentCut,
                sharp = Icons.Sharp.ContentCut,
                twoTone = Icons.TwoTone.ContentCut
            ),
            IconData(
                name = "ContentPaste",
                filled = Icons.Filled.ContentPaste,
                outlined = Icons.Outlined.ContentPaste,
                rounded = Icons.Rounded.ContentPaste,
                sharp = Icons.Sharp.ContentPaste,
                twoTone = Icons.TwoTone.ContentPaste
            ),
            IconData(
                name = "ControlCamera",
                filled = Icons.Filled.ControlCamera,
                outlined = Icons.Outlined.ControlCamera,
                rounded = Icons.Rounded.ControlCamera,
                sharp = Icons.Sharp.ControlCamera,
                twoTone = Icons.TwoTone.ControlCamera
            ),
            IconData(
                name = "ControlPoint",
                filled = Icons.Filled.ControlPoint,
                outlined = Icons.Outlined.ControlPoint,
                rounded = Icons.Rounded.ControlPoint,
                sharp = Icons.Sharp.ControlPoint,
                twoTone = Icons.TwoTone.ControlPoint
            ),
            IconData(
                name = "ControlPointDuplicate",
                filled = Icons.Filled.ControlPointDuplicate,
                outlined = Icons.Outlined.ControlPointDuplicate,
                rounded = Icons.Rounded.ControlPointDuplicate,
                sharp = Icons.Sharp.ControlPointDuplicate,
                twoTone = Icons.TwoTone.ControlPointDuplicate
            ),
            IconData(
                name = "Copyright",
                filled = Icons.Filled.Copyright,
                outlined = Icons.Outlined.Copyright,
                rounded = Icons.Rounded.Copyright,
                sharp = Icons.Sharp.Copyright,
                twoTone = Icons.TwoTone.Copyright
            ),
            IconData(
                name = "Coronavirus",
                filled = Icons.Filled.Coronavirus,
                outlined = Icons.Outlined.Coronavirus,
                rounded = Icons.Rounded.Coronavirus,
                sharp = Icons.Sharp.Coronavirus,
                twoTone = Icons.TwoTone.Coronavirus
            ),
            IconData(
                name = "CorporateFare",
                filled = Icons.Filled.CorporateFare,
                outlined = Icons.Outlined.CorporateFare,
                rounded = Icons.Rounded.CorporateFare,
                sharp = Icons.Sharp.CorporateFare,
                twoTone = Icons.TwoTone.CorporateFare
            ),
            IconData(
                name = "Countertops",
                filled = Icons.Filled.Countertops,
                outlined = Icons.Outlined.Countertops,
                rounded = Icons.Rounded.Countertops,
                sharp = Icons.Sharp.Countertops,
                twoTone = Icons.TwoTone.Countertops
            ),
            IconData(
                name = "CreateNewFolder",
                filled = Icons.Filled.CreateNewFolder,
                outlined = Icons.Outlined.CreateNewFolder,
                rounded = Icons.Rounded.CreateNewFolder,
                sharp = Icons.Sharp.CreateNewFolder,
                twoTone = Icons.TwoTone.CreateNewFolder
            ),
            IconData(
                name = "CreditCard",
                filled = Icons.Filled.CreditCard,
                outlined = Icons.Outlined.CreditCard,
                rounded = Icons.Rounded.CreditCard,
                sharp = Icons.Sharp.CreditCard,
                twoTone = Icons.TwoTone.CreditCard
            ),
            IconData(
                name = "Crop",
                filled = Icons.Filled.Crop,
                outlined = Icons.Outlined.Crop,
                rounded = Icons.Rounded.Crop,
                sharp = Icons.Sharp.Crop,
                twoTone = Icons.TwoTone.Crop
            ),
            IconData(
                name = "Crop169",
                filled = Icons.Filled.Crop169,
                outlined = Icons.Outlined.Crop169,
                rounded = Icons.Rounded.Crop169,
                sharp = Icons.Sharp.Crop169,
                twoTone = Icons.TwoTone.Crop169
            ),
            IconData(
                name = "Crop32",
                filled = Icons.Filled.Crop32,
                outlined = Icons.Outlined.Crop32,
                rounded = Icons.Rounded.Crop32,
                sharp = Icons.Sharp.Crop32,
                twoTone = Icons.TwoTone.Crop32
            ),
            IconData(
                name = "Crop54",
                filled = Icons.Filled.Crop54,
                outlined = Icons.Outlined.Crop54,
                rounded = Icons.Rounded.Crop54,
                sharp = Icons.Sharp.Crop54,
                twoTone = Icons.TwoTone.Crop54
            ),
            IconData(
                name = "Crop75",
                filled = Icons.Filled.Crop75,
                outlined = Icons.Outlined.Crop75,
                rounded = Icons.Rounded.Crop75,
                sharp = Icons.Sharp.Crop75,
                twoTone = Icons.TwoTone.Crop75
            ),
            IconData(
                name = "CropDin",
                filled = Icons.Filled.CropDin,
                outlined = Icons.Outlined.CropDin,
                rounded = Icons.Rounded.CropDin,
                sharp = Icons.Sharp.CropDin,
                twoTone = Icons.TwoTone.CropDin
            ),
            IconData(
                name = "CropFree",
                filled = Icons.Filled.CropFree,
                outlined = Icons.Outlined.CropFree,
                rounded = Icons.Rounded.CropFree,
                sharp = Icons.Sharp.CropFree,
                twoTone = Icons.TwoTone.CropFree
            ),
            IconData(
                name = "CropLandscape",
                filled = Icons.Filled.CropLandscape,
                outlined = Icons.Outlined.CropLandscape,
                rounded = Icons.Rounded.CropLandscape,
                sharp = Icons.Sharp.CropLandscape,
                twoTone = Icons.TwoTone.CropLandscape
            ),
            IconData(
                name = "CropOriginal",
                filled = Icons.Filled.CropOriginal,
                outlined = Icons.Outlined.CropOriginal,
                rounded = Icons.Rounded.CropOriginal,
                sharp = Icons.Sharp.CropOriginal,
                twoTone = Icons.TwoTone.CropOriginal
            ),
            IconData(
                name = "CropPortrait",
                filled = Icons.Filled.CropPortrait,
                outlined = Icons.Outlined.CropPortrait,
                rounded = Icons.Rounded.CropPortrait,
                sharp = Icons.Sharp.CropPortrait,
                twoTone = Icons.TwoTone.CropPortrait
            ),
            IconData(
                name = "CropRotate",
                filled = Icons.Filled.CropRotate,
                outlined = Icons.Outlined.CropRotate,
                rounded = Icons.Rounded.CropRotate,
                sharp = Icons.Sharp.CropRotate,
                twoTone = Icons.TwoTone.CropRotate
            ),
            IconData(
                name = "CropSquare",
                filled = Icons.Filled.CropSquare,
                outlined = Icons.Outlined.CropSquare,
                rounded = Icons.Rounded.CropSquare,
                sharp = Icons.Sharp.CropSquare,
                twoTone = Icons.TwoTone.CropSquare
            ),
            IconData(
                name = "Dashboard",
                filled = Icons.Filled.Dashboard,
                outlined = Icons.Outlined.Dashboard,
                rounded = Icons.Rounded.Dashboard,
                sharp = Icons.Sharp.Dashboard,
                twoTone = Icons.TwoTone.Dashboard
            ),
            IconData(
                name = "DataUsage",
                filled = Icons.Filled.DataUsage,
                outlined = Icons.Outlined.DataUsage,
                rounded = Icons.Rounded.DataUsage,
                sharp = Icons.Sharp.DataUsage,
                twoTone = Icons.TwoTone.DataUsage
            ),
            IconData(
                name = "Deck",
                filled = Icons.Filled.Deck,
                outlined = Icons.Outlined.Deck,
                rounded = Icons.Rounded.Deck,
                sharp = Icons.Sharp.Deck,
                twoTone = Icons.TwoTone.Deck
            ),
            IconData(
                name = "Dehaze",
                filled = Icons.Filled.Dehaze,
                outlined = Icons.Outlined.Dehaze,
                rounded = Icons.Rounded.Dehaze,
                sharp = Icons.Sharp.Dehaze,
                twoTone = Icons.TwoTone.Dehaze
            ),
            IconData(
                name = "DeleteForever",
                filled = Icons.Filled.DeleteForever,
                outlined = Icons.Outlined.DeleteForever,
                rounded = Icons.Rounded.DeleteForever,
                sharp = Icons.Sharp.DeleteForever,
                twoTone = Icons.TwoTone.DeleteForever
            ),
            IconData(
                name = "DeleteOutline",
                filled = Icons.Filled.DeleteOutline,
                outlined = Icons.Outlined.DeleteOutline,
                rounded = Icons.Rounded.DeleteOutline,
                sharp = Icons.Sharp.DeleteOutline,
                twoTone = Icons.TwoTone.DeleteOutline
            ),
            IconData(
                name = "DeleteSweep",
                filled = Icons.Filled.DeleteSweep,
                outlined = Icons.Outlined.DeleteSweep,
                rounded = Icons.Rounded.DeleteSweep,
                sharp = Icons.Sharp.DeleteSweep,
                twoTone = Icons.TwoTone.DeleteSweep
            ),
            IconData(
                name = "DepartureBoard",
                filled = Icons.Filled.DepartureBoard,
                outlined = Icons.Outlined.DepartureBoard,
                rounded = Icons.Rounded.DepartureBoard,
                sharp = Icons.Sharp.DepartureBoard,
                twoTone = Icons.TwoTone.DepartureBoard
            ),
            IconData(
                name = "Description",
                filled = Icons.Filled.Description,
                outlined = Icons.Outlined.Description,
                rounded = Icons.Rounded.Description,
                sharp = Icons.Sharp.Description,
                twoTone = Icons.TwoTone.Description
            ),
            IconData(
                name = "DesignServices",
                filled = Icons.Filled.DesignServices,
                outlined = Icons.Outlined.DesignServices,
                rounded = Icons.Rounded.DesignServices,
                sharp = Icons.Sharp.DesignServices,
                twoTone = Icons.TwoTone.DesignServices
            ),
            IconData(
                name = "DesktopAccessDisabled",
                filled = Icons.Filled.DesktopAccessDisabled,
                outlined = Icons.Outlined.DesktopAccessDisabled,
                rounded = Icons.Rounded.DesktopAccessDisabled,
                sharp = Icons.Sharp.DesktopAccessDisabled,
                twoTone = Icons.TwoTone.DesktopAccessDisabled
            ),
            IconData(
                name = "DesktopMac",
                filled = Icons.Filled.DesktopMac,
                outlined = Icons.Outlined.DesktopMac,
                rounded = Icons.Rounded.DesktopMac,
                sharp = Icons.Sharp.DesktopMac,
                twoTone = Icons.TwoTone.DesktopMac
            ),
            IconData(
                name = "DesktopWindows",
                filled = Icons.Filled.DesktopWindows,
                outlined = Icons.Outlined.DesktopWindows,
                rounded = Icons.Rounded.DesktopWindows,
                sharp = Icons.Sharp.DesktopWindows,
                twoTone = Icons.TwoTone.DesktopWindows
            ),
            IconData(
                name = "Details",
                filled = Icons.Filled.Details,
                outlined = Icons.Outlined.Details,
                rounded = Icons.Rounded.Details,
                sharp = Icons.Sharp.Details,
                twoTone = Icons.TwoTone.Details
            ),
            IconData(
                name = "DeveloperBoard",
                filled = Icons.Filled.DeveloperBoard,
                outlined = Icons.Outlined.DeveloperBoard,
                rounded = Icons.Rounded.DeveloperBoard,
                sharp = Icons.Sharp.DeveloperBoard,
                twoTone = Icons.TwoTone.DeveloperBoard
            ),
            IconData(
                name = "DeveloperMode",
                filled = Icons.Filled.DeveloperMode,
                outlined = Icons.Outlined.DeveloperMode,
                rounded = Icons.Rounded.DeveloperMode,
                sharp = Icons.Sharp.DeveloperMode,
                twoTone = Icons.TwoTone.DeveloperMode
            ),
            IconData(
                name = "DeviceHub",
                filled = Icons.Filled.DeviceHub,
                outlined = Icons.Outlined.DeviceHub,
                rounded = Icons.Rounded.DeviceHub,
                sharp = Icons.Sharp.DeviceHub,
                twoTone = Icons.TwoTone.DeviceHub
            ),
            IconData(
                name = "DeviceUnknown",
                filled = Icons.Filled.DeviceUnknown,
                outlined = Icons.Outlined.DeviceUnknown,
                rounded = Icons.Rounded.DeviceUnknown,
                sharp = Icons.Sharp.DeviceUnknown,
                twoTone = Icons.TwoTone.DeviceUnknown
            ),
            IconData(
                name = "Devices",
                filled = Icons.Filled.Devices,
                outlined = Icons.Outlined.Devices,
                rounded = Icons.Rounded.Devices,
                sharp = Icons.Sharp.Devices,
                twoTone = Icons.TwoTone.Devices
            ),
            IconData(
                name = "DevicesOther",
                filled = Icons.Filled.DevicesOther,
                outlined = Icons.Outlined.DevicesOther,
                rounded = Icons.Rounded.DevicesOther,
                sharp = Icons.Sharp.DevicesOther,
                twoTone = Icons.TwoTone.DevicesOther
            ),
            IconData(
                name = "DialerSip",
                filled = Icons.Filled.DialerSip,
                outlined = Icons.Outlined.DialerSip,
                rounded = Icons.Rounded.DialerSip,
                sharp = Icons.Sharp.DialerSip,
                twoTone = Icons.TwoTone.DialerSip
            ),
            IconData(
                name = "Dialpad",
                filled = Icons.Filled.Dialpad,
                outlined = Icons.Outlined.Dialpad,
                rounded = Icons.Rounded.Dialpad,
                sharp = Icons.Sharp.Dialpad,
                twoTone = Icons.TwoTone.Dialpad
            ),
            IconData(
                name = "Directions",
                filled = Icons.Filled.Directions,
                outlined = Icons.Outlined.Directions,
                rounded = Icons.Rounded.Directions,
                sharp = Icons.Sharp.Directions,
                twoTone = Icons.TwoTone.Directions
            ),
            IconData(
                name = "DirectionsBike",
                filled = Icons.Filled.DirectionsBike,
                outlined = Icons.Outlined.DirectionsBike,
                rounded = Icons.Rounded.DirectionsBike,
                sharp = Icons.Sharp.DirectionsBike,
                twoTone = Icons.TwoTone.DirectionsBike
            ),
            IconData(
                name = "DirectionsBoat",
                filled = Icons.Filled.DirectionsBoat,
                outlined = Icons.Outlined.DirectionsBoat,
                rounded = Icons.Rounded.DirectionsBoat,
                sharp = Icons.Sharp.DirectionsBoat,
                twoTone = Icons.TwoTone.DirectionsBoat
            ),
            IconData(
                name = "DirectionsBus",
                filled = Icons.Filled.DirectionsBus,
                outlined = Icons.Outlined.DirectionsBus,
                rounded = Icons.Rounded.DirectionsBus,
                sharp = Icons.Sharp.DirectionsBus,
                twoTone = Icons.TwoTone.DirectionsBus
            ),
            IconData(
                name = "DirectionsCar",
                filled = Icons.Filled.DirectionsCar,
                outlined = Icons.Outlined.DirectionsCar,
                rounded = Icons.Rounded.DirectionsCar,
                sharp = Icons.Sharp.DirectionsCar,
                twoTone = Icons.TwoTone.DirectionsCar
            ),
            IconData(
                name = "DirectionsOff",
                filled = Icons.Filled.DirectionsOff,
                outlined = Icons.Outlined.DirectionsOff,
                rounded = Icons.Rounded.DirectionsOff,
                sharp = Icons.Sharp.DirectionsOff,
                twoTone = Icons.TwoTone.DirectionsOff
            ),
            IconData(
                name = "DirectionsRailway",
                filled = Icons.Filled.DirectionsRailway,
                outlined = Icons.Outlined.DirectionsRailway,
                rounded = Icons.Rounded.DirectionsRailway,
                sharp = Icons.Sharp.DirectionsRailway,
                twoTone = Icons.TwoTone.DirectionsRailway
            ),
            IconData(
                name = "DirectionsRun",
                filled = Icons.Filled.DirectionsRun,
                outlined = Icons.Outlined.DirectionsRun,
                rounded = Icons.Rounded.DirectionsRun,
                sharp = Icons.Sharp.DirectionsRun,
                twoTone = Icons.TwoTone.DirectionsRun
            ),
            IconData(
                name = "DirectionsSubway",
                filled = Icons.Filled.DirectionsSubway,
                outlined = Icons.Outlined.DirectionsSubway,
                rounded = Icons.Rounded.DirectionsSubway,
                sharp = Icons.Sharp.DirectionsSubway,
                twoTone = Icons.TwoTone.DirectionsSubway
            ),
            IconData(
                name = "DirectionsTransit",
                filled = Icons.Filled.DirectionsTransit,
                outlined = Icons.Outlined.DirectionsTransit,
                rounded = Icons.Rounded.DirectionsTransit,
                sharp = Icons.Sharp.DirectionsTransit,
                twoTone = Icons.TwoTone.DirectionsTransit
            ),
            IconData(
                name = "DirectionsWalk",
                filled = Icons.Filled.DirectionsWalk,
                outlined = Icons.Outlined.DirectionsWalk,
                rounded = Icons.Rounded.DirectionsWalk,
                sharp = Icons.Sharp.DirectionsWalk,
                twoTone = Icons.TwoTone.DirectionsWalk
            ),
            IconData(
                name = "DisabledByDefault",
                filled = Icons.Filled.DisabledByDefault,
                outlined = Icons.Outlined.DisabledByDefault,
                rounded = Icons.Rounded.DisabledByDefault,
                sharp = Icons.Sharp.DisabledByDefault,
                twoTone = Icons.TwoTone.DisabledByDefault
            ),
            IconData(
                name = "DiscFull",
                filled = Icons.Filled.DiscFull,
                outlined = Icons.Outlined.DiscFull,
                rounded = Icons.Rounded.DiscFull,
                sharp = Icons.Sharp.DiscFull,
                twoTone = Icons.TwoTone.DiscFull
            ),
            IconData(
                name = "Dns",
                filled = Icons.Filled.Dns,
                outlined = Icons.Outlined.Dns,
                rounded = Icons.Rounded.Dns,
                sharp = Icons.Sharp.Dns,
                twoTone = Icons.TwoTone.Dns
            ),
            IconData(
                name = "DoNotStep",
                filled = Icons.Filled.DoNotStep,
                outlined = Icons.Outlined.DoNotStep,
                rounded = Icons.Rounded.DoNotStep,
                sharp = Icons.Sharp.DoNotStep,
                twoTone = Icons.TwoTone.DoNotStep
            ),
            IconData(
                name = "DoNotTouch",
                filled = Icons.Filled.DoNotTouch,
                outlined = Icons.Outlined.DoNotTouch,
                rounded = Icons.Rounded.DoNotTouch,
                sharp = Icons.Sharp.DoNotTouch,
                twoTone = Icons.TwoTone.DoNotTouch
            ),
            IconData(
                name = "Dock",
                filled = Icons.Filled.Dock,
                outlined = Icons.Outlined.Dock,
                rounded = Icons.Rounded.Dock,
                sharp = Icons.Sharp.Dock,
                twoTone = Icons.TwoTone.Dock
            ),
            IconData(
                name = "Domain",
                filled = Icons.Filled.Domain,
                outlined = Icons.Outlined.Domain,
                rounded = Icons.Rounded.Domain,
                sharp = Icons.Sharp.Domain,
                twoTone = Icons.TwoTone.Domain
            ),
            IconData(
                name = "DomainDisabled",
                filled = Icons.Filled.DomainDisabled,
                outlined = Icons.Outlined.DomainDisabled,
                rounded = Icons.Rounded.DomainDisabled,
                sharp = Icons.Sharp.DomainDisabled,
                twoTone = Icons.TwoTone.DomainDisabled
            ),
            IconData(
                name = "DomainVerification",
                filled = Icons.Filled.DomainVerification,
                outlined = Icons.Outlined.DomainVerification,
                rounded = Icons.Rounded.DomainVerification,
                sharp = Icons.Sharp.DomainVerification,
                twoTone = Icons.TwoTone.DomainVerification
            ),
            IconData(
                name = "DoneAll",
                filled = Icons.Filled.DoneAll,
                outlined = Icons.Outlined.DoneAll,
                rounded = Icons.Rounded.DoneAll,
                sharp = Icons.Sharp.DoneAll,
                twoTone = Icons.TwoTone.DoneAll
            ),
            IconData(
                name = "DoneOutline",
                filled = Icons.Filled.DoneOutline,
                outlined = Icons.Outlined.DoneOutline,
                rounded = Icons.Rounded.DoneOutline,
                sharp = Icons.Sharp.DoneOutline,
                twoTone = Icons.TwoTone.DoneOutline
            ),
            IconData(
                name = "DonutLarge",
                filled = Icons.Filled.DonutLarge,
                outlined = Icons.Outlined.DonutLarge,
                rounded = Icons.Rounded.DonutLarge,
                sharp = Icons.Sharp.DonutLarge,
                twoTone = Icons.TwoTone.DonutLarge
            ),
            IconData(
                name = "DonutSmall",
                filled = Icons.Filled.DonutSmall,
                outlined = Icons.Outlined.DonutSmall,
                rounded = Icons.Rounded.DonutSmall,
                sharp = Icons.Sharp.DonutSmall,
                twoTone = Icons.TwoTone.DonutSmall
            ),
            IconData(
                name = "DoubleArrow",
                filled = Icons.Filled.DoubleArrow,
                outlined = Icons.Outlined.DoubleArrow,
                rounded = Icons.Rounded.DoubleArrow,
                sharp = Icons.Sharp.DoubleArrow,
                twoTone = Icons.TwoTone.DoubleArrow
            ),
            IconData(
                name = "Drafts",
                filled = Icons.Filled.Drafts,
                outlined = Icons.Outlined.Drafts,
                rounded = Icons.Rounded.Drafts,
                sharp = Icons.Sharp.Drafts,
                twoTone = Icons.TwoTone.Drafts
            ),
            IconData(
                name = "DragHandle",
                filled = Icons.Filled.DragHandle,
                outlined = Icons.Outlined.DragHandle,
                rounded = Icons.Rounded.DragHandle,
                sharp = Icons.Sharp.DragHandle,
                twoTone = Icons.TwoTone.DragHandle
            ),
            IconData(
                name = "DragIndicator",
                filled = Icons.Filled.DragIndicator,
                outlined = Icons.Outlined.DragIndicator,
                rounded = Icons.Rounded.DragIndicator,
                sharp = Icons.Sharp.DragIndicator,
                twoTone = Icons.TwoTone.DragIndicator
            ),
            IconData(
                name = "DriveEta",
                filled = Icons.Filled.DriveEta,
                outlined = Icons.Outlined.DriveEta,
                rounded = Icons.Rounded.DriveEta,
                sharp = Icons.Sharp.DriveEta,
                twoTone = Icons.TwoTone.DriveEta
            ),
            IconData(
                name = "Dry",
                filled = Icons.Filled.Dry,
                outlined = Icons.Outlined.Dry,
                rounded = Icons.Rounded.Dry,
                sharp = Icons.Sharp.Dry,
                twoTone = Icons.TwoTone.Dry
            ),
            IconData(
                name = "Duo",
                filled = Icons.Filled.Duo,
                outlined = Icons.Outlined.Duo,
                rounded = Icons.Rounded.Duo,
                sharp = Icons.Sharp.Duo,
                twoTone = Icons.TwoTone.Duo
            ),
            IconData(
                name = "Dvr",
                filled = Icons.Filled.Dvr,
                outlined = Icons.Outlined.Dvr,
                rounded = Icons.Rounded.Dvr,
                sharp = Icons.Sharp.Dvr,
                twoTone = Icons.TwoTone.Dvr
            ),
            IconData(
                name = "DynamicFeed",
                filled = Icons.Filled.DynamicFeed,
                outlined = Icons.Outlined.DynamicFeed,
                rounded = Icons.Rounded.DynamicFeed,
                sharp = Icons.Sharp.DynamicFeed,
                twoTone = Icons.TwoTone.DynamicFeed
            ),
            IconData(
                name = "DynamicForm",
                filled = Icons.Filled.DynamicForm,
                outlined = Icons.Outlined.DynamicForm,
                rounded = Icons.Rounded.DynamicForm,
                sharp = Icons.Sharp.DynamicForm,
                twoTone = Icons.TwoTone.DynamicForm
            ),
            IconData(
                name = "East",
                filled = Icons.Filled.East,
                outlined = Icons.Outlined.East,
                rounded = Icons.Rounded.East,
                sharp = Icons.Sharp.East,
                twoTone = Icons.TwoTone.East
            ),
            IconData(
                name = "Eco",
                filled = Icons.Filled.Eco,
                outlined = Icons.Outlined.Eco,
                rounded = Icons.Rounded.Eco,
                sharp = Icons.Sharp.Eco,
                twoTone = Icons.TwoTone.Eco
            ),
            IconData(
                name = "EditAttributes",
                filled = Icons.Filled.EditAttributes,
                outlined = Icons.Outlined.EditAttributes,
                rounded = Icons.Rounded.EditAttributes,
                sharp = Icons.Sharp.EditAttributes,
                twoTone = Icons.TwoTone.EditAttributes
            ),
            IconData(
                name = "EditLocation",
                filled = Icons.Filled.EditLocation,
                outlined = Icons.Outlined.EditLocation,
                rounded = Icons.Rounded.EditLocation,
                sharp = Icons.Sharp.EditLocation,
                twoTone = Icons.TwoTone.EditLocation
            ),
            IconData(
                name = "EditRoad",
                filled = Icons.Filled.EditRoad,
                outlined = Icons.Outlined.EditRoad,
                rounded = Icons.Rounded.EditRoad,
                sharp = Icons.Sharp.EditRoad,
                twoTone = Icons.TwoTone.EditRoad
            ),
            IconData(
                name = "Eject",
                filled = Icons.Filled.Eject,
                outlined = Icons.Outlined.Eject,
                rounded = Icons.Rounded.Eject,
                sharp = Icons.Sharp.Eject,
                twoTone = Icons.TwoTone.Eject
            ),
            IconData(
                name = "Elderly",
                filled = Icons.Filled.Elderly,
                outlined = Icons.Outlined.Elderly,
                rounded = Icons.Rounded.Elderly,
                sharp = Icons.Sharp.Elderly,
                twoTone = Icons.TwoTone.Elderly
            ),
            IconData(
                name = "ElectricBike",
                filled = Icons.Filled.ElectricBike,
                outlined = Icons.Outlined.ElectricBike,
                rounded = Icons.Rounded.ElectricBike,
                sharp = Icons.Sharp.ElectricBike,
                twoTone = Icons.TwoTone.ElectricBike
            ),
            IconData(
                name = "ElectricCar",
                filled = Icons.Filled.ElectricCar,
                outlined = Icons.Outlined.ElectricCar,
                rounded = Icons.Rounded.ElectricCar,
                sharp = Icons.Sharp.ElectricCar,
                twoTone = Icons.TwoTone.ElectricCar
            ),
            IconData(
                name = "ElectricMoped",
                filled = Icons.Filled.ElectricMoped,
                outlined = Icons.Outlined.ElectricMoped,
                rounded = Icons.Rounded.ElectricMoped,
                sharp = Icons.Sharp.ElectricMoped,
                twoTone = Icons.TwoTone.ElectricMoped
            ),
            IconData(
                name = "ElectricScooter",
                filled = Icons.Filled.ElectricScooter,
                outlined = Icons.Outlined.ElectricScooter,
                rounded = Icons.Rounded.ElectricScooter,
                sharp = Icons.Sharp.ElectricScooter,
                twoTone = Icons.TwoTone.ElectricScooter
            ),
            IconData(
                name = "ElectricalServices",
                filled = Icons.Filled.ElectricalServices,
                outlined = Icons.Outlined.ElectricalServices,
                rounded = Icons.Rounded.ElectricalServices,
                sharp = Icons.Sharp.ElectricalServices,
                twoTone = Icons.TwoTone.ElectricalServices
            ),
            IconData(
                name = "Elevator",
                filled = Icons.Filled.Elevator,
                outlined = Icons.Outlined.Elevator,
                rounded = Icons.Rounded.Elevator,
                sharp = Icons.Sharp.Elevator,
                twoTone = Icons.TwoTone.Elevator
            ),
            IconData(
                name = "EmojiEmotions",
                filled = Icons.Filled.EmojiEmotions,
                outlined = Icons.Outlined.EmojiEmotions,
                rounded = Icons.Rounded.EmojiEmotions,
                sharp = Icons.Sharp.EmojiEmotions,
                twoTone = Icons.TwoTone.EmojiEmotions
            ),
            IconData(
                name = "EmojiEvents",
                filled = Icons.Filled.EmojiEvents,
                outlined = Icons.Outlined.EmojiEvents,
                rounded = Icons.Rounded.EmojiEvents,
                sharp = Icons.Sharp.EmojiEvents,
                twoTone = Icons.TwoTone.EmojiEvents
            ),
            IconData(
                name = "EmojiFlags",
                filled = Icons.Filled.EmojiFlags,
                outlined = Icons.Outlined.EmojiFlags,
                rounded = Icons.Rounded.EmojiFlags,
                sharp = Icons.Sharp.EmojiFlags,
                twoTone = Icons.TwoTone.EmojiFlags
            ),
            IconData(
                name = "EmojiFoodBeverage",
                filled = Icons.Filled.EmojiFoodBeverage,
                outlined = Icons.Outlined.EmojiFoodBeverage,
                rounded = Icons.Rounded.EmojiFoodBeverage,
                sharp = Icons.Sharp.EmojiFoodBeverage,
                twoTone = Icons.TwoTone.EmojiFoodBeverage
            ),
            IconData(
                name = "EmojiNature",
                filled = Icons.Filled.EmojiNature,
                outlined = Icons.Outlined.EmojiNature,
                rounded = Icons.Rounded.EmojiNature,
                sharp = Icons.Sharp.EmojiNature,
                twoTone = Icons.TwoTone.EmojiNature
            ),
            IconData(
                name = "EmojiObjects",
                filled = Icons.Filled.EmojiObjects,
                outlined = Icons.Outlined.EmojiObjects,
                rounded = Icons.Rounded.EmojiObjects,
                sharp = Icons.Sharp.EmojiObjects,
                twoTone = Icons.TwoTone.EmojiObjects
            ),
            IconData(
                name = "EmojiPeople",
                filled = Icons.Filled.EmojiPeople,
                outlined = Icons.Outlined.EmojiPeople,
                rounded = Icons.Rounded.EmojiPeople,
                sharp = Icons.Sharp.EmojiPeople,
                twoTone = Icons.TwoTone.EmojiPeople
            ),
            IconData(
                name = "EmojiSymbols",
                filled = Icons.Filled.EmojiSymbols,
                outlined = Icons.Outlined.EmojiSymbols,
                rounded = Icons.Rounded.EmojiSymbols,
                sharp = Icons.Sharp.EmojiSymbols,
                twoTone = Icons.TwoTone.EmojiSymbols
            ),
            IconData(
                name = "EmojiTransportation",
                filled = Icons.Filled.EmojiTransportation,
                outlined = Icons.Outlined.EmojiTransportation,
                rounded = Icons.Rounded.EmojiTransportation,
                sharp = Icons.Sharp.EmojiTransportation,
                twoTone = Icons.TwoTone.EmojiTransportation
            ),
            IconData(
                name = "Engineering",
                filled = Icons.Filled.Engineering,
                outlined = Icons.Outlined.Engineering,
                rounded = Icons.Rounded.Engineering,
                sharp = Icons.Sharp.Engineering,
                twoTone = Icons.TwoTone.Engineering
            ),
            IconData(
                name = "EnhancedEncryption",
                filled = Icons.Filled.EnhancedEncryption,
                outlined = Icons.Outlined.EnhancedEncryption,
                rounded = Icons.Rounded.EnhancedEncryption,
                sharp = Icons.Sharp.EnhancedEncryption,
                twoTone = Icons.TwoTone.EnhancedEncryption
            ),
            IconData(
                name = "Equalizer",
                filled = Icons.Filled.Equalizer,
                outlined = Icons.Outlined.Equalizer,
                rounded = Icons.Rounded.Equalizer,
                sharp = Icons.Sharp.Equalizer,
                twoTone = Icons.TwoTone.Equalizer
            ),
            IconData(
                name = "Error",
                filled = Icons.Filled.Error,
                outlined = Icons.Outlined.Error,
                rounded = Icons.Rounded.Error,
                sharp = Icons.Sharp.Error,
                twoTone = Icons.TwoTone.Error
            ),
            IconData(
                name = "ErrorOutline",
                filled = Icons.Filled.ErrorOutline,
                outlined = Icons.Outlined.ErrorOutline,
                rounded = Icons.Rounded.ErrorOutline,
                sharp = Icons.Sharp.ErrorOutline,
                twoTone = Icons.TwoTone.ErrorOutline
            ),
            IconData(
                name = "Escalator",
                filled = Icons.Filled.Escalator,
                outlined = Icons.Outlined.Escalator,
                rounded = Icons.Rounded.Escalator,
                sharp = Icons.Sharp.Escalator,
                twoTone = Icons.TwoTone.Escalator
            ),
            IconData(
                name = "EscalatorWarning",
                filled = Icons.Filled.EscalatorWarning,
                outlined = Icons.Outlined.EscalatorWarning,
                rounded = Icons.Rounded.EscalatorWarning,
                sharp = Icons.Sharp.EscalatorWarning,
                twoTone = Icons.TwoTone.EscalatorWarning
            ),
            IconData(
                name = "Euro",
                filled = Icons.Filled.Euro,
                outlined = Icons.Outlined.Euro,
                rounded = Icons.Rounded.Euro,
                sharp = Icons.Sharp.Euro,
                twoTone = Icons.TwoTone.Euro
            ),
            IconData(
                name = "EuroSymbol",
                filled = Icons.Filled.EuroSymbol,
                outlined = Icons.Outlined.EuroSymbol,
                rounded = Icons.Rounded.EuroSymbol,
                sharp = Icons.Sharp.EuroSymbol,
                twoTone = Icons.TwoTone.EuroSymbol
            ),
            IconData(
                name = "EvStation",
                filled = Icons.Filled.EvStation,
                outlined = Icons.Outlined.EvStation,
                rounded = Icons.Rounded.EvStation,
                sharp = Icons.Sharp.EvStation,
                twoTone = Icons.TwoTone.EvStation
            ),
            IconData(
                name = "Event",
                filled = Icons.Filled.Event,
                outlined = Icons.Outlined.Event,
                rounded = Icons.Rounded.Event,
                sharp = Icons.Sharp.Event,
                twoTone = Icons.TwoTone.Event
            ),
            IconData(
                name = "EventAvailable",
                filled = Icons.Filled.EventAvailable,
                outlined = Icons.Outlined.EventAvailable,
                rounded = Icons.Rounded.EventAvailable,
                sharp = Icons.Sharp.EventAvailable,
                twoTone = Icons.TwoTone.EventAvailable
            ),
            IconData(
                name = "EventBusy",
                filled = Icons.Filled.EventBusy,
                outlined = Icons.Outlined.EventBusy,
                rounded = Icons.Rounded.EventBusy,
                sharp = Icons.Sharp.EventBusy,
                twoTone = Icons.TwoTone.EventBusy
            ),
            IconData(
                name = "EventNote",
                filled = Icons.Filled.EventNote,
                outlined = Icons.Outlined.EventNote,
                rounded = Icons.Rounded.EventNote,
                sharp = Icons.Sharp.EventNote,
                twoTone = Icons.TwoTone.EventNote
            ),
            IconData(
                name = "EventSeat",
                filled = Icons.Filled.EventSeat,
                outlined = Icons.Outlined.EventSeat,
                rounded = Icons.Rounded.EventSeat,
                sharp = Icons.Sharp.EventSeat,
                twoTone = Icons.TwoTone.EventSeat
            ),
            IconData(
                name = "ExpandLess",
                filled = Icons.Filled.ExpandLess,
                outlined = Icons.Outlined.ExpandLess,
                rounded = Icons.Rounded.ExpandLess,
                sharp = Icons.Sharp.ExpandLess,
                twoTone = Icons.TwoTone.ExpandLess
            ),
            IconData(
                name = "ExpandMore",
                filled = Icons.Filled.ExpandMore,
                outlined = Icons.Outlined.ExpandMore,
                rounded = Icons.Rounded.ExpandMore,
                sharp = Icons.Sharp.ExpandMore,
                twoTone = Icons.TwoTone.ExpandMore
            ),
            IconData(
                name = "Explicit",
                filled = Icons.Filled.Explicit,
                outlined = Icons.Outlined.Explicit,
                rounded = Icons.Rounded.Explicit,
                sharp = Icons.Sharp.Explicit,
                twoTone = Icons.TwoTone.Explicit
            ),
            IconData(
                name = "Explore",
                filled = Icons.Filled.Explore,
                outlined = Icons.Outlined.Explore,
                rounded = Icons.Rounded.Explore,
                sharp = Icons.Sharp.Explore,
                twoTone = Icons.TwoTone.Explore
            ),
            IconData(
                name = "ExploreOff",
                filled = Icons.Filled.ExploreOff,
                outlined = Icons.Outlined.ExploreOff,
                rounded = Icons.Rounded.ExploreOff,
                sharp = Icons.Sharp.ExploreOff,
                twoTone = Icons.TwoTone.ExploreOff
            ),
            IconData(
                name = "Exposure",
                filled = Icons.Filled.Exposure,
                outlined = Icons.Outlined.Exposure,
                rounded = Icons.Rounded.Exposure,
                sharp = Icons.Sharp.Exposure,
                twoTone = Icons.TwoTone.Exposure
            ),
            IconData(
                name = "ExposureNeg1",
                filled = Icons.Filled.ExposureNeg1,
                outlined = Icons.Outlined.ExposureNeg1,
                rounded = Icons.Rounded.ExposureNeg1,
                sharp = Icons.Sharp.ExposureNeg1,
                twoTone = Icons.TwoTone.ExposureNeg1
            ),
            IconData(
                name = "ExposureNeg2",
                filled = Icons.Filled.ExposureNeg2,
                outlined = Icons.Outlined.ExposureNeg2,
                rounded = Icons.Rounded.ExposureNeg2,
                sharp = Icons.Sharp.ExposureNeg2,
                twoTone = Icons.TwoTone.ExposureNeg2
            ),
            IconData(
                name = "ExposurePlus1",
                filled = Icons.Filled.ExposurePlus1,
                outlined = Icons.Outlined.ExposurePlus1,
                rounded = Icons.Rounded.ExposurePlus1,
                sharp = Icons.Sharp.ExposurePlus1,
                twoTone = Icons.TwoTone.ExposurePlus1
            ),
            IconData(
                name = "ExposurePlus2",
                filled = Icons.Filled.ExposurePlus2,
                outlined = Icons.Outlined.ExposurePlus2,
                rounded = Icons.Rounded.ExposurePlus2,
                sharp = Icons.Sharp.ExposurePlus2,
                twoTone = Icons.TwoTone.ExposurePlus2
            ),
            IconData(
                name = "ExposureZero",
                filled = Icons.Filled.ExposureZero,
                outlined = Icons.Outlined.ExposureZero,
                rounded = Icons.Rounded.ExposureZero,
                sharp = Icons.Sharp.ExposureZero,
                twoTone = Icons.TwoTone.ExposureZero
            ),
            IconData(
                name = "Extension",
                filled = Icons.Filled.Extension,
                outlined = Icons.Outlined.Extension,
                rounded = Icons.Rounded.Extension,
                sharp = Icons.Sharp.Extension,
                twoTone = Icons.TwoTone.Extension
            ),
            IconData(
                name = "Facebook",
                filled = Icons.Filled.Facebook,
                outlined = Icons.Outlined.Facebook,
                rounded = Icons.Rounded.Facebook,
                sharp = Icons.Sharp.Facebook,
                twoTone = Icons.TwoTone.Facebook
            ),
            IconData(
                name = "FactCheck",
                filled = Icons.Filled.FactCheck,
                outlined = Icons.Outlined.FactCheck,
                rounded = Icons.Rounded.FactCheck,
                sharp = Icons.Sharp.FactCheck,
                twoTone = Icons.TwoTone.FactCheck
            ),
            IconData(
                name = "FamilyRestroom",
                filled = Icons.Filled.FamilyRestroom,
                outlined = Icons.Outlined.FamilyRestroom,
                rounded = Icons.Rounded.FamilyRestroom,
                sharp = Icons.Sharp.FamilyRestroom,
                twoTone = Icons.TwoTone.FamilyRestroom
            ),
            IconData(
                name = "FastForward",
                filled = Icons.Filled.FastForward,
                outlined = Icons.Outlined.FastForward,
                rounded = Icons.Rounded.FastForward,
                sharp = Icons.Sharp.FastForward,
                twoTone = Icons.TwoTone.FastForward
            ),
            IconData(
                name = "FastRewind",
                filled = Icons.Filled.FastRewind,
                outlined = Icons.Outlined.FastRewind,
                rounded = Icons.Rounded.FastRewind,
                sharp = Icons.Sharp.FastRewind,
                twoTone = Icons.TwoTone.FastRewind
            ),
            IconData(
                name = "Fastfood",
                filled = Icons.Filled.Fastfood,
                outlined = Icons.Outlined.Fastfood,
                rounded = Icons.Rounded.Fastfood,
                sharp = Icons.Sharp.Fastfood,
                twoTone = Icons.TwoTone.Fastfood
            ),
            IconData(
                name = "FeaturedPlayList",
                filled = Icons.Filled.FeaturedPlayList,
                outlined = Icons.Outlined.FeaturedPlayList,
                rounded = Icons.Rounded.FeaturedPlayList,
                sharp = Icons.Sharp.FeaturedPlayList,
                twoTone = Icons.TwoTone.FeaturedPlayList
            ),
            IconData(
                name = "FeaturedVideo",
                filled = Icons.Filled.FeaturedVideo,
                outlined = Icons.Outlined.FeaturedVideo,
                rounded = Icons.Rounded.FeaturedVideo,
                sharp = Icons.Sharp.FeaturedVideo,
                twoTone = Icons.TwoTone.FeaturedVideo
            ),
            IconData(
                name = "Feedback",
                filled = Icons.Filled.Feedback,
                outlined = Icons.Outlined.Feedback,
                rounded = Icons.Rounded.Feedback,
                sharp = Icons.Sharp.Feedback,
                twoTone = Icons.TwoTone.Feedback
            ),
            IconData(
                name = "Fence",
                filled = Icons.Filled.Fence,
                outlined = Icons.Outlined.Fence,
                rounded = Icons.Rounded.Fence,
                sharp = Icons.Sharp.Fence,
                twoTone = Icons.TwoTone.Fence
            ),
            IconData(
                name = "FiberDvr",
                filled = Icons.Filled.FiberDvr,
                outlined = Icons.Outlined.FiberDvr,
                rounded = Icons.Rounded.FiberDvr,
                sharp = Icons.Sharp.FiberDvr,
                twoTone = Icons.TwoTone.FiberDvr
            ),
            IconData(
                name = "FiberManualRecord",
                filled = Icons.Filled.FiberManualRecord,
                outlined = Icons.Outlined.FiberManualRecord,
                rounded = Icons.Rounded.FiberManualRecord,
                sharp = Icons.Sharp.FiberManualRecord,
                twoTone = Icons.TwoTone.FiberManualRecord
            ),
            IconData(
                name = "FiberNew",
                filled = Icons.Filled.FiberNew,
                outlined = Icons.Outlined.FiberNew,
                rounded = Icons.Rounded.FiberNew,
                sharp = Icons.Sharp.FiberNew,
                twoTone = Icons.TwoTone.FiberNew
            ),
            IconData(
                name = "FiberPin",
                filled = Icons.Filled.FiberPin,
                outlined = Icons.Outlined.FiberPin,
                rounded = Icons.Rounded.FiberPin,
                sharp = Icons.Sharp.FiberPin,
                twoTone = Icons.TwoTone.FiberPin
            ),
            IconData(
                name = "FiberSmartRecord",
                filled = Icons.Filled.FiberSmartRecord,
                outlined = Icons.Outlined.FiberSmartRecord,
                rounded = Icons.Rounded.FiberSmartRecord,
                sharp = Icons.Sharp.FiberSmartRecord,
                twoTone = Icons.TwoTone.FiberSmartRecord
            ),
            IconData(
                name = "FileCopy",
                filled = Icons.Filled.FileCopy,
                outlined = Icons.Outlined.FileCopy,
                rounded = Icons.Rounded.FileCopy,
                sharp = Icons.Sharp.FileCopy,
                twoTone = Icons.TwoTone.FileCopy
            ),
            IconData(
                name = "Filter",
                filled = Icons.Filled.Filter,
                outlined = Icons.Outlined.Filter,
                rounded = Icons.Rounded.Filter,
                sharp = Icons.Sharp.Filter,
                twoTone = Icons.TwoTone.Filter
            ),
            IconData(
                name = "Filter1",
                filled = Icons.Filled.Filter1,
                outlined = Icons.Outlined.Filter1,
                rounded = Icons.Rounded.Filter1,
                sharp = Icons.Sharp.Filter1,
                twoTone = Icons.TwoTone.Filter1
            ),
            IconData(
                name = "Filter2",
                filled = Icons.Filled.Filter2,
                outlined = Icons.Outlined.Filter2,
                rounded = Icons.Rounded.Filter2,
                sharp = Icons.Sharp.Filter2,
                twoTone = Icons.TwoTone.Filter2
            ),
            IconData(
                name = "Filter3",
                filled = Icons.Filled.Filter3,
                outlined = Icons.Outlined.Filter3,
                rounded = Icons.Rounded.Filter3,
                sharp = Icons.Sharp.Filter3,
                twoTone = Icons.TwoTone.Filter3
            ),
            IconData(
                name = "Filter4",
                filled = Icons.Filled.Filter4,
                outlined = Icons.Outlined.Filter4,
                rounded = Icons.Rounded.Filter4,
                sharp = Icons.Sharp.Filter4,
                twoTone = Icons.TwoTone.Filter4
            ),
            IconData(
                name = "Filter5",
                filled = Icons.Filled.Filter5,
                outlined = Icons.Outlined.Filter5,
                rounded = Icons.Rounded.Filter5,
                sharp = Icons.Sharp.Filter5,
                twoTone = Icons.TwoTone.Filter5
            ),
            IconData(
                name = "Filter6",
                filled = Icons.Filled.Filter6,
                outlined = Icons.Outlined.Filter6,
                rounded = Icons.Rounded.Filter6,
                sharp = Icons.Sharp.Filter6,
                twoTone = Icons.TwoTone.Filter6
            ),
            IconData(
                name = "Filter7",
                filled = Icons.Filled.Filter7,
                outlined = Icons.Outlined.Filter7,
                rounded = Icons.Rounded.Filter7,
                sharp = Icons.Sharp.Filter7,
                twoTone = Icons.TwoTone.Filter7
            ),
            IconData(
                name = "Filter8",
                filled = Icons.Filled.Filter8,
                outlined = Icons.Outlined.Filter8,
                rounded = Icons.Rounded.Filter8,
                sharp = Icons.Sharp.Filter8,
                twoTone = Icons.TwoTone.Filter8
            ),
            IconData(
                name = "Filter9",
                filled = Icons.Filled.Filter9,
                outlined = Icons.Outlined.Filter9,
                rounded = Icons.Rounded.Filter9,
                sharp = Icons.Sharp.Filter9,
                twoTone = Icons.TwoTone.Filter9
            ),
            IconData(
                name = "Filter9Plus",
                filled = Icons.Filled.Filter9Plus,
                outlined = Icons.Outlined.Filter9Plus,
                rounded = Icons.Rounded.Filter9Plus,
                sharp = Icons.Sharp.Filter9Plus,
                twoTone = Icons.TwoTone.Filter9Plus
            ),
            IconData(
                name = "FilterAlt",
                filled = Icons.Filled.FilterAlt,
                outlined = Icons.Outlined.FilterAlt,
                rounded = Icons.Rounded.FilterAlt,
                sharp = Icons.Sharp.FilterAlt,
                twoTone = Icons.TwoTone.FilterAlt
            ),
            IconData(
                name = "FilterBAndW",
                filled = Icons.Filled.FilterBAndW,
                outlined = Icons.Outlined.FilterBAndW,
                rounded = Icons.Rounded.FilterBAndW,
                sharp = Icons.Sharp.FilterBAndW,
                twoTone = Icons.TwoTone.FilterBAndW
            ),
            IconData(
                name = "FilterCenterFocus",
                filled = Icons.Filled.FilterCenterFocus,
                outlined = Icons.Outlined.FilterCenterFocus,
                rounded = Icons.Rounded.FilterCenterFocus,
                sharp = Icons.Sharp.FilterCenterFocus,
                twoTone = Icons.TwoTone.FilterCenterFocus
            ),
            IconData(
                name = "FilterDrama",
                filled = Icons.Filled.FilterDrama,
                outlined = Icons.Outlined.FilterDrama,
                rounded = Icons.Rounded.FilterDrama,
                sharp = Icons.Sharp.FilterDrama,
                twoTone = Icons.TwoTone.FilterDrama
            ),
            IconData(
                name = "FilterFrames",
                filled = Icons.Filled.FilterFrames,
                outlined = Icons.Outlined.FilterFrames,
                rounded = Icons.Rounded.FilterFrames,
                sharp = Icons.Sharp.FilterFrames,
                twoTone = Icons.TwoTone.FilterFrames
            ),
            IconData(
                name = "FilterHdr",
                filled = Icons.Filled.FilterHdr,
                outlined = Icons.Outlined.FilterHdr,
                rounded = Icons.Rounded.FilterHdr,
                sharp = Icons.Sharp.FilterHdr,
                twoTone = Icons.TwoTone.FilterHdr
            ),
            IconData(
                name = "FilterList",
                filled = Icons.Filled.FilterList,
                outlined = Icons.Outlined.FilterList,
                rounded = Icons.Rounded.FilterList,
                sharp = Icons.Sharp.FilterList,
                twoTone = Icons.TwoTone.FilterList
            ),
            IconData(
                name = "FilterNone",
                filled = Icons.Filled.FilterNone,
                outlined = Icons.Outlined.FilterNone,
                rounded = Icons.Rounded.FilterNone,
                sharp = Icons.Sharp.FilterNone,
                twoTone = Icons.TwoTone.FilterNone
            ),
            IconData(
                name = "FilterTiltShift",
                filled = Icons.Filled.FilterTiltShift,
                outlined = Icons.Outlined.FilterTiltShift,
                rounded = Icons.Rounded.FilterTiltShift,
                sharp = Icons.Sharp.FilterTiltShift,
                twoTone = Icons.TwoTone.FilterTiltShift
            ),
            IconData(
                name = "FilterVintage",
                filled = Icons.Filled.FilterVintage,
                outlined = Icons.Outlined.FilterVintage,
                rounded = Icons.Rounded.FilterVintage,
                sharp = Icons.Sharp.FilterVintage,
                twoTone = Icons.TwoTone.FilterVintage
            ),
            IconData(
                name = "FindInPage",
                filled = Icons.Filled.FindInPage,
                outlined = Icons.Outlined.FindInPage,
                rounded = Icons.Rounded.FindInPage,
                sharp = Icons.Sharp.FindInPage,
                twoTone = Icons.TwoTone.FindInPage
            ),
            IconData(
                name = "FindReplace",
                filled = Icons.Filled.FindReplace,
                outlined = Icons.Outlined.FindReplace,
                rounded = Icons.Rounded.FindReplace,
                sharp = Icons.Sharp.FindReplace,
                twoTone = Icons.TwoTone.FindReplace
            ),
            IconData(
                name = "Fingerprint",
                filled = Icons.Filled.Fingerprint,
                outlined = Icons.Outlined.Fingerprint,
                rounded = Icons.Rounded.Fingerprint,
                sharp = Icons.Sharp.Fingerprint,
                twoTone = Icons.TwoTone.Fingerprint
            ),
            IconData(
                name = "FireExtinguisher",
                filled = Icons.Filled.FireExtinguisher,
                outlined = Icons.Outlined.FireExtinguisher,
                rounded = Icons.Rounded.FireExtinguisher,
                sharp = Icons.Sharp.FireExtinguisher,
                twoTone = Icons.TwoTone.FireExtinguisher
            ),
            IconData(
                name = "Fireplace",
                filled = Icons.Filled.Fireplace,
                outlined = Icons.Outlined.Fireplace,
                rounded = Icons.Rounded.Fireplace,
                sharp = Icons.Sharp.Fireplace,
                twoTone = Icons.TwoTone.Fireplace
            ),
            IconData(
                name = "FirstPage",
                filled = Icons.Filled.FirstPage,
                outlined = Icons.Outlined.FirstPage,
                rounded = Icons.Rounded.FirstPage,
                sharp = Icons.Sharp.FirstPage,
                twoTone = Icons.TwoTone.FirstPage
            ),
            IconData(
                name = "FitnessCenter",
                filled = Icons.Filled.FitnessCenter,
                outlined = Icons.Outlined.FitnessCenter,
                rounded = Icons.Rounded.FitnessCenter,
                sharp = Icons.Sharp.FitnessCenter,
                twoTone = Icons.TwoTone.FitnessCenter
            ),
            IconData(
                name = "Flag",
                filled = Icons.Filled.Flag,
                outlined = Icons.Outlined.Flag,
                rounded = Icons.Rounded.Flag,
                sharp = Icons.Sharp.Flag,
                twoTone = Icons.TwoTone.Flag
            ),
            IconData(
                name = "Flaky",
                filled = Icons.Filled.Flaky,
                outlined = Icons.Outlined.Flaky,
                rounded = Icons.Rounded.Flaky,
                sharp = Icons.Sharp.Flaky,
                twoTone = Icons.TwoTone.Flaky
            ),
            IconData(
                name = "Flare",
                filled = Icons.Filled.Flare,
                outlined = Icons.Outlined.Flare,
                rounded = Icons.Rounded.Flare,
                sharp = Icons.Sharp.Flare,
                twoTone = Icons.TwoTone.Flare
            ),
            IconData(
                name = "FlashAuto",
                filled = Icons.Filled.FlashAuto,
                outlined = Icons.Outlined.FlashAuto,
                rounded = Icons.Rounded.FlashAuto,
                sharp = Icons.Sharp.FlashAuto,
                twoTone = Icons.TwoTone.FlashAuto
            ),
            IconData(
                name = "FlashOff",
                filled = Icons.Filled.FlashOff,
                outlined = Icons.Outlined.FlashOff,
                rounded = Icons.Rounded.FlashOff,
                sharp = Icons.Sharp.FlashOff,
                twoTone = Icons.TwoTone.FlashOff
            ),
            IconData(
                name = "FlashOn",
                filled = Icons.Filled.FlashOn,
                outlined = Icons.Outlined.FlashOn,
                rounded = Icons.Rounded.FlashOn,
                sharp = Icons.Sharp.FlashOn,
                twoTone = Icons.TwoTone.FlashOn
            ),
            IconData(
                name = "Flight",
                filled = Icons.Filled.Flight,
                outlined = Icons.Outlined.Flight,
                rounded = Icons.Rounded.Flight,
                sharp = Icons.Sharp.Flight,
                twoTone = Icons.TwoTone.Flight
            ),
            IconData(
                name = "FlightLand",
                filled = Icons.Filled.FlightLand,
                outlined = Icons.Outlined.FlightLand,
                rounded = Icons.Rounded.FlightLand,
                sharp = Icons.Sharp.FlightLand,
                twoTone = Icons.TwoTone.FlightLand
            ),
            IconData(
                name = "FlightTakeoff",
                filled = Icons.Filled.FlightTakeoff,
                outlined = Icons.Outlined.FlightTakeoff,
                rounded = Icons.Rounded.FlightTakeoff,
                sharp = Icons.Sharp.FlightTakeoff,
                twoTone = Icons.TwoTone.FlightTakeoff
            ),
            IconData(
                name = "Flip",
                filled = Icons.Filled.Flip,
                outlined = Icons.Outlined.Flip,
                rounded = Icons.Rounded.Flip,
                sharp = Icons.Sharp.Flip,
                twoTone = Icons.TwoTone.Flip
            ),
            IconData(
                name = "FlipCameraAndroid",
                filled = Icons.Filled.FlipCameraAndroid,
                outlined = Icons.Outlined.FlipCameraAndroid,
                rounded = Icons.Rounded.FlipCameraAndroid,
                sharp = Icons.Sharp.FlipCameraAndroid,
                twoTone = Icons.TwoTone.FlipCameraAndroid
            ),
            IconData(
                name = "FlipCameraIos",
                filled = Icons.Filled.FlipCameraIos,
                outlined = Icons.Outlined.FlipCameraIos,
                rounded = Icons.Rounded.FlipCameraIos,
                sharp = Icons.Sharp.FlipCameraIos,
                twoTone = Icons.TwoTone.FlipCameraIos
            ),
            IconData(
                name = "FlipToBack",
                filled = Icons.Filled.FlipToBack,
                outlined = Icons.Outlined.FlipToBack,
                rounded = Icons.Rounded.FlipToBack,
                sharp = Icons.Sharp.FlipToBack,
                twoTone = Icons.TwoTone.FlipToBack
            ),
            IconData(
                name = "FlipToFront",
                filled = Icons.Filled.FlipToFront,
                outlined = Icons.Outlined.FlipToFront,
                rounded = Icons.Rounded.FlipToFront,
                sharp = Icons.Sharp.FlipToFront,
                twoTone = Icons.TwoTone.FlipToFront
            ),
            IconData(
                name = "Folder",
                filled = Icons.Filled.Folder,
                outlined = Icons.Outlined.Folder,
                rounded = Icons.Rounded.Folder,
                sharp = Icons.Sharp.Folder,
                twoTone = Icons.TwoTone.Folder
            ),
            IconData(
                name = "FolderOpen",
                filled = Icons.Filled.FolderOpen,
                outlined = Icons.Outlined.FolderOpen,
                rounded = Icons.Rounded.FolderOpen,
                sharp = Icons.Sharp.FolderOpen,
                twoTone = Icons.TwoTone.FolderOpen
            ),
            IconData(
                name = "FolderShared",
                filled = Icons.Filled.FolderShared,
                outlined = Icons.Outlined.FolderShared,
                rounded = Icons.Rounded.FolderShared,
                sharp = Icons.Sharp.FolderShared,
                twoTone = Icons.TwoTone.FolderShared
            ),
            IconData(
                name = "FolderSpecial",
                filled = Icons.Filled.FolderSpecial,
                outlined = Icons.Outlined.FolderSpecial,
                rounded = Icons.Rounded.FolderSpecial,
                sharp = Icons.Sharp.FolderSpecial,
                twoTone = Icons.TwoTone.FolderSpecial
            ),
            IconData(
                name = "FollowTheSigns",
                filled = Icons.Filled.FollowTheSigns,
                outlined = Icons.Outlined.FollowTheSigns,
                rounded = Icons.Rounded.FollowTheSigns,
                sharp = Icons.Sharp.FollowTheSigns,
                twoTone = Icons.TwoTone.FollowTheSigns
            ),
            IconData(
                name = "FontDownload",
                filled = Icons.Filled.FontDownload,
                outlined = Icons.Outlined.FontDownload,
                rounded = Icons.Rounded.FontDownload,
                sharp = Icons.Sharp.FontDownload,
                twoTone = Icons.TwoTone.FontDownload
            ),
            IconData(
                name = "FoodBank",
                filled = Icons.Filled.FoodBank,
                outlined = Icons.Outlined.FoodBank,
                rounded = Icons.Rounded.FoodBank,
                sharp = Icons.Sharp.FoodBank,
                twoTone = Icons.TwoTone.FoodBank
            ),
            IconData(
                name = "FormatAlignCenter",
                filled = Icons.Filled.FormatAlignCenter,
                outlined = Icons.Outlined.FormatAlignCenter,
                rounded = Icons.Rounded.FormatAlignCenter,
                sharp = Icons.Sharp.FormatAlignCenter,
                twoTone = Icons.TwoTone.FormatAlignCenter
            ),
            IconData(
                name = "FormatAlignJustify",
                filled = Icons.Filled.FormatAlignJustify,
                outlined = Icons.Outlined.FormatAlignJustify,
                rounded = Icons.Rounded.FormatAlignJustify,
                sharp = Icons.Sharp.FormatAlignJustify,
                twoTone = Icons.TwoTone.FormatAlignJustify
            ),
            IconData(
                name = "FormatAlignLeft",
                filled = Icons.Filled.FormatAlignLeft,
                outlined = Icons.Outlined.FormatAlignLeft,
                rounded = Icons.Rounded.FormatAlignLeft,
                sharp = Icons.Sharp.FormatAlignLeft,
                twoTone = Icons.TwoTone.FormatAlignLeft
            ),
            IconData(
                name = "FormatAlignRight",
                filled = Icons.Filled.FormatAlignRight,
                outlined = Icons.Outlined.FormatAlignRight,
                rounded = Icons.Rounded.FormatAlignRight,
                sharp = Icons.Sharp.FormatAlignRight,
                twoTone = Icons.TwoTone.FormatAlignRight
            ),
            IconData(
                name = "FormatBold",
                filled = Icons.Filled.FormatBold,
                outlined = Icons.Outlined.FormatBold,
                rounded = Icons.Rounded.FormatBold,
                sharp = Icons.Sharp.FormatBold,
                twoTone = Icons.TwoTone.FormatBold
            ),
            IconData(
                name = "FormatClear",
                filled = Icons.Filled.FormatClear,
                outlined = Icons.Outlined.FormatClear,
                rounded = Icons.Rounded.FormatClear,
                sharp = Icons.Sharp.FormatClear,
                twoTone = Icons.TwoTone.FormatClear
            ),
            IconData(
                name = "FormatColorReset",
                filled = Icons.Filled.FormatColorReset,
                outlined = Icons.Outlined.FormatColorReset,
                rounded = Icons.Rounded.FormatColorReset,
                sharp = Icons.Sharp.FormatColorReset,
                twoTone = Icons.TwoTone.FormatColorReset
            ),
            IconData(
                name = "FormatIndentDecrease",
                filled = Icons.Filled.FormatIndentDecrease,
                outlined = Icons.Outlined.FormatIndentDecrease,
                rounded = Icons.Rounded.FormatIndentDecrease,
                sharp = Icons.Sharp.FormatIndentDecrease,
                twoTone = Icons.TwoTone.FormatIndentDecrease
            ),
            IconData(
                name = "FormatIndentIncrease",
                filled = Icons.Filled.FormatIndentIncrease,
                outlined = Icons.Outlined.FormatIndentIncrease,
                rounded = Icons.Rounded.FormatIndentIncrease,
                sharp = Icons.Sharp.FormatIndentIncrease,
                twoTone = Icons.TwoTone.FormatIndentIncrease
            ),
            IconData(
                name = "FormatItalic",
                filled = Icons.Filled.FormatItalic,
                outlined = Icons.Outlined.FormatItalic,
                rounded = Icons.Rounded.FormatItalic,
                sharp = Icons.Sharp.FormatItalic,
                twoTone = Icons.TwoTone.FormatItalic
            ),
            IconData(
                name = "FormatLineSpacing",
                filled = Icons.Filled.FormatLineSpacing,
                outlined = Icons.Outlined.FormatLineSpacing,
                rounded = Icons.Rounded.FormatLineSpacing,
                sharp = Icons.Sharp.FormatLineSpacing,
                twoTone = Icons.TwoTone.FormatLineSpacing
            ),
            IconData(
                name = "FormatListBulleted",
                filled = Icons.Filled.FormatListBulleted,
                outlined = Icons.Outlined.FormatListBulleted,
                rounded = Icons.Rounded.FormatListBulleted,
                sharp = Icons.Sharp.FormatListBulleted,
                twoTone = Icons.TwoTone.FormatListBulleted
            ),
            IconData(
                name = "FormatListNumbered",
                filled = Icons.Filled.FormatListNumbered,
                outlined = Icons.Outlined.FormatListNumbered,
                rounded = Icons.Rounded.FormatListNumbered,
                sharp = Icons.Sharp.FormatListNumbered,
                twoTone = Icons.TwoTone.FormatListNumbered
            ),
            IconData(
                name = "FormatListNumberedRtl",
                filled = Icons.Filled.FormatListNumberedRtl,
                outlined = Icons.Outlined.FormatListNumberedRtl,
                rounded = Icons.Rounded.FormatListNumberedRtl,
                sharp = Icons.Sharp.FormatListNumberedRtl,
                twoTone = Icons.TwoTone.FormatListNumberedRtl
            ),
            IconData(
                name = "FormatPaint",
                filled = Icons.Filled.FormatPaint,
                outlined = Icons.Outlined.FormatPaint,
                rounded = Icons.Rounded.FormatPaint,
                sharp = Icons.Sharp.FormatPaint,
                twoTone = Icons.TwoTone.FormatPaint
            ),
            IconData(
                name = "FormatQuote",
                filled = Icons.Filled.FormatQuote,
                outlined = Icons.Outlined.FormatQuote,
                rounded = Icons.Rounded.FormatQuote,
                sharp = Icons.Sharp.FormatQuote,
                twoTone = Icons.TwoTone.FormatQuote
            ),
            IconData(
                name = "FormatShapes",
                filled = Icons.Filled.FormatShapes,
                outlined = Icons.Outlined.FormatShapes,
                rounded = Icons.Rounded.FormatShapes,
                sharp = Icons.Sharp.FormatShapes,
                twoTone = Icons.TwoTone.FormatShapes
            ),
            IconData(
                name = "FormatSize",
                filled = Icons.Filled.FormatSize,
                outlined = Icons.Outlined.FormatSize,
                rounded = Icons.Rounded.FormatSize,
                sharp = Icons.Sharp.FormatSize,
                twoTone = Icons.TwoTone.FormatSize
            ),
            IconData(
                name = "FormatStrikethrough",
                filled = Icons.Filled.FormatStrikethrough,
                outlined = Icons.Outlined.FormatStrikethrough,
                rounded = Icons.Rounded.FormatStrikethrough,
                sharp = Icons.Sharp.FormatStrikethrough,
                twoTone = Icons.TwoTone.FormatStrikethrough
            ),
            IconData(
                name = "FormatTextdirectionLToR",
                filled = Icons.Filled.FormatTextdirectionLToR,
                outlined = Icons.Outlined.FormatTextdirectionLToR,
                rounded = Icons.Rounded.FormatTextdirectionLToR,
                sharp = Icons.Sharp.FormatTextdirectionLToR,
                twoTone = Icons.TwoTone.FormatTextdirectionLToR
            ),
            IconData(
                name = "FormatTextdirectionRToL",
                filled = Icons.Filled.FormatTextdirectionRToL,
                outlined = Icons.Outlined.FormatTextdirectionRToL,
                rounded = Icons.Rounded.FormatTextdirectionRToL,
                sharp = Icons.Sharp.FormatTextdirectionRToL,
                twoTone = Icons.TwoTone.FormatTextdirectionRToL
            ),
            IconData(
                name = "FormatUnderlined",
                filled = Icons.Filled.FormatUnderlined,
                outlined = Icons.Outlined.FormatUnderlined,
                rounded = Icons.Rounded.FormatUnderlined,
                sharp = Icons.Sharp.FormatUnderlined,
                twoTone = Icons.TwoTone.FormatUnderlined
            ),
            IconData(
                name = "Forum",
                filled = Icons.Filled.Forum,
                outlined = Icons.Outlined.Forum,
                rounded = Icons.Rounded.Forum,
                sharp = Icons.Sharp.Forum,
                twoTone = Icons.TwoTone.Forum
            ),
            IconData(
                name = "Forward",
                filled = Icons.Filled.Forward,
                outlined = Icons.Outlined.Forward,
                rounded = Icons.Rounded.Forward,
                sharp = Icons.Sharp.Forward,
                twoTone = Icons.TwoTone.Forward
            ),
            IconData(
                name = "Forward10",
                filled = Icons.Filled.Forward10,
                outlined = Icons.Outlined.Forward10,
                rounded = Icons.Rounded.Forward10,
                sharp = Icons.Sharp.Forward10,
                twoTone = Icons.TwoTone.Forward10
            ),
            IconData(
                name = "Forward30",
                filled = Icons.Filled.Forward30,
                outlined = Icons.Outlined.Forward30,
                rounded = Icons.Rounded.Forward30,
                sharp = Icons.Sharp.Forward30,
                twoTone = Icons.TwoTone.Forward30
            ),
            IconData(
                name = "Forward5",
                filled = Icons.Filled.Forward5,
                outlined = Icons.Outlined.Forward5,
                rounded = Icons.Rounded.Forward5,
                sharp = Icons.Sharp.Forward5,
                twoTone = Icons.TwoTone.Forward5
            ),
            IconData(
                name = "ForwardToInbox",
                filled = Icons.Filled.ForwardToInbox,
                outlined = Icons.Outlined.ForwardToInbox,
                rounded = Icons.Rounded.ForwardToInbox,
                sharp = Icons.Sharp.ForwardToInbox,
                twoTone = Icons.TwoTone.ForwardToInbox
            ),
            IconData(
                name = "Foundation",
                filled = Icons.Filled.Foundation,
                outlined = Icons.Outlined.Foundation,
                rounded = Icons.Rounded.Foundation,
                sharp = Icons.Sharp.Foundation,
                twoTone = Icons.TwoTone.Foundation
            ),
            IconData(
                name = "FreeBreakfast",
                filled = Icons.Filled.FreeBreakfast,
                outlined = Icons.Outlined.FreeBreakfast,
                rounded = Icons.Rounded.FreeBreakfast,
                sharp = Icons.Sharp.FreeBreakfast,
                twoTone = Icons.TwoTone.FreeBreakfast
            ),
            IconData(
                name = "Fullscreen",
                filled = Icons.Filled.Fullscreen,
                outlined = Icons.Outlined.Fullscreen,
                rounded = Icons.Rounded.Fullscreen,
                sharp = Icons.Sharp.Fullscreen,
                twoTone = Icons.TwoTone.Fullscreen
            ),
            IconData(
                name = "FullscreenExit",
                filled = Icons.Filled.FullscreenExit,
                outlined = Icons.Outlined.FullscreenExit,
                rounded = Icons.Rounded.FullscreenExit,
                sharp = Icons.Sharp.FullscreenExit,
                twoTone = Icons.TwoTone.FullscreenExit
            ),
            IconData(
                name = "Functions",
                filled = Icons.Filled.Functions,
                outlined = Icons.Outlined.Functions,
                rounded = Icons.Rounded.Functions,
                sharp = Icons.Sharp.Functions,
                twoTone = Icons.TwoTone.Functions
            ),
            IconData(
                name = "GTranslate",
                filled = Icons.Filled.GTranslate,
                outlined = Icons.Outlined.GTranslate,
                rounded = Icons.Rounded.GTranslate,
                sharp = Icons.Sharp.GTranslate,
                twoTone = Icons.TwoTone.GTranslate
            ),
            IconData(
                name = "Gamepad",
                filled = Icons.Filled.Gamepad,
                outlined = Icons.Outlined.Gamepad,
                rounded = Icons.Rounded.Gamepad,
                sharp = Icons.Sharp.Gamepad,
                twoTone = Icons.TwoTone.Gamepad
            ),
            IconData(
                name = "Games",
                filled = Icons.Filled.Games,
                outlined = Icons.Outlined.Games,
                rounded = Icons.Rounded.Games,
                sharp = Icons.Sharp.Games,
                twoTone = Icons.TwoTone.Games
            ),
            IconData(
                name = "Gavel",
                filled = Icons.Filled.Gavel,
                outlined = Icons.Outlined.Gavel,
                rounded = Icons.Rounded.Gavel,
                sharp = Icons.Sharp.Gavel,
                twoTone = Icons.TwoTone.Gavel
            ),
            IconData(
                name = "Gesture",
                filled = Icons.Filled.Gesture,
                outlined = Icons.Outlined.Gesture,
                rounded = Icons.Rounded.Gesture,
                sharp = Icons.Sharp.Gesture,
                twoTone = Icons.TwoTone.Gesture
            ),
            IconData(
                name = "GetApp",
                filled = Icons.Filled.GetApp,
                outlined = Icons.Outlined.GetApp,
                rounded = Icons.Rounded.GetApp,
                sharp = Icons.Sharp.GetApp,
                twoTone = Icons.TwoTone.GetApp
            ),
            IconData(
                name = "Gif",
                filled = Icons.Filled.Gif,
                outlined = Icons.Outlined.Gif,
                rounded = Icons.Rounded.Gif,
                sharp = Icons.Sharp.Gif,
                twoTone = Icons.TwoTone.Gif
            ),
            IconData(
                name = "GolfCourse",
                filled = Icons.Filled.GolfCourse,
                outlined = Icons.Outlined.GolfCourse,
                rounded = Icons.Rounded.GolfCourse,
                sharp = Icons.Sharp.GolfCourse,
                twoTone = Icons.TwoTone.GolfCourse
            ),
            IconData(
                name = "GpsFixed",
                filled = Icons.Filled.GpsFixed,
                outlined = Icons.Outlined.GpsFixed,
                rounded = Icons.Rounded.GpsFixed,
                sharp = Icons.Sharp.GpsFixed,
                twoTone = Icons.TwoTone.GpsFixed
            ),
            IconData(
                name = "GpsNotFixed",
                filled = Icons.Filled.GpsNotFixed,
                outlined = Icons.Outlined.GpsNotFixed,
                rounded = Icons.Rounded.GpsNotFixed,
                sharp = Icons.Sharp.GpsNotFixed,
                twoTone = Icons.TwoTone.GpsNotFixed
            ),
            IconData(
                name = "GpsOff",
                filled = Icons.Filled.GpsOff,
                outlined = Icons.Outlined.GpsOff,
                rounded = Icons.Rounded.GpsOff,
                sharp = Icons.Sharp.GpsOff,
                twoTone = Icons.TwoTone.GpsOff
            ),
            IconData(
                name = "Grade",
                filled = Icons.Filled.Grade,
                outlined = Icons.Outlined.Grade,
                rounded = Icons.Rounded.Grade,
                sharp = Icons.Sharp.Grade,
                twoTone = Icons.TwoTone.Grade
            ),
            IconData(
                name = "Gradient",
                filled = Icons.Filled.Gradient,
                outlined = Icons.Outlined.Gradient,
                rounded = Icons.Rounded.Gradient,
                sharp = Icons.Sharp.Gradient,
                twoTone = Icons.TwoTone.Gradient
            ),
            IconData(
                name = "Grading",
                filled = Icons.Filled.Grading,
                outlined = Icons.Outlined.Grading,
                rounded = Icons.Rounded.Grading,
                sharp = Icons.Sharp.Grading,
                twoTone = Icons.TwoTone.Grading
            ),
            IconData(
                name = "Grain",
                filled = Icons.Filled.Grain,
                outlined = Icons.Outlined.Grain,
                rounded = Icons.Rounded.Grain,
                sharp = Icons.Sharp.Grain,
                twoTone = Icons.TwoTone.Grain
            ),
            IconData(
                name = "GraphicEq",
                filled = Icons.Filled.GraphicEq,
                outlined = Icons.Outlined.GraphicEq,
                rounded = Icons.Rounded.GraphicEq,
                sharp = Icons.Sharp.GraphicEq,
                twoTone = Icons.TwoTone.GraphicEq
            ),
            IconData(
                name = "Grass",
                filled = Icons.Filled.Grass,
                outlined = Icons.Outlined.Grass,
                rounded = Icons.Rounded.Grass,
                sharp = Icons.Sharp.Grass,
                twoTone = Icons.TwoTone.Grass
            ),
            IconData(
                name = "GridOff",
                filled = Icons.Filled.GridOff,
                outlined = Icons.Outlined.GridOff,
                rounded = Icons.Rounded.GridOff,
                sharp = Icons.Sharp.GridOff,
                twoTone = Icons.TwoTone.GridOff
            ),
            IconData(
                name = "GridOn",
                filled = Icons.Filled.GridOn,
                outlined = Icons.Outlined.GridOn,
                rounded = Icons.Rounded.GridOn,
                sharp = Icons.Sharp.GridOn,
                twoTone = Icons.TwoTone.GridOn
            ),
            IconData(
                name = "Group",
                filled = Icons.Filled.Group,
                outlined = Icons.Outlined.Group,
                rounded = Icons.Rounded.Group,
                sharp = Icons.Sharp.Group,
                twoTone = Icons.TwoTone.Group
            ),
            IconData(
                name = "GroupAdd",
                filled = Icons.Filled.GroupAdd,
                outlined = Icons.Outlined.GroupAdd,
                rounded = Icons.Rounded.GroupAdd,
                sharp = Icons.Sharp.GroupAdd,
                twoTone = Icons.TwoTone.GroupAdd
            ),
            IconData(
                name = "GroupWork",
                filled = Icons.Filled.GroupWork,
                outlined = Icons.Outlined.GroupWork,
                rounded = Icons.Rounded.GroupWork,
                sharp = Icons.Sharp.GroupWork,
                twoTone = Icons.TwoTone.GroupWork
            ),
            IconData(
                name = "Groups",
                filled = Icons.Filled.Groups,
                outlined = Icons.Outlined.Groups,
                rounded = Icons.Rounded.Groups,
                sharp = Icons.Sharp.Groups,
                twoTone = Icons.TwoTone.Groups
            ),
            IconData(
                name = "Handyman",
                filled = Icons.Filled.Handyman,
                outlined = Icons.Outlined.Handyman,
                rounded = Icons.Rounded.Handyman,
                sharp = Icons.Sharp.Handyman,
                twoTone = Icons.TwoTone.Handyman
            ),
            IconData(
                name = "Hd",
                filled = Icons.Filled.Hd,
                outlined = Icons.Outlined.Hd,
                rounded = Icons.Rounded.Hd,
                sharp = Icons.Sharp.Hd,
                twoTone = Icons.TwoTone.Hd
            ),
            IconData(
                name = "HdrOff",
                filled = Icons.Filled.HdrOff,
                outlined = Icons.Outlined.HdrOff,
                rounded = Icons.Rounded.HdrOff,
                sharp = Icons.Sharp.HdrOff,
                twoTone = Icons.TwoTone.HdrOff
            ),
            IconData(
                name = "HdrOn",
                filled = Icons.Filled.HdrOn,
                outlined = Icons.Outlined.HdrOn,
                rounded = Icons.Rounded.HdrOn,
                sharp = Icons.Sharp.HdrOn,
                twoTone = Icons.TwoTone.HdrOn
            ),
            IconData(
                name = "HdrStrong",
                filled = Icons.Filled.HdrStrong,
                outlined = Icons.Outlined.HdrStrong,
                rounded = Icons.Rounded.HdrStrong,
                sharp = Icons.Sharp.HdrStrong,
                twoTone = Icons.TwoTone.HdrStrong
            ),
            IconData(
                name = "HdrWeak",
                filled = Icons.Filled.HdrWeak,
                outlined = Icons.Outlined.HdrWeak,
                rounded = Icons.Rounded.HdrWeak,
                sharp = Icons.Sharp.HdrWeak,
                twoTone = Icons.TwoTone.HdrWeak
            ),
            IconData(
                name = "Headset",
                filled = Icons.Filled.Headset,
                outlined = Icons.Outlined.Headset,
                rounded = Icons.Rounded.Headset,
                sharp = Icons.Sharp.Headset,
                twoTone = Icons.TwoTone.Headset
            ),
            IconData(
                name = "HeadsetMic",
                filled = Icons.Filled.HeadsetMic,
                outlined = Icons.Outlined.HeadsetMic,
                rounded = Icons.Rounded.HeadsetMic,
                sharp = Icons.Sharp.HeadsetMic,
                twoTone = Icons.TwoTone.HeadsetMic
            ),
            IconData(
                name = "Healing",
                filled = Icons.Filled.Healing,
                outlined = Icons.Outlined.Healing,
                rounded = Icons.Rounded.Healing,
                sharp = Icons.Sharp.Healing,
                twoTone = Icons.TwoTone.Healing
            ),
            IconData(
                name = "Hearing",
                filled = Icons.Filled.Hearing,
                outlined = Icons.Outlined.Hearing,
                rounded = Icons.Rounded.Hearing,
                sharp = Icons.Sharp.Hearing,
                twoTone = Icons.TwoTone.Hearing
            ),
            IconData(
                name = "HearingDisabled",
                filled = Icons.Filled.HearingDisabled,
                outlined = Icons.Outlined.HearingDisabled,
                rounded = Icons.Rounded.HearingDisabled,
                sharp = Icons.Sharp.HearingDisabled,
                twoTone = Icons.TwoTone.HearingDisabled
            ),
            IconData(
                name = "Height",
                filled = Icons.Filled.Height,
                outlined = Icons.Outlined.Height,
                rounded = Icons.Rounded.Height,
                sharp = Icons.Sharp.Height,
                twoTone = Icons.TwoTone.Height
            ),
            IconData(
                name = "Help",
                filled = Icons.Filled.Help,
                outlined = Icons.Outlined.Help,
                rounded = Icons.Rounded.Help,
                sharp = Icons.Sharp.Help,
                twoTone = Icons.TwoTone.Help
            ),
            IconData(
                name = "HelpCenter",
                filled = Icons.Filled.HelpCenter,
                outlined = Icons.Outlined.HelpCenter,
                rounded = Icons.Rounded.HelpCenter,
                sharp = Icons.Sharp.HelpCenter,
                twoTone = Icons.TwoTone.HelpCenter
            ),
            IconData(
                name = "HelpOutline",
                filled = Icons.Filled.HelpOutline,
                outlined = Icons.Outlined.HelpOutline,
                rounded = Icons.Rounded.HelpOutline,
                sharp = Icons.Sharp.HelpOutline,
                twoTone = Icons.TwoTone.HelpOutline
            ),
            IconData(
                name = "HighQuality",
                filled = Icons.Filled.HighQuality,
                outlined = Icons.Outlined.HighQuality,
                rounded = Icons.Rounded.HighQuality,
                sharp = Icons.Sharp.HighQuality,
                twoTone = Icons.TwoTone.HighQuality
            ),
            IconData(
                name = "Highlight",
                filled = Icons.Filled.Highlight,
                outlined = Icons.Outlined.Highlight,
                rounded = Icons.Rounded.Highlight,
                sharp = Icons.Sharp.Highlight,
                twoTone = Icons.TwoTone.Highlight
            ),
            IconData(
                name = "HighlightAlt",
                filled = Icons.Filled.HighlightAlt,
                outlined = Icons.Outlined.HighlightAlt,
                rounded = Icons.Rounded.HighlightAlt,
                sharp = Icons.Sharp.HighlightAlt,
                twoTone = Icons.TwoTone.HighlightAlt
            ),
            IconData(
                name = "HighlightOff",
                filled = Icons.Filled.HighlightOff,
                outlined = Icons.Outlined.HighlightOff,
                rounded = Icons.Rounded.HighlightOff,
                sharp = Icons.Sharp.HighlightOff,
                twoTone = Icons.TwoTone.HighlightOff
            ),
            IconData(
                name = "History",
                filled = Icons.Filled.History,
                outlined = Icons.Outlined.History,
                rounded = Icons.Rounded.History,
                sharp = Icons.Sharp.History,
                twoTone = Icons.TwoTone.History
            ),
            IconData(
                name = "HistoryEdu",
                filled = Icons.Filled.HistoryEdu,
                outlined = Icons.Outlined.HistoryEdu,
                rounded = Icons.Rounded.HistoryEdu,
                sharp = Icons.Sharp.HistoryEdu,
                twoTone = Icons.TwoTone.HistoryEdu
            ),
            IconData(
                name = "HistoryToggleOff",
                filled = Icons.Filled.HistoryToggleOff,
                outlined = Icons.Outlined.HistoryToggleOff,
                rounded = Icons.Rounded.HistoryToggleOff,
                sharp = Icons.Sharp.HistoryToggleOff,
                twoTone = Icons.TwoTone.HistoryToggleOff
            ),
            IconData(
                name = "HomeRepairService",
                filled = Icons.Filled.HomeRepairService,
                outlined = Icons.Outlined.HomeRepairService,
                rounded = Icons.Rounded.HomeRepairService,
                sharp = Icons.Sharp.HomeRepairService,
                twoTone = Icons.TwoTone.HomeRepairService
            ),
            IconData(
                name = "HomeWork",
                filled = Icons.Filled.HomeWork,
                outlined = Icons.Outlined.HomeWork,
                rounded = Icons.Rounded.HomeWork,
                sharp = Icons.Sharp.HomeWork,
                twoTone = Icons.TwoTone.HomeWork
            ),
            IconData(
                name = "HorizontalDistribute",
                filled = Icons.Filled.HorizontalDistribute,
                outlined = Icons.Outlined.HorizontalDistribute,
                rounded = Icons.Rounded.HorizontalDistribute,
                sharp = Icons.Sharp.HorizontalDistribute,
                twoTone = Icons.TwoTone.HorizontalDistribute
            ),
            IconData(
                name = "HorizontalRule",
                filled = Icons.Filled.HorizontalRule,
                outlined = Icons.Outlined.HorizontalRule,
                rounded = Icons.Rounded.HorizontalRule,
                sharp = Icons.Sharp.HorizontalRule,
                twoTone = Icons.TwoTone.HorizontalRule
            ),
            IconData(
                name = "HorizontalSplit",
                filled = Icons.Filled.HorizontalSplit,
                outlined = Icons.Outlined.HorizontalSplit,
                rounded = Icons.Rounded.HorizontalSplit,
                sharp = Icons.Sharp.HorizontalSplit,
                twoTone = Icons.TwoTone.HorizontalSplit
            ),
            IconData(
                name = "HotTub",
                filled = Icons.Filled.HotTub,
                outlined = Icons.Outlined.HotTub,
                rounded = Icons.Rounded.HotTub,
                sharp = Icons.Sharp.HotTub,
                twoTone = Icons.TwoTone.HotTub
            ),
            IconData(
                name = "Hotel",
                filled = Icons.Filled.Hotel,
                outlined = Icons.Outlined.Hotel,
                rounded = Icons.Rounded.Hotel,
                sharp = Icons.Sharp.Hotel,
                twoTone = Icons.TwoTone.Hotel
            ),
            IconData(
                name = "HourglassBottom",
                filled = Icons.Filled.HourglassBottom,
                outlined = Icons.Outlined.HourglassBottom,
                rounded = Icons.Rounded.HourglassBottom,
                sharp = Icons.Sharp.HourglassBottom,
                twoTone = Icons.TwoTone.HourglassBottom
            ),
            IconData(
                name = "HourglassDisabled",
                filled = Icons.Filled.HourglassDisabled,
                outlined = Icons.Outlined.HourglassDisabled,
                rounded = Icons.Rounded.HourglassDisabled,
                sharp = Icons.Sharp.HourglassDisabled,
                twoTone = Icons.TwoTone.HourglassDisabled
            ),
            IconData(
                name = "HourglassEmpty",
                filled = Icons.Filled.HourglassEmpty,
                outlined = Icons.Outlined.HourglassEmpty,
                rounded = Icons.Rounded.HourglassEmpty,
                sharp = Icons.Sharp.HourglassEmpty,
                twoTone = Icons.TwoTone.HourglassEmpty
            ),
            IconData(
                name = "HourglassFull",
                filled = Icons.Filled.HourglassFull,
                outlined = Icons.Outlined.HourglassFull,
                rounded = Icons.Rounded.HourglassFull,
                sharp = Icons.Sharp.HourglassFull,
                twoTone = Icons.TwoTone.HourglassFull
            ),
            IconData(
                name = "HourglassTop",
                filled = Icons.Filled.HourglassTop,
                outlined = Icons.Outlined.HourglassTop,
                rounded = Icons.Rounded.HourglassTop,
                sharp = Icons.Sharp.HourglassTop,
                twoTone = Icons.TwoTone.HourglassTop
            ),
            IconData(
                name = "House",
                filled = Icons.Filled.House,
                outlined = Icons.Outlined.House,
                rounded = Icons.Rounded.House,
                sharp = Icons.Sharp.House,
                twoTone = Icons.TwoTone.House
            ),
            IconData(
                name = "HouseSiding",
                filled = Icons.Filled.HouseSiding,
                outlined = Icons.Outlined.HouseSiding,
                rounded = Icons.Rounded.HouseSiding,
                sharp = Icons.Sharp.HouseSiding,
                twoTone = Icons.TwoTone.HouseSiding
            ),
            IconData(
                name = "HowToReg",
                filled = Icons.Filled.HowToReg,
                outlined = Icons.Outlined.HowToReg,
                rounded = Icons.Rounded.HowToReg,
                sharp = Icons.Sharp.HowToReg,
                twoTone = Icons.TwoTone.HowToReg
            ),
            IconData(
                name = "HowToVote",
                filled = Icons.Filled.HowToVote,
                outlined = Icons.Outlined.HowToVote,
                rounded = Icons.Rounded.HowToVote,
                sharp = Icons.Sharp.HowToVote,
                twoTone = Icons.TwoTone.HowToVote
            ),
            IconData(
                name = "Http",
                filled = Icons.Filled.Http,
                outlined = Icons.Outlined.Http,
                rounded = Icons.Rounded.Http,
                sharp = Icons.Sharp.Http,
                twoTone = Icons.TwoTone.Http
            ),
            IconData(
                name = "Https",
                filled = Icons.Filled.Https,
                outlined = Icons.Outlined.Https,
                rounded = Icons.Rounded.Https,
                sharp = Icons.Sharp.Https,
                twoTone = Icons.TwoTone.Https
            ),
            IconData(
                name = "Hvac",
                filled = Icons.Filled.Hvac,
                outlined = Icons.Outlined.Hvac,
                rounded = Icons.Rounded.Hvac,
                sharp = Icons.Sharp.Hvac,
                twoTone = Icons.TwoTone.Hvac
            ),
            IconData(
                name = "Image",
                filled = Icons.Filled.Image,
                outlined = Icons.Outlined.Image,
                rounded = Icons.Rounded.Image,
                sharp = Icons.Sharp.Image,
                twoTone = Icons.TwoTone.Image
            ),
            IconData(
                name = "ImageAspectRatio",
                filled = Icons.Filled.ImageAspectRatio,
                outlined = Icons.Outlined.ImageAspectRatio,
                rounded = Icons.Rounded.ImageAspectRatio,
                sharp = Icons.Sharp.ImageAspectRatio,
                twoTone = Icons.TwoTone.ImageAspectRatio
            ),
            IconData(
                name = "ImageNotSupported",
                filled = Icons.Filled.ImageNotSupported,
                outlined = Icons.Outlined.ImageNotSupported,
                rounded = Icons.Rounded.ImageNotSupported,
                sharp = Icons.Sharp.ImageNotSupported,
                twoTone = Icons.TwoTone.ImageNotSupported
            ),
            IconData(
                name = "ImageSearch",
                filled = Icons.Filled.ImageSearch,
                outlined = Icons.Outlined.ImageSearch,
                rounded = Icons.Rounded.ImageSearch,
                sharp = Icons.Sharp.ImageSearch,
                twoTone = Icons.TwoTone.ImageSearch
            ),
            IconData(
                name = "ImportContacts",
                filled = Icons.Filled.ImportContacts,
                outlined = Icons.Outlined.ImportContacts,
                rounded = Icons.Rounded.ImportContacts,
                sharp = Icons.Sharp.ImportContacts,
                twoTone = Icons.TwoTone.ImportContacts
            ),
            IconData(
                name = "ImportExport",
                filled = Icons.Filled.ImportExport,
                outlined = Icons.Outlined.ImportExport,
                rounded = Icons.Rounded.ImportExport,
                sharp = Icons.Sharp.ImportExport,
                twoTone = Icons.TwoTone.ImportExport
            ),
            IconData(
                name = "ImportantDevices",
                filled = Icons.Filled.ImportantDevices,
                outlined = Icons.Outlined.ImportantDevices,
                rounded = Icons.Rounded.ImportantDevices,
                sharp = Icons.Sharp.ImportantDevices,
                twoTone = Icons.TwoTone.ImportantDevices
            ),
            IconData(
                name = "Inbox",
                filled = Icons.Filled.Inbox,
                outlined = Icons.Outlined.Inbox,
                rounded = Icons.Rounded.Inbox,
                sharp = Icons.Sharp.Inbox,
                twoTone = Icons.TwoTone.Inbox
            ),
            IconData(
                name = "IndeterminateCheckBox",
                filled = Icons.Filled.IndeterminateCheckBox,
                outlined = Icons.Outlined.IndeterminateCheckBox,
                rounded = Icons.Rounded.IndeterminateCheckBox,
                sharp = Icons.Sharp.IndeterminateCheckBox,
                twoTone = Icons.TwoTone.IndeterminateCheckBox
            ),
            IconData(
                name = "Input",
                filled = Icons.Filled.Input,
                outlined = Icons.Outlined.Input,
                rounded = Icons.Rounded.Input,
                sharp = Icons.Sharp.Input,
                twoTone = Icons.TwoTone.Input
            ),
            IconData(
                name = "InsertChart",
                filled = Icons.Filled.InsertChart,
                outlined = Icons.Outlined.InsertChart,
                rounded = Icons.Rounded.InsertChart,
                sharp = Icons.Sharp.InsertChart,
                twoTone = Icons.TwoTone.InsertChart
            ),
            IconData(
                name = "InsertChartOutlined",
                filled = Icons.Filled.InsertChartOutlined,
                outlined = Icons.Outlined.InsertChartOutlined,
                rounded = Icons.Rounded.InsertChartOutlined,
                sharp = Icons.Sharp.InsertChartOutlined,
                twoTone = Icons.TwoTone.InsertChartOutlined
            ),
            IconData(
                name = "InsertComment",
                filled = Icons.Filled.InsertComment,
                outlined = Icons.Outlined.InsertComment,
                rounded = Icons.Rounded.InsertComment,
                sharp = Icons.Sharp.InsertComment,
                twoTone = Icons.TwoTone.InsertComment
            ),
            IconData(
                name = "InsertDriveFile",
                filled = Icons.Filled.InsertDriveFile,
                outlined = Icons.Outlined.InsertDriveFile,
                rounded = Icons.Rounded.InsertDriveFile,
                sharp = Icons.Sharp.InsertDriveFile,
                twoTone = Icons.TwoTone.InsertDriveFile
            ),
            IconData(
                name = "InsertEmoticon",
                filled = Icons.Filled.InsertEmoticon,
                outlined = Icons.Outlined.InsertEmoticon,
                rounded = Icons.Rounded.InsertEmoticon,
                sharp = Icons.Sharp.InsertEmoticon,
                twoTone = Icons.TwoTone.InsertEmoticon
            ),
            IconData(
                name = "InsertInvitation",
                filled = Icons.Filled.InsertInvitation,
                outlined = Icons.Outlined.InsertInvitation,
                rounded = Icons.Rounded.InsertInvitation,
                sharp = Icons.Sharp.InsertInvitation,
                twoTone = Icons.TwoTone.InsertInvitation
            ),
            IconData(
                name = "InsertLink",
                filled = Icons.Filled.InsertLink,
                outlined = Icons.Outlined.InsertLink,
                rounded = Icons.Rounded.InsertLink,
                sharp = Icons.Sharp.InsertLink,
                twoTone = Icons.TwoTone.InsertLink
            ),
            IconData(
                name = "InsertPhoto",
                filled = Icons.Filled.InsertPhoto,
                outlined = Icons.Outlined.InsertPhoto,
                rounded = Icons.Rounded.InsertPhoto,
                sharp = Icons.Sharp.InsertPhoto,
                twoTone = Icons.TwoTone.InsertPhoto
            ),
            IconData(
                name = "Insights",
                filled = Icons.Filled.Insights,
                outlined = Icons.Outlined.Insights,
                rounded = Icons.Rounded.Insights,
                sharp = Icons.Sharp.Insights,
                twoTone = Icons.TwoTone.Insights
            ),
            IconData(
                name = "IntegrationInstructions",
                filled = Icons.Filled.IntegrationInstructions,
                outlined = Icons.Outlined.IntegrationInstructions,
                rounded = Icons.Rounded.IntegrationInstructions,
                sharp = Icons.Sharp.IntegrationInstructions,
                twoTone = Icons.TwoTone.IntegrationInstructions
            ),
            IconData(
                name = "InvertColors",
                filled = Icons.Filled.InvertColors,
                outlined = Icons.Outlined.InvertColors,
                rounded = Icons.Rounded.InvertColors,
                sharp = Icons.Sharp.InvertColors,
                twoTone = Icons.TwoTone.InvertColors
            ),
            IconData(
                name = "InvertColorsOff",
                filled = Icons.Filled.InvertColorsOff,
                outlined = Icons.Outlined.InvertColorsOff,
                rounded = Icons.Rounded.InvertColorsOff,
                sharp = Icons.Sharp.InvertColorsOff,
                twoTone = Icons.TwoTone.InvertColorsOff
            ),
            IconData(
                name = "Iso",
                filled = Icons.Filled.Iso,
                outlined = Icons.Outlined.Iso,
                rounded = Icons.Rounded.Iso,
                sharp = Icons.Sharp.Iso,
                twoTone = Icons.TwoTone.Iso
            ),
            IconData(
                name = "Keyboard",
                filled = Icons.Filled.Keyboard,
                outlined = Icons.Outlined.Keyboard,
                rounded = Icons.Rounded.Keyboard,
                sharp = Icons.Sharp.Keyboard,
                twoTone = Icons.TwoTone.Keyboard
            ),
            IconData(
                name = "KeyboardBackspace",
                filled = Icons.Filled.KeyboardBackspace,
                outlined = Icons.Outlined.KeyboardBackspace,
                rounded = Icons.Rounded.KeyboardBackspace,
                sharp = Icons.Sharp.KeyboardBackspace,
                twoTone = Icons.TwoTone.KeyboardBackspace
            ),
            IconData(
                name = "KeyboardCapslock",
                filled = Icons.Filled.KeyboardCapslock,
                outlined = Icons.Outlined.KeyboardCapslock,
                rounded = Icons.Rounded.KeyboardCapslock,
                sharp = Icons.Sharp.KeyboardCapslock,
                twoTone = Icons.TwoTone.KeyboardCapslock
            ),
            IconData(
                name = "KeyboardHide",
                filled = Icons.Filled.KeyboardHide,
                outlined = Icons.Outlined.KeyboardHide,
                rounded = Icons.Rounded.KeyboardHide,
                sharp = Icons.Sharp.KeyboardHide,
                twoTone = Icons.TwoTone.KeyboardHide
            ),
            IconData(
                name = "KeyboardReturn",
                filled = Icons.Filled.KeyboardReturn,
                outlined = Icons.Outlined.KeyboardReturn,
                rounded = Icons.Rounded.KeyboardReturn,
                sharp = Icons.Sharp.KeyboardReturn,
                twoTone = Icons.TwoTone.KeyboardReturn
            ),
            IconData(
                name = "KeyboardTab",
                filled = Icons.Filled.KeyboardTab,
                outlined = Icons.Outlined.KeyboardTab,
                rounded = Icons.Rounded.KeyboardTab,
                sharp = Icons.Sharp.KeyboardTab,
                twoTone = Icons.TwoTone.KeyboardTab
            ),
            IconData(
                name = "KeyboardVoice",
                filled = Icons.Filled.KeyboardVoice,
                outlined = Icons.Outlined.KeyboardVoice,
                rounded = Icons.Rounded.KeyboardVoice,
                sharp = Icons.Sharp.KeyboardVoice,
                twoTone = Icons.TwoTone.KeyboardVoice
            ),
            IconData(
                name = "KingBed",
                filled = Icons.Filled.KingBed,
                outlined = Icons.Outlined.KingBed,
                rounded = Icons.Rounded.KingBed,
                sharp = Icons.Sharp.KingBed,
                twoTone = Icons.TwoTone.KingBed
            ),
            IconData(
                name = "Kitchen",
                filled = Icons.Filled.Kitchen,
                outlined = Icons.Outlined.Kitchen,
                rounded = Icons.Rounded.Kitchen,
                sharp = Icons.Sharp.Kitchen,
                twoTone = Icons.TwoTone.Kitchen
            ),
            IconData(
                name = "Label",
                filled = Icons.Filled.Label,
                outlined = Icons.Outlined.Label,
                rounded = Icons.Rounded.Label,
                sharp = Icons.Sharp.Label,
                twoTone = Icons.TwoTone.Label
            ),
            IconData(
                name = "LabelImportant",
                filled = Icons.Filled.LabelImportant,
                outlined = Icons.Outlined.LabelImportant,
                rounded = Icons.Rounded.LabelImportant,
                sharp = Icons.Sharp.LabelImportant,
                twoTone = Icons.TwoTone.LabelImportant
            ),
            IconData(
                name = "LabelOff",
                filled = Icons.Filled.LabelOff,
                outlined = Icons.Outlined.LabelOff,
                rounded = Icons.Rounded.LabelOff,
                sharp = Icons.Sharp.LabelOff,
                twoTone = Icons.TwoTone.LabelOff
            ),
            IconData(
                name = "Landscape",
                filled = Icons.Filled.Landscape,
                outlined = Icons.Outlined.Landscape,
                rounded = Icons.Rounded.Landscape,
                sharp = Icons.Sharp.Landscape,
                twoTone = Icons.TwoTone.Landscape
            ),
            IconData(
                name = "Language",
                filled = Icons.Filled.Language,
                outlined = Icons.Outlined.Language,
                rounded = Icons.Rounded.Language,
                sharp = Icons.Sharp.Language,
                twoTone = Icons.TwoTone.Language
            ),
            IconData(
                name = "Laptop",
                filled = Icons.Filled.Laptop,
                outlined = Icons.Outlined.Laptop,
                rounded = Icons.Rounded.Laptop,
                sharp = Icons.Sharp.Laptop,
                twoTone = Icons.TwoTone.Laptop
            ),
            IconData(
                name = "LaptopChromebook",
                filled = Icons.Filled.LaptopChromebook,
                outlined = Icons.Outlined.LaptopChromebook,
                rounded = Icons.Rounded.LaptopChromebook,
                sharp = Icons.Sharp.LaptopChromebook,
                twoTone = Icons.TwoTone.LaptopChromebook
            ),
            IconData(
                name = "LaptopMac",
                filled = Icons.Filled.LaptopMac,
                outlined = Icons.Outlined.LaptopMac,
                rounded = Icons.Rounded.LaptopMac,
                sharp = Icons.Sharp.LaptopMac,
                twoTone = Icons.TwoTone.LaptopMac
            ),
            IconData(
                name = "LaptopWindows",
                filled = Icons.Filled.LaptopWindows,
                outlined = Icons.Outlined.LaptopWindows,
                rounded = Icons.Rounded.LaptopWindows,
                sharp = Icons.Sharp.LaptopWindows,
                twoTone = Icons.TwoTone.LaptopWindows
            ),
            IconData(
                name = "LastPage",
                filled = Icons.Filled.LastPage,
                outlined = Icons.Outlined.LastPage,
                rounded = Icons.Rounded.LastPage,
                sharp = Icons.Sharp.LastPage,
                twoTone = Icons.TwoTone.LastPage
            ),
            IconData(
                name = "Launch",
                filled = Icons.Filled.Launch,
                outlined = Icons.Outlined.Launch,
                rounded = Icons.Rounded.Launch,
                sharp = Icons.Sharp.Launch,
                twoTone = Icons.TwoTone.Launch
            ),
            IconData(
                name = "Layers",
                filled = Icons.Filled.Layers,
                outlined = Icons.Outlined.Layers,
                rounded = Icons.Rounded.Layers,
                sharp = Icons.Sharp.Layers,
                twoTone = Icons.TwoTone.Layers
            ),
            IconData(
                name = "LayersClear",
                filled = Icons.Filled.LayersClear,
                outlined = Icons.Outlined.LayersClear,
                rounded = Icons.Rounded.LayersClear,
                sharp = Icons.Sharp.LayersClear,
                twoTone = Icons.TwoTone.LayersClear
            ),
            IconData(
                name = "Leaderboard",
                filled = Icons.Filled.Leaderboard,
                outlined = Icons.Outlined.Leaderboard,
                rounded = Icons.Rounded.Leaderboard,
                sharp = Icons.Sharp.Leaderboard,
                twoTone = Icons.TwoTone.Leaderboard
            ),
            IconData(
                name = "LeakAdd",
                filled = Icons.Filled.LeakAdd,
                outlined = Icons.Outlined.LeakAdd,
                rounded = Icons.Rounded.LeakAdd,
                sharp = Icons.Sharp.LeakAdd,
                twoTone = Icons.TwoTone.LeakAdd
            ),
            IconData(
                name = "LeakRemove",
                filled = Icons.Filled.LeakRemove,
                outlined = Icons.Outlined.LeakRemove,
                rounded = Icons.Rounded.LeakRemove,
                sharp = Icons.Sharp.LeakRemove,
                twoTone = Icons.TwoTone.LeakRemove
            ),
            IconData(
                name = "LeaveBagsAtHome",
                filled = Icons.Filled.LeaveBagsAtHome,
                outlined = Icons.Outlined.LeaveBagsAtHome,
                rounded = Icons.Rounded.LeaveBagsAtHome,
                sharp = Icons.Sharp.LeaveBagsAtHome,
                twoTone = Icons.TwoTone.LeaveBagsAtHome
            ),
            IconData(
                name = "LegendToggle",
                filled = Icons.Filled.LegendToggle,
                outlined = Icons.Outlined.LegendToggle,
                rounded = Icons.Rounded.LegendToggle,
                sharp = Icons.Sharp.LegendToggle,
                twoTone = Icons.TwoTone.LegendToggle
            ),
            IconData(
                name = "Lens",
                filled = Icons.Filled.Lens,
                outlined = Icons.Outlined.Lens,
                rounded = Icons.Rounded.Lens,
                sharp = Icons.Sharp.Lens,
                twoTone = Icons.TwoTone.Lens
            ),
            IconData(
                name = "LibraryAdd",
                filled = Icons.Filled.LibraryAdd,
                outlined = Icons.Outlined.LibraryAdd,
                rounded = Icons.Rounded.LibraryAdd,
                sharp = Icons.Sharp.LibraryAdd,
                twoTone = Icons.TwoTone.LibraryAdd
            ),
            IconData(
                name = "LibraryAddCheck",
                filled = Icons.Filled.LibraryAddCheck,
                outlined = Icons.Outlined.LibraryAddCheck,
                rounded = Icons.Rounded.LibraryAddCheck,
                sharp = Icons.Sharp.LibraryAddCheck,
                twoTone = Icons.TwoTone.LibraryAddCheck
            ),
            IconData(
                name = "LibraryBooks",
                filled = Icons.Filled.LibraryBooks,
                outlined = Icons.Outlined.LibraryBooks,
                rounded = Icons.Rounded.LibraryBooks,
                sharp = Icons.Sharp.LibraryBooks,
                twoTone = Icons.TwoTone.LibraryBooks
            ),
            IconData(
                name = "LibraryMusic",
                filled = Icons.Filled.LibraryMusic,
                outlined = Icons.Outlined.LibraryMusic,
                rounded = Icons.Rounded.LibraryMusic,
                sharp = Icons.Sharp.LibraryMusic,
                twoTone = Icons.TwoTone.LibraryMusic
            ),
            IconData(
                name = "LineStyle",
                filled = Icons.Filled.LineStyle,
                outlined = Icons.Outlined.LineStyle,
                rounded = Icons.Rounded.LineStyle,
                sharp = Icons.Sharp.LineStyle,
                twoTone = Icons.TwoTone.LineStyle
            ),
            IconData(
                name = "LineWeight",
                filled = Icons.Filled.LineWeight,
                outlined = Icons.Outlined.LineWeight,
                rounded = Icons.Rounded.LineWeight,
                sharp = Icons.Sharp.LineWeight,
                twoTone = Icons.TwoTone.LineWeight
            ),
            IconData(
                name = "LinearScale",
                filled = Icons.Filled.LinearScale,
                outlined = Icons.Outlined.LinearScale,
                rounded = Icons.Rounded.LinearScale,
                sharp = Icons.Sharp.LinearScale,
                twoTone = Icons.TwoTone.LinearScale
            ),
            IconData(
                name = "Link",
                filled = Icons.Filled.Link,
                outlined = Icons.Outlined.Link,
                rounded = Icons.Rounded.Link,
                sharp = Icons.Sharp.Link,
                twoTone = Icons.TwoTone.Link
            ),
            IconData(
                name = "LinkOff",
                filled = Icons.Filled.LinkOff,
                outlined = Icons.Outlined.LinkOff,
                rounded = Icons.Rounded.LinkOff,
                sharp = Icons.Sharp.LinkOff,
                twoTone = Icons.TwoTone.LinkOff
            ),
            IconData(
                name = "LinkedCamera",
                filled = Icons.Filled.LinkedCamera,
                outlined = Icons.Outlined.LinkedCamera,
                rounded = Icons.Rounded.LinkedCamera,
                sharp = Icons.Sharp.LinkedCamera,
                twoTone = Icons.TwoTone.LinkedCamera
            ),
            IconData(
                name = "ListAlt",
                filled = Icons.Filled.ListAlt,
                outlined = Icons.Outlined.ListAlt,
                rounded = Icons.Rounded.ListAlt,
                sharp = Icons.Sharp.ListAlt,
                twoTone = Icons.TwoTone.ListAlt
            ),
            IconData(
                name = "LiveHelp",
                filled = Icons.Filled.LiveHelp,
                outlined = Icons.Outlined.LiveHelp,
                rounded = Icons.Rounded.LiveHelp,
                sharp = Icons.Sharp.LiveHelp,
                twoTone = Icons.TwoTone.LiveHelp
            ),
            IconData(
                name = "LiveTv",
                filled = Icons.Filled.LiveTv,
                outlined = Icons.Outlined.LiveTv,
                rounded = Icons.Rounded.LiveTv,
                sharp = Icons.Sharp.LiveTv,
                twoTone = Icons.TwoTone.LiveTv
            ),
            IconData(
                name = "LocalActivity",
                filled = Icons.Filled.LocalActivity,
                outlined = Icons.Outlined.LocalActivity,
                rounded = Icons.Rounded.LocalActivity,
                sharp = Icons.Sharp.LocalActivity,
                twoTone = Icons.TwoTone.LocalActivity
            ),
            IconData(
                name = "LocalAirport",
                filled = Icons.Filled.LocalAirport,
                outlined = Icons.Outlined.LocalAirport,
                rounded = Icons.Rounded.LocalAirport,
                sharp = Icons.Sharp.LocalAirport,
                twoTone = Icons.TwoTone.LocalAirport
            ),
            IconData(
                name = "LocalAtm",
                filled = Icons.Filled.LocalAtm,
                outlined = Icons.Outlined.LocalAtm,
                rounded = Icons.Rounded.LocalAtm,
                sharp = Icons.Sharp.LocalAtm,
                twoTone = Icons.TwoTone.LocalAtm
            ),
            IconData(
                name = "LocalBar",
                filled = Icons.Filled.LocalBar,
                outlined = Icons.Outlined.LocalBar,
                rounded = Icons.Rounded.LocalBar,
                sharp = Icons.Sharp.LocalBar,
                twoTone = Icons.TwoTone.LocalBar
            ),
            IconData(
                name = "LocalCafe",
                filled = Icons.Filled.LocalCafe,
                outlined = Icons.Outlined.LocalCafe,
                rounded = Icons.Rounded.LocalCafe,
                sharp = Icons.Sharp.LocalCafe,
                twoTone = Icons.TwoTone.LocalCafe
            ),
            IconData(
                name = "LocalCarWash",
                filled = Icons.Filled.LocalCarWash,
                outlined = Icons.Outlined.LocalCarWash,
                rounded = Icons.Rounded.LocalCarWash,
                sharp = Icons.Sharp.LocalCarWash,
                twoTone = Icons.TwoTone.LocalCarWash
            ),
            IconData(
                name = "LocalConvenienceStore",
                filled = Icons.Filled.LocalConvenienceStore,
                outlined = Icons.Outlined.LocalConvenienceStore,
                rounded = Icons.Rounded.LocalConvenienceStore,
                sharp = Icons.Sharp.LocalConvenienceStore,
                twoTone = Icons.TwoTone.LocalConvenienceStore
            ),
            IconData(
                name = "LocalDining",
                filled = Icons.Filled.LocalDining,
                outlined = Icons.Outlined.LocalDining,
                rounded = Icons.Rounded.LocalDining,
                sharp = Icons.Sharp.LocalDining,
                twoTone = Icons.TwoTone.LocalDining
            ),
            IconData(
                name = "LocalDrink",
                filled = Icons.Filled.LocalDrink,
                outlined = Icons.Outlined.LocalDrink,
                rounded = Icons.Rounded.LocalDrink,
                sharp = Icons.Sharp.LocalDrink,
                twoTone = Icons.TwoTone.LocalDrink
            ),
            IconData(
                name = "LocalFireDepartment",
                filled = Icons.Filled.LocalFireDepartment,
                outlined = Icons.Outlined.LocalFireDepartment,
                rounded = Icons.Rounded.LocalFireDepartment,
                sharp = Icons.Sharp.LocalFireDepartment,
                twoTone = Icons.TwoTone.LocalFireDepartment
            ),
            IconData(
                name = "LocalFlorist",
                filled = Icons.Filled.LocalFlorist,
                outlined = Icons.Outlined.LocalFlorist,
                rounded = Icons.Rounded.LocalFlorist,
                sharp = Icons.Sharp.LocalFlorist,
                twoTone = Icons.TwoTone.LocalFlorist
            ),
            IconData(
                name = "LocalGasStation",
                filled = Icons.Filled.LocalGasStation,
                outlined = Icons.Outlined.LocalGasStation,
                rounded = Icons.Rounded.LocalGasStation,
                sharp = Icons.Sharp.LocalGasStation,
                twoTone = Icons.TwoTone.LocalGasStation
            ),
            IconData(
                name = "LocalGroceryStore",
                filled = Icons.Filled.LocalGroceryStore,
                outlined = Icons.Outlined.LocalGroceryStore,
                rounded = Icons.Rounded.LocalGroceryStore,
                sharp = Icons.Sharp.LocalGroceryStore,
                twoTone = Icons.TwoTone.LocalGroceryStore
            ),
            IconData(
                name = "LocalHospital",
                filled = Icons.Filled.LocalHospital,
                outlined = Icons.Outlined.LocalHospital,
                rounded = Icons.Rounded.LocalHospital,
                sharp = Icons.Sharp.LocalHospital,
                twoTone = Icons.TwoTone.LocalHospital
            ),
            IconData(
                name = "LocalHotel",
                filled = Icons.Filled.LocalHotel,
                outlined = Icons.Outlined.LocalHotel,
                rounded = Icons.Rounded.LocalHotel,
                sharp = Icons.Sharp.LocalHotel,
                twoTone = Icons.TwoTone.LocalHotel
            ),
            IconData(
                name = "LocalLaundryService",
                filled = Icons.Filled.LocalLaundryService,
                outlined = Icons.Outlined.LocalLaundryService,
                rounded = Icons.Rounded.LocalLaundryService,
                sharp = Icons.Sharp.LocalLaundryService,
                twoTone = Icons.TwoTone.LocalLaundryService
            ),
            IconData(
                name = "LocalLibrary",
                filled = Icons.Filled.LocalLibrary,
                outlined = Icons.Outlined.LocalLibrary,
                rounded = Icons.Rounded.LocalLibrary,
                sharp = Icons.Sharp.LocalLibrary,
                twoTone = Icons.TwoTone.LocalLibrary
            ),
            IconData(
                name = "LocalMall",
                filled = Icons.Filled.LocalMall,
                outlined = Icons.Outlined.LocalMall,
                rounded = Icons.Rounded.LocalMall,
                sharp = Icons.Sharp.LocalMall,
                twoTone = Icons.TwoTone.LocalMall
            ),
            IconData(
                name = "LocalMovies",
                filled = Icons.Filled.LocalMovies,
                outlined = Icons.Outlined.LocalMovies,
                rounded = Icons.Rounded.LocalMovies,
                sharp = Icons.Sharp.LocalMovies,
                twoTone = Icons.TwoTone.LocalMovies
            ),
            IconData(
                name = "LocalOffer",
                filled = Icons.Filled.LocalOffer,
                outlined = Icons.Outlined.LocalOffer,
                rounded = Icons.Rounded.LocalOffer,
                sharp = Icons.Sharp.LocalOffer,
                twoTone = Icons.TwoTone.LocalOffer
            ),
            IconData(
                name = "LocalParking",
                filled = Icons.Filled.LocalParking,
                outlined = Icons.Outlined.LocalParking,
                rounded = Icons.Rounded.LocalParking,
                sharp = Icons.Sharp.LocalParking,
                twoTone = Icons.TwoTone.LocalParking
            ),
            IconData(
                name = "LocalPharmacy",
                filled = Icons.Filled.LocalPharmacy,
                outlined = Icons.Outlined.LocalPharmacy,
                rounded = Icons.Rounded.LocalPharmacy,
                sharp = Icons.Sharp.LocalPharmacy,
                twoTone = Icons.TwoTone.LocalPharmacy
            ),
            IconData(
                name = "LocalPhone",
                filled = Icons.Filled.LocalPhone,
                outlined = Icons.Outlined.LocalPhone,
                rounded = Icons.Rounded.LocalPhone,
                sharp = Icons.Sharp.LocalPhone,
                twoTone = Icons.TwoTone.LocalPhone
            ),
            IconData(
                name = "LocalPizza",
                filled = Icons.Filled.LocalPizza,
                outlined = Icons.Outlined.LocalPizza,
                rounded = Icons.Rounded.LocalPizza,
                sharp = Icons.Sharp.LocalPizza,
                twoTone = Icons.TwoTone.LocalPizza
            ),
            IconData(
                name = "LocalPlay",
                filled = Icons.Filled.LocalPlay,
                outlined = Icons.Outlined.LocalPlay,
                rounded = Icons.Rounded.LocalPlay,
                sharp = Icons.Sharp.LocalPlay,
                twoTone = Icons.TwoTone.LocalPlay
            ),
            IconData(
                name = "LocalPolice",
                filled = Icons.Filled.LocalPolice,
                outlined = Icons.Outlined.LocalPolice,
                rounded = Icons.Rounded.LocalPolice,
                sharp = Icons.Sharp.LocalPolice,
                twoTone = Icons.TwoTone.LocalPolice
            ),
            IconData(
                name = "LocalPostOffice",
                filled = Icons.Filled.LocalPostOffice,
                outlined = Icons.Outlined.LocalPostOffice,
                rounded = Icons.Rounded.LocalPostOffice,
                sharp = Icons.Sharp.LocalPostOffice,
                twoTone = Icons.TwoTone.LocalPostOffice
            ),
            IconData(
                name = "LocalPrintshop",
                filled = Icons.Filled.LocalPrintshop,
                outlined = Icons.Outlined.LocalPrintshop,
                rounded = Icons.Rounded.LocalPrintshop,
                sharp = Icons.Sharp.LocalPrintshop,
                twoTone = Icons.TwoTone.LocalPrintshop
            ),
            IconData(
                name = "LocalSee",
                filled = Icons.Filled.LocalSee,
                outlined = Icons.Outlined.LocalSee,
                rounded = Icons.Rounded.LocalSee,
                sharp = Icons.Sharp.LocalSee,
                twoTone = Icons.TwoTone.LocalSee
            ),
            IconData(
                name = "LocalShipping",
                filled = Icons.Filled.LocalShipping,
                outlined = Icons.Outlined.LocalShipping,
                rounded = Icons.Rounded.LocalShipping,
                sharp = Icons.Sharp.LocalShipping,
                twoTone = Icons.TwoTone.LocalShipping
            ),
            IconData(
                name = "LocalTaxi",
                filled = Icons.Filled.LocalTaxi,
                outlined = Icons.Outlined.LocalTaxi,
                rounded = Icons.Rounded.LocalTaxi,
                sharp = Icons.Sharp.LocalTaxi,
                twoTone = Icons.TwoTone.LocalTaxi
            ),
            IconData(
                name = "LocationCity",
                filled = Icons.Filled.LocationCity,
                outlined = Icons.Outlined.LocationCity,
                rounded = Icons.Rounded.LocationCity,
                sharp = Icons.Sharp.LocationCity,
                twoTone = Icons.TwoTone.LocationCity
            ),
            IconData(
                name = "LocationDisabled",
                filled = Icons.Filled.LocationDisabled,
                outlined = Icons.Outlined.LocationDisabled,
                rounded = Icons.Rounded.LocationDisabled,
                sharp = Icons.Sharp.LocationDisabled,
                twoTone = Icons.TwoTone.LocationDisabled
            ),
            IconData(
                name = "LocationOff",
                filled = Icons.Filled.LocationOff,
                outlined = Icons.Outlined.LocationOff,
                rounded = Icons.Rounded.LocationOff,
                sharp = Icons.Sharp.LocationOff,
                twoTone = Icons.TwoTone.LocationOff
            ),
            IconData(
                name = "LocationSearching",
                filled = Icons.Filled.LocationSearching,
                outlined = Icons.Outlined.LocationSearching,
                rounded = Icons.Rounded.LocationSearching,
                sharp = Icons.Sharp.LocationSearching,
                twoTone = Icons.TwoTone.LocationSearching
            ),
            IconData(
                name = "LockOpen",
                filled = Icons.Filled.LockOpen,
                outlined = Icons.Outlined.LockOpen,
                rounded = Icons.Rounded.LockOpen,
                sharp = Icons.Sharp.LockOpen,
                twoTone = Icons.TwoTone.LockOpen
            ),
            IconData(
                name = "Login",
                filled = Icons.Filled.Login,
                outlined = Icons.Outlined.Login,
                rounded = Icons.Rounded.Login,
                sharp = Icons.Sharp.Login,
                twoTone = Icons.TwoTone.Login
            ),
            IconData(
                name = "Looks",
                filled = Icons.Filled.Looks,
                outlined = Icons.Outlined.Looks,
                rounded = Icons.Rounded.Looks,
                sharp = Icons.Sharp.Looks,
                twoTone = Icons.TwoTone.Looks
            ),
            IconData(
                name = "Looks3",
                filled = Icons.Filled.Looks3,
                outlined = Icons.Outlined.Looks3,
                rounded = Icons.Rounded.Looks3,
                sharp = Icons.Sharp.Looks3,
                twoTone = Icons.TwoTone.Looks3
            ),
            IconData(
                name = "Looks4",
                filled = Icons.Filled.Looks4,
                outlined = Icons.Outlined.Looks4,
                rounded = Icons.Rounded.Looks4,
                sharp = Icons.Sharp.Looks4,
                twoTone = Icons.TwoTone.Looks4
            ),
            IconData(
                name = "Looks5",
                filled = Icons.Filled.Looks5,
                outlined = Icons.Outlined.Looks5,
                rounded = Icons.Rounded.Looks5,
                sharp = Icons.Sharp.Looks5,
                twoTone = Icons.TwoTone.Looks5
            ),
            IconData(
                name = "Looks6",
                filled = Icons.Filled.Looks6,
                outlined = Icons.Outlined.Looks6,
                rounded = Icons.Rounded.Looks6,
                sharp = Icons.Sharp.Looks6,
                twoTone = Icons.TwoTone.Looks6
            ),
            IconData(
                name = "LooksOne",
                filled = Icons.Filled.LooksOne,
                outlined = Icons.Outlined.LooksOne,
                rounded = Icons.Rounded.LooksOne,
                sharp = Icons.Sharp.LooksOne,
                twoTone = Icons.TwoTone.LooksOne
            ),
            IconData(
                name = "LooksTwo",
                filled = Icons.Filled.LooksTwo,
                outlined = Icons.Outlined.LooksTwo,
                rounded = Icons.Rounded.LooksTwo,
                sharp = Icons.Sharp.LooksTwo,
                twoTone = Icons.TwoTone.LooksTwo
            ),
            IconData(
                name = "Loop",
                filled = Icons.Filled.Loop,
                outlined = Icons.Outlined.Loop,
                rounded = Icons.Rounded.Loop,
                sharp = Icons.Sharp.Loop,
                twoTone = Icons.TwoTone.Loop
            ),
            IconData(
                name = "Loupe",
                filled = Icons.Filled.Loupe,
                outlined = Icons.Outlined.Loupe,
                rounded = Icons.Rounded.Loupe,
                sharp = Icons.Sharp.Loupe,
                twoTone = Icons.TwoTone.Loupe
            ),
            IconData(
                name = "LowPriority",
                filled = Icons.Filled.LowPriority,
                outlined = Icons.Outlined.LowPriority,
                rounded = Icons.Rounded.LowPriority,
                sharp = Icons.Sharp.LowPriority,
                twoTone = Icons.TwoTone.LowPriority
            ),
            IconData(
                name = "Loyalty",
                filled = Icons.Filled.Loyalty,
                outlined = Icons.Outlined.Loyalty,
                rounded = Icons.Rounded.Loyalty,
                sharp = Icons.Sharp.Loyalty,
                twoTone = Icons.TwoTone.Loyalty
            ),
            IconData(
                name = "Luggage",
                filled = Icons.Filled.Luggage,
                outlined = Icons.Outlined.Luggage,
                rounded = Icons.Rounded.Luggage,
                sharp = Icons.Sharp.Luggage,
                twoTone = Icons.TwoTone.Luggage
            ),
            IconData(
                name = "Mail",
                filled = Icons.Filled.Mail,
                outlined = Icons.Outlined.Mail,
                rounded = Icons.Rounded.Mail,
                sharp = Icons.Sharp.Mail,
                twoTone = Icons.TwoTone.Mail
            ),
            IconData(
                name = "Map",
                filled = Icons.Filled.Map,
                outlined = Icons.Outlined.Map,
                rounded = Icons.Rounded.Map,
                sharp = Icons.Sharp.Map,
                twoTone = Icons.TwoTone.Map
            ),
            IconData(
                name = "MapsUgc",
                filled = Icons.Filled.MapsUgc,
                outlined = Icons.Outlined.MapsUgc,
                rounded = Icons.Rounded.MapsUgc,
                sharp = Icons.Sharp.MapsUgc,
                twoTone = Icons.TwoTone.MapsUgc
            ),
            IconData(
                name = "MarkChatRead",
                filled = Icons.Filled.MarkChatRead,
                outlined = Icons.Outlined.MarkChatRead,
                rounded = Icons.Rounded.MarkChatRead,
                sharp = Icons.Sharp.MarkChatRead,
                twoTone = Icons.TwoTone.MarkChatRead
            ),
            IconData(
                name = "MarkChatUnread",
                filled = Icons.Filled.MarkChatUnread,
                outlined = Icons.Outlined.MarkChatUnread,
                rounded = Icons.Rounded.MarkChatUnread,
                sharp = Icons.Sharp.MarkChatUnread,
                twoTone = Icons.TwoTone.MarkChatUnread
            ),
            IconData(
                name = "MarkEmailRead",
                filled = Icons.Filled.MarkEmailRead,
                outlined = Icons.Outlined.MarkEmailRead,
                rounded = Icons.Rounded.MarkEmailRead,
                sharp = Icons.Sharp.MarkEmailRead,
                twoTone = Icons.TwoTone.MarkEmailRead
            ),
            IconData(
                name = "MarkEmailUnread",
                filled = Icons.Filled.MarkEmailUnread,
                outlined = Icons.Outlined.MarkEmailUnread,
                rounded = Icons.Rounded.MarkEmailUnread,
                sharp = Icons.Sharp.MarkEmailUnread,
                twoTone = Icons.TwoTone.MarkEmailUnread
            ),
            IconData(
                name = "Markunread",
                filled = Icons.Filled.Markunread,
                outlined = Icons.Outlined.Markunread,
                rounded = Icons.Rounded.Markunread,
                sharp = Icons.Sharp.Markunread,
                twoTone = Icons.TwoTone.Markunread
            ),
            IconData(
                name = "MarkunreadMailbox",
                filled = Icons.Filled.MarkunreadMailbox,
                outlined = Icons.Outlined.MarkunreadMailbox,
                rounded = Icons.Rounded.MarkunreadMailbox,
                sharp = Icons.Sharp.MarkunreadMailbox,
                twoTone = Icons.TwoTone.MarkunreadMailbox
            ),
            IconData(
                name = "Masks",
                filled = Icons.Filled.Masks,
                outlined = Icons.Outlined.Masks,
                rounded = Icons.Rounded.Masks,
                sharp = Icons.Sharp.Masks,
                twoTone = Icons.TwoTone.Masks
            ),
            IconData(
                name = "Maximize",
                filled = Icons.Filled.Maximize,
                outlined = Icons.Outlined.Maximize,
                rounded = Icons.Rounded.Maximize,
                sharp = Icons.Sharp.Maximize,
                twoTone = Icons.TwoTone.Maximize
            ),
            IconData(
                name = "Mediation",
                filled = Icons.Filled.Mediation,
                outlined = Icons.Outlined.Mediation,
                rounded = Icons.Rounded.Mediation,
                sharp = Icons.Sharp.Mediation,
                twoTone = Icons.TwoTone.Mediation
            ),
            IconData(
                name = "MedicalServices",
                filled = Icons.Filled.MedicalServices,
                outlined = Icons.Outlined.MedicalServices,
                rounded = Icons.Rounded.MedicalServices,
                sharp = Icons.Sharp.MedicalServices,
                twoTone = Icons.TwoTone.MedicalServices
            ),
            IconData(
                name = "MeetingRoom",
                filled = Icons.Filled.MeetingRoom,
                outlined = Icons.Outlined.MeetingRoom,
                rounded = Icons.Rounded.MeetingRoom,
                sharp = Icons.Sharp.MeetingRoom,
                twoTone = Icons.TwoTone.MeetingRoom
            ),
            IconData(
                name = "Memory",
                filled = Icons.Filled.Memory,
                outlined = Icons.Outlined.Memory,
                rounded = Icons.Rounded.Memory,
                sharp = Icons.Sharp.Memory,
                twoTone = Icons.TwoTone.Memory
            ),
            IconData(
                name = "MenuBook",
                filled = Icons.Filled.MenuBook,
                outlined = Icons.Outlined.MenuBook,
                rounded = Icons.Rounded.MenuBook,
                sharp = Icons.Sharp.MenuBook,
                twoTone = Icons.TwoTone.MenuBook
            ),
            IconData(
                name = "MenuOpen",
                filled = Icons.Filled.MenuOpen,
                outlined = Icons.Outlined.MenuOpen,
                rounded = Icons.Rounded.MenuOpen,
                sharp = Icons.Sharp.MenuOpen,
                twoTone = Icons.TwoTone.MenuOpen
            ),
            IconData(
                name = "MergeType",
                filled = Icons.Filled.MergeType,
                outlined = Icons.Outlined.MergeType,
                rounded = Icons.Rounded.MergeType,
                sharp = Icons.Sharp.MergeType,
                twoTone = Icons.TwoTone.MergeType
            ),
            IconData(
                name = "Message",
                filled = Icons.Filled.Message,
                outlined = Icons.Outlined.Message,
                rounded = Icons.Rounded.Message,
                sharp = Icons.Sharp.Message,
                twoTone = Icons.TwoTone.Message
            ),
            IconData(
                name = "Mic",
                filled = Icons.Filled.Mic,
                outlined = Icons.Outlined.Mic,
                rounded = Icons.Rounded.Mic,
                sharp = Icons.Sharp.Mic,
                twoTone = Icons.TwoTone.Mic
            ),
            IconData(
                name = "MicNone",
                filled = Icons.Filled.MicNone,
                outlined = Icons.Outlined.MicNone,
                rounded = Icons.Rounded.MicNone,
                sharp = Icons.Sharp.MicNone,
                twoTone = Icons.TwoTone.MicNone
            ),
            IconData(
                name = "MicOff",
                filled = Icons.Filled.MicOff,
                outlined = Icons.Outlined.MicOff,
                rounded = Icons.Rounded.MicOff,
                sharp = Icons.Sharp.MicOff,
                twoTone = Icons.TwoTone.MicOff
            ),
            IconData(
                name = "Microwave",
                filled = Icons.Filled.Microwave,
                outlined = Icons.Outlined.Microwave,
                rounded = Icons.Rounded.Microwave,
                sharp = Icons.Sharp.Microwave,
                twoTone = Icons.TwoTone.Microwave
            ),
            IconData(
                name = "MilitaryTech",
                filled = Icons.Filled.MilitaryTech,
                outlined = Icons.Outlined.MilitaryTech,
                rounded = Icons.Rounded.MilitaryTech,
                sharp = Icons.Sharp.MilitaryTech,
                twoTone = Icons.TwoTone.MilitaryTech
            ),
            IconData(
                name = "Minimize",
                filled = Icons.Filled.Minimize,
                outlined = Icons.Outlined.Minimize,
                rounded = Icons.Rounded.Minimize,
                sharp = Icons.Sharp.Minimize,
                twoTone = Icons.TwoTone.Minimize
            ),
            IconData(
                name = "MiscellaneousServices",
                filled = Icons.Filled.MiscellaneousServices,
                outlined = Icons.Outlined.MiscellaneousServices,
                rounded = Icons.Rounded.MiscellaneousServices,
                sharp = Icons.Sharp.MiscellaneousServices,
                twoTone = Icons.TwoTone.MiscellaneousServices
            ),
            IconData(
                name = "MissedVideoCall",
                filled = Icons.Filled.MissedVideoCall,
                outlined = Icons.Outlined.MissedVideoCall,
                rounded = Icons.Rounded.MissedVideoCall,
                sharp = Icons.Sharp.MissedVideoCall,
                twoTone = Icons.TwoTone.MissedVideoCall
            ),
            IconData(
                name = "Mms",
                filled = Icons.Filled.Mms,
                outlined = Icons.Outlined.Mms,
                rounded = Icons.Rounded.Mms,
                sharp = Icons.Sharp.Mms,
                twoTone = Icons.TwoTone.Mms
            ),
            IconData(
                name = "MobileFriendly",
                filled = Icons.Filled.MobileFriendly,
                outlined = Icons.Outlined.MobileFriendly,
                rounded = Icons.Rounded.MobileFriendly,
                sharp = Icons.Sharp.MobileFriendly,
                twoTone = Icons.TwoTone.MobileFriendly
            ),
            IconData(
                name = "MobileOff",
                filled = Icons.Filled.MobileOff,
                outlined = Icons.Outlined.MobileOff,
                rounded = Icons.Rounded.MobileOff,
                sharp = Icons.Sharp.MobileOff,
                twoTone = Icons.TwoTone.MobileOff
            ),
            IconData(
                name = "MobileScreenShare",
                filled = Icons.Filled.MobileScreenShare,
                outlined = Icons.Outlined.MobileScreenShare,
                rounded = Icons.Rounded.MobileScreenShare,
                sharp = Icons.Sharp.MobileScreenShare,
                twoTone = Icons.TwoTone.MobileScreenShare
            ),
            IconData(
                name = "ModeComment",
                filled = Icons.Filled.ModeComment,
                outlined = Icons.Outlined.ModeComment,
                rounded = Icons.Rounded.ModeComment,
                sharp = Icons.Sharp.ModeComment,
                twoTone = Icons.TwoTone.ModeComment
            ),
            IconData(
                name = "ModelTraining",
                filled = Icons.Filled.ModelTraining,
                outlined = Icons.Outlined.ModelTraining,
                rounded = Icons.Rounded.ModelTraining,
                sharp = Icons.Sharp.ModelTraining,
                twoTone = Icons.TwoTone.ModelTraining
            ),
            IconData(
                name = "MonetizationOn",
                filled = Icons.Filled.MonetizationOn,
                outlined = Icons.Outlined.MonetizationOn,
                rounded = Icons.Rounded.MonetizationOn,
                sharp = Icons.Sharp.MonetizationOn,
                twoTone = Icons.TwoTone.MonetizationOn
            ),
            IconData(
                name = "Money",
                filled = Icons.Filled.Money,
                outlined = Icons.Outlined.Money,
                rounded = Icons.Rounded.Money,
                sharp = Icons.Sharp.Money,
                twoTone = Icons.TwoTone.Money
            ),
            IconData(
                name = "MoneyOff",
                filled = Icons.Filled.MoneyOff,
                outlined = Icons.Outlined.MoneyOff,
                rounded = Icons.Rounded.MoneyOff,
                sharp = Icons.Sharp.MoneyOff,
                twoTone = Icons.TwoTone.MoneyOff
            ),
            IconData(
                name = "MonochromePhotos",
                filled = Icons.Filled.MonochromePhotos,
                outlined = Icons.Outlined.MonochromePhotos,
                rounded = Icons.Rounded.MonochromePhotos,
                sharp = Icons.Sharp.MonochromePhotos,
                twoTone = Icons.TwoTone.MonochromePhotos
            ),
            IconData(
                name = "Mood",
                filled = Icons.Filled.Mood,
                outlined = Icons.Outlined.Mood,
                rounded = Icons.Rounded.Mood,
                sharp = Icons.Sharp.Mood,
                twoTone = Icons.TwoTone.Mood
            ),
            IconData(
                name = "MoodBad",
                filled = Icons.Filled.MoodBad,
                outlined = Icons.Outlined.MoodBad,
                rounded = Icons.Rounded.MoodBad,
                sharp = Icons.Sharp.MoodBad,
                twoTone = Icons.TwoTone.MoodBad
            ),
            IconData(
                name = "Moped",
                filled = Icons.Filled.Moped,
                outlined = Icons.Outlined.Moped,
                rounded = Icons.Rounded.Moped,
                sharp = Icons.Sharp.Moped,
                twoTone = Icons.TwoTone.Moped
            ),
            IconData(
                name = "More",
                filled = Icons.Filled.More,
                outlined = Icons.Outlined.More,
                rounded = Icons.Rounded.More,
                sharp = Icons.Sharp.More,
                twoTone = Icons.TwoTone.More
            ),
            IconData(
                name = "MoreHoriz",
                filled = Icons.Filled.MoreHoriz,
                outlined = Icons.Outlined.MoreHoriz,
                rounded = Icons.Rounded.MoreHoriz,
                sharp = Icons.Sharp.MoreHoriz,
                twoTone = Icons.TwoTone.MoreHoriz
            ),
            IconData(
                name = "MoreTime",
                filled = Icons.Filled.MoreTime,
                outlined = Icons.Outlined.MoreTime,
                rounded = Icons.Rounded.MoreTime,
                sharp = Icons.Sharp.MoreTime,
                twoTone = Icons.TwoTone.MoreTime
            ),
            IconData(
                name = "MotionPhotosOn",
                filled = Icons.Filled.MotionPhotosOn,
                outlined = Icons.Outlined.MotionPhotosOn,
                rounded = Icons.Rounded.MotionPhotosOn,
                sharp = Icons.Sharp.MotionPhotosOn,
                twoTone = Icons.TwoTone.MotionPhotosOn
            ),
            IconData(
                name = "MotionPhotosPause",
                filled = Icons.Filled.MotionPhotosPause,
                outlined = Icons.Outlined.MotionPhotosPause,
                rounded = Icons.Rounded.MotionPhotosPause,
                sharp = Icons.Sharp.MotionPhotosPause,
                twoTone = Icons.TwoTone.MotionPhotosPause
            ),
            IconData(
                name = "MotionPhotosPaused",
                filled = Icons.Filled.MotionPhotosPaused,
                outlined = Icons.Outlined.MotionPhotosPaused,
                rounded = Icons.Rounded.MotionPhotosPaused,
                sharp = Icons.Sharp.MotionPhotosPaused,
                twoTone = Icons.TwoTone.MotionPhotosPaused
            ),
            IconData(
                name = "Motorcycle",
                filled = Icons.Filled.Motorcycle,
                outlined = Icons.Outlined.Motorcycle,
                rounded = Icons.Rounded.Motorcycle,
                sharp = Icons.Sharp.Motorcycle,
                twoTone = Icons.TwoTone.Motorcycle
            ),
            IconData(
                name = "Mouse",
                filled = Icons.Filled.Mouse,
                outlined = Icons.Outlined.Mouse,
                rounded = Icons.Rounded.Mouse,
                sharp = Icons.Sharp.Mouse,
                twoTone = Icons.TwoTone.Mouse
            ),
            IconData(
                name = "MoveToInbox",
                filled = Icons.Filled.MoveToInbox,
                outlined = Icons.Outlined.MoveToInbox,
                rounded = Icons.Rounded.MoveToInbox,
                sharp = Icons.Sharp.MoveToInbox,
                twoTone = Icons.TwoTone.MoveToInbox
            ),
            IconData(
                name = "Movie",
                filled = Icons.Filled.Movie,
                outlined = Icons.Outlined.Movie,
                rounded = Icons.Rounded.Movie,
                sharp = Icons.Sharp.Movie,
                twoTone = Icons.TwoTone.Movie
            ),
            IconData(
                name = "MovieCreation",
                filled = Icons.Filled.MovieCreation,
                outlined = Icons.Outlined.MovieCreation,
                rounded = Icons.Rounded.MovieCreation,
                sharp = Icons.Sharp.MovieCreation,
                twoTone = Icons.TwoTone.MovieCreation
            ),
            IconData(
                name = "MovieFilter",
                filled = Icons.Filled.MovieFilter,
                outlined = Icons.Outlined.MovieFilter,
                rounded = Icons.Rounded.MovieFilter,
                sharp = Icons.Sharp.MovieFilter,
                twoTone = Icons.TwoTone.MovieFilter
            ),
            IconData(
                name = "MultilineChart",
                filled = Icons.Filled.MultilineChart,
                outlined = Icons.Outlined.MultilineChart,
                rounded = Icons.Rounded.MultilineChart,
                sharp = Icons.Sharp.MultilineChart,
                twoTone = Icons.TwoTone.MultilineChart
            ),
            IconData(
                name = "MultipleStop",
                filled = Icons.Filled.MultipleStop,
                outlined = Icons.Outlined.MultipleStop,
                rounded = Icons.Rounded.MultipleStop,
                sharp = Icons.Sharp.MultipleStop,
                twoTone = Icons.TwoTone.MultipleStop
            ),
            IconData(
                name = "Museum",
                filled = Icons.Filled.Museum,
                outlined = Icons.Outlined.Museum,
                rounded = Icons.Rounded.Museum,
                sharp = Icons.Sharp.Museum,
                twoTone = Icons.TwoTone.Museum
            ),
            IconData(
                name = "MusicNote",
                filled = Icons.Filled.MusicNote,
                outlined = Icons.Outlined.MusicNote,
                rounded = Icons.Rounded.MusicNote,
                sharp = Icons.Sharp.MusicNote,
                twoTone = Icons.TwoTone.MusicNote
            ),
            IconData(
                name = "MusicOff",
                filled = Icons.Filled.MusicOff,
                outlined = Icons.Outlined.MusicOff,
                rounded = Icons.Rounded.MusicOff,
                sharp = Icons.Sharp.MusicOff,
                twoTone = Icons.TwoTone.MusicOff
            ),
            IconData(
                name = "MusicVideo",
                filled = Icons.Filled.MusicVideo,
                outlined = Icons.Outlined.MusicVideo,
                rounded = Icons.Rounded.MusicVideo,
                sharp = Icons.Sharp.MusicVideo,
                twoTone = Icons.TwoTone.MusicVideo
            ),
            IconData(
                name = "MyLocation",
                filled = Icons.Filled.MyLocation,
                outlined = Icons.Outlined.MyLocation,
                rounded = Icons.Rounded.MyLocation,
                sharp = Icons.Sharp.MyLocation,
                twoTone = Icons.TwoTone.MyLocation
            ),
            IconData(
                name = "Nat",
                filled = Icons.Filled.Nat,
                outlined = Icons.Outlined.Nat,
                rounded = Icons.Rounded.Nat,
                sharp = Icons.Sharp.Nat,
                twoTone = Icons.TwoTone.Nat
            ),
            IconData(
                name = "Nature",
                filled = Icons.Filled.Nature,
                outlined = Icons.Outlined.Nature,
                rounded = Icons.Rounded.Nature,
                sharp = Icons.Sharp.Nature,
                twoTone = Icons.TwoTone.Nature
            ),
            IconData(
                name = "NaturePeople",
                filled = Icons.Filled.NaturePeople,
                outlined = Icons.Outlined.NaturePeople,
                rounded = Icons.Rounded.NaturePeople,
                sharp = Icons.Sharp.NaturePeople,
                twoTone = Icons.TwoTone.NaturePeople
            ),
            IconData(
                name = "NavigateBefore",
                filled = Icons.Filled.NavigateBefore,
                outlined = Icons.Outlined.NavigateBefore,
                rounded = Icons.Rounded.NavigateBefore,
                sharp = Icons.Sharp.NavigateBefore,
                twoTone = Icons.TwoTone.NavigateBefore
            ),
            IconData(
                name = "NavigateNext",
                filled = Icons.Filled.NavigateNext,
                outlined = Icons.Outlined.NavigateNext,
                rounded = Icons.Rounded.NavigateNext,
                sharp = Icons.Sharp.NavigateNext,
                twoTone = Icons.TwoTone.NavigateNext
            ),
            IconData(
                name = "Navigation",
                filled = Icons.Filled.Navigation,
                outlined = Icons.Outlined.Navigation,
                rounded = Icons.Rounded.Navigation,
                sharp = Icons.Sharp.Navigation,
                twoTone = Icons.TwoTone.Navigation
            ),
            IconData(
                name = "NearMe",
                filled = Icons.Filled.NearMe,
                outlined = Icons.Outlined.NearMe,
                rounded = Icons.Rounded.NearMe,
                sharp = Icons.Sharp.NearMe,
                twoTone = Icons.TwoTone.NearMe
            ),
            IconData(
                name = "NearMeDisabled",
                filled = Icons.Filled.NearMeDisabled,
                outlined = Icons.Outlined.NearMeDisabled,
                rounded = Icons.Rounded.NearMeDisabled,
                sharp = Icons.Sharp.NearMeDisabled,
                twoTone = Icons.TwoTone.NearMeDisabled
            ),
            IconData(
                name = "NetworkCheck",
                filled = Icons.Filled.NetworkCheck,
                outlined = Icons.Outlined.NetworkCheck,
                rounded = Icons.Rounded.NetworkCheck,
                sharp = Icons.Sharp.NetworkCheck,
                twoTone = Icons.TwoTone.NetworkCheck
            ),
            IconData(
                name = "NetworkLocked",
                filled = Icons.Filled.NetworkLocked,
                outlined = Icons.Outlined.NetworkLocked,
                rounded = Icons.Rounded.NetworkLocked,
                sharp = Icons.Sharp.NetworkLocked,
                twoTone = Icons.TwoTone.NetworkLocked
            ),
            IconData(
                name = "NewReleases",
                filled = Icons.Filled.NewReleases,
                outlined = Icons.Outlined.NewReleases,
                rounded = Icons.Rounded.NewReleases,
                sharp = Icons.Sharp.NewReleases,
                twoTone = Icons.TwoTone.NewReleases
            ),
            IconData(
                name = "NextPlan",
                filled = Icons.Filled.NextPlan,
                outlined = Icons.Outlined.NextPlan,
                rounded = Icons.Rounded.NextPlan,
                sharp = Icons.Sharp.NextPlan,
                twoTone = Icons.TwoTone.NextPlan
            ),
            IconData(
                name = "NextWeek",
                filled = Icons.Filled.NextWeek,
                outlined = Icons.Outlined.NextWeek,
                rounded = Icons.Rounded.NextWeek,
                sharp = Icons.Sharp.NextWeek,
                twoTone = Icons.TwoTone.NextWeek
            ),
            IconData(
                name = "Nfc",
                filled = Icons.Filled.Nfc,
                outlined = Icons.Outlined.Nfc,
                rounded = Icons.Rounded.Nfc,
                sharp = Icons.Sharp.Nfc,
                twoTone = Icons.TwoTone.Nfc
            ),
            IconData(
                name = "NightShelter",
                filled = Icons.Filled.NightShelter,
                outlined = Icons.Outlined.NightShelter,
                rounded = Icons.Rounded.NightShelter,
                sharp = Icons.Sharp.NightShelter,
                twoTone = Icons.TwoTone.NightShelter
            ),
            IconData(
                name = "NightsStay",
                filled = Icons.Filled.NightsStay,
                outlined = Icons.Outlined.NightsStay,
                rounded = Icons.Rounded.NightsStay,
                sharp = Icons.Sharp.NightsStay,
                twoTone = Icons.TwoTone.NightsStay
            ),
            IconData(
                name = "NoBackpack",
                filled = Icons.Filled.NoBackpack,
                outlined = Icons.Outlined.NoBackpack,
                rounded = Icons.Rounded.NoBackpack,
                sharp = Icons.Sharp.NoBackpack,
                twoTone = Icons.TwoTone.NoBackpack
            ),
            IconData(
                name = "NoCell",
                filled = Icons.Filled.NoCell,
                outlined = Icons.Outlined.NoCell,
                rounded = Icons.Rounded.NoCell,
                sharp = Icons.Sharp.NoCell,
                twoTone = Icons.TwoTone.NoCell
            ),
            IconData(
                name = "NoDrinks",
                filled = Icons.Filled.NoDrinks,
                outlined = Icons.Outlined.NoDrinks,
                rounded = Icons.Rounded.NoDrinks,
                sharp = Icons.Sharp.NoDrinks,
                twoTone = Icons.TwoTone.NoDrinks
            ),
            IconData(
                name = "NoEncryption",
                filled = Icons.Filled.NoEncryption,
                outlined = Icons.Outlined.NoEncryption,
                rounded = Icons.Rounded.NoEncryption,
                sharp = Icons.Sharp.NoEncryption,
                twoTone = Icons.TwoTone.NoEncryption
            ),
            IconData(
                name = "NoFlash",
                filled = Icons.Filled.NoFlash,
                outlined = Icons.Outlined.NoFlash,
                rounded = Icons.Rounded.NoFlash,
                sharp = Icons.Sharp.NoFlash,
                twoTone = Icons.TwoTone.NoFlash
            ),
            IconData(
                name = "NoFood",
                filled = Icons.Filled.NoFood,
                outlined = Icons.Outlined.NoFood,
                rounded = Icons.Rounded.NoFood,
                sharp = Icons.Sharp.NoFood,
                twoTone = Icons.TwoTone.NoFood
            ),
            IconData(
                name = "NoLuggage",
                filled = Icons.Filled.NoLuggage,
                outlined = Icons.Outlined.NoLuggage,
                rounded = Icons.Rounded.NoLuggage,
                sharp = Icons.Sharp.NoLuggage,
                twoTone = Icons.TwoTone.NoLuggage
            ),
            IconData(
                name = "NoMeals",
                filled = Icons.Filled.NoMeals,
                outlined = Icons.Outlined.NoMeals,
                rounded = Icons.Rounded.NoMeals,
                sharp = Icons.Sharp.NoMeals,
                twoTone = Icons.TwoTone.NoMeals
            ),
            IconData(
                name = "NoMeetingRoom",
                filled = Icons.Filled.NoMeetingRoom,
                outlined = Icons.Outlined.NoMeetingRoom,
                rounded = Icons.Rounded.NoMeetingRoom,
                sharp = Icons.Sharp.NoMeetingRoom,
                twoTone = Icons.TwoTone.NoMeetingRoom
            ),
            IconData(
                name = "NoPhotography",
                filled = Icons.Filled.NoPhotography,
                outlined = Icons.Outlined.NoPhotography,
                rounded = Icons.Rounded.NoPhotography,
                sharp = Icons.Sharp.NoPhotography,
                twoTone = Icons.TwoTone.NoPhotography
            ),
            IconData(
                name = "NoSim",
                filled = Icons.Filled.NoSim,
                outlined = Icons.Outlined.NoSim,
                rounded = Icons.Rounded.NoSim,
                sharp = Icons.Sharp.NoSim,
                twoTone = Icons.TwoTone.NoSim
            ),
            IconData(
                name = "NoStroller",
                filled = Icons.Filled.NoStroller,
                outlined = Icons.Outlined.NoStroller,
                rounded = Icons.Rounded.NoStroller,
                sharp = Icons.Sharp.NoStroller,
                twoTone = Icons.TwoTone.NoStroller
            ),
            IconData(
                name = "NoTransfer",
                filled = Icons.Filled.NoTransfer,
                outlined = Icons.Outlined.NoTransfer,
                rounded = Icons.Rounded.NoTransfer,
                sharp = Icons.Sharp.NoTransfer,
                twoTone = Icons.TwoTone.NoTransfer
            ),
            IconData(
                name = "North",
                filled = Icons.Filled.North,
                outlined = Icons.Outlined.North,
                rounded = Icons.Rounded.North,
                sharp = Icons.Sharp.North,
                twoTone = Icons.TwoTone.North
            ),
            IconData(
                name = "NorthEast",
                filled = Icons.Filled.NorthEast,
                outlined = Icons.Outlined.NorthEast,
                rounded = Icons.Rounded.NorthEast,
                sharp = Icons.Sharp.NorthEast,
                twoTone = Icons.TwoTone.NorthEast
            ),
            IconData(
                name = "NorthWest",
                filled = Icons.Filled.NorthWest,
                outlined = Icons.Outlined.NorthWest,
                rounded = Icons.Rounded.NorthWest,
                sharp = Icons.Sharp.NorthWest,
                twoTone = Icons.TwoTone.NorthWest
            ),
            IconData(
                name = "NotAccessible",
                filled = Icons.Filled.NotAccessible,
                outlined = Icons.Outlined.NotAccessible,
                rounded = Icons.Rounded.NotAccessible,
                sharp = Icons.Sharp.NotAccessible,
                twoTone = Icons.TwoTone.NotAccessible
            ),
            IconData(
                name = "NotInterested",
                filled = Icons.Filled.NotInterested,
                outlined = Icons.Outlined.NotInterested,
                rounded = Icons.Rounded.NotInterested,
                sharp = Icons.Sharp.NotInterested,
                twoTone = Icons.TwoTone.NotInterested
            ),
            IconData(
                name = "NotListedLocation",
                filled = Icons.Filled.NotListedLocation,
                outlined = Icons.Outlined.NotListedLocation,
                rounded = Icons.Rounded.NotListedLocation,
                sharp = Icons.Sharp.NotListedLocation,
                twoTone = Icons.TwoTone.NotListedLocation
            ),
            IconData(
                name = "NotStarted",
                filled = Icons.Filled.NotStarted,
                outlined = Icons.Outlined.NotStarted,
                rounded = Icons.Rounded.NotStarted,
                sharp = Icons.Sharp.NotStarted,
                twoTone = Icons.TwoTone.NotStarted
            ),
            IconData(
                name = "Note",
                filled = Icons.Filled.Note,
                outlined = Icons.Outlined.Note,
                rounded = Icons.Rounded.Note,
                sharp = Icons.Sharp.Note,
                twoTone = Icons.TwoTone.Note
            ),
            IconData(
                name = "NoteAdd",
                filled = Icons.Filled.NoteAdd,
                outlined = Icons.Outlined.NoteAdd,
                rounded = Icons.Rounded.NoteAdd,
                sharp = Icons.Sharp.NoteAdd,
                twoTone = Icons.TwoTone.NoteAdd
            ),
            IconData(
                name = "Notes",
                filled = Icons.Filled.Notes,
                outlined = Icons.Outlined.Notes,
                rounded = Icons.Rounded.Notes,
                sharp = Icons.Sharp.Notes,
                twoTone = Icons.TwoTone.Notes
            ),
            IconData(
                name = "NotificationImportant",
                filled = Icons.Filled.NotificationImportant,
                outlined = Icons.Outlined.NotificationImportant,
                rounded = Icons.Rounded.NotificationImportant,
                sharp = Icons.Sharp.NotificationImportant,
                twoTone = Icons.TwoTone.NotificationImportant
            ),
            IconData(
                name = "NotificationsActive",
                filled = Icons.Filled.NotificationsActive,
                outlined = Icons.Outlined.NotificationsActive,
                rounded = Icons.Rounded.NotificationsActive,
                sharp = Icons.Sharp.NotificationsActive,
                twoTone = Icons.TwoTone.NotificationsActive
            ),
            IconData(
                name = "NotificationsNone",
                filled = Icons.Filled.NotificationsNone,
                outlined = Icons.Outlined.NotificationsNone,
                rounded = Icons.Rounded.NotificationsNone,
                sharp = Icons.Sharp.NotificationsNone,
                twoTone = Icons.TwoTone.NotificationsNone
            ),
            IconData(
                name = "NotificationsOff",
                filled = Icons.Filled.NotificationsOff,
                outlined = Icons.Outlined.NotificationsOff,
                rounded = Icons.Rounded.NotificationsOff,
                sharp = Icons.Sharp.NotificationsOff,
                twoTone = Icons.TwoTone.NotificationsOff
            ),
            IconData(
                name = "NotificationsPaused",
                filled = Icons.Filled.NotificationsPaused,
                outlined = Icons.Outlined.NotificationsPaused,
                rounded = Icons.Rounded.NotificationsPaused,
                sharp = Icons.Sharp.NotificationsPaused,
                twoTone = Icons.TwoTone.NotificationsPaused
            ),
            IconData(
                name = "OfflineBolt",
                filled = Icons.Filled.OfflineBolt,
                outlined = Icons.Outlined.OfflineBolt,
                rounded = Icons.Rounded.OfflineBolt,
                sharp = Icons.Sharp.OfflineBolt,
                twoTone = Icons.TwoTone.OfflineBolt
            ),
            IconData(
                name = "OfflinePin",
                filled = Icons.Filled.OfflinePin,
                outlined = Icons.Outlined.OfflinePin,
                rounded = Icons.Rounded.OfflinePin,
                sharp = Icons.Sharp.OfflinePin,
                twoTone = Icons.TwoTone.OfflinePin
            ),
            IconData(
                name = "OndemandVideo",
                filled = Icons.Filled.OndemandVideo,
                outlined = Icons.Outlined.OndemandVideo,
                rounded = Icons.Rounded.OndemandVideo,
                sharp = Icons.Sharp.OndemandVideo,
                twoTone = Icons.TwoTone.OndemandVideo
            ),
            IconData(
                name = "OnlinePrediction",
                filled = Icons.Filled.OnlinePrediction,
                outlined = Icons.Outlined.OnlinePrediction,
                rounded = Icons.Rounded.OnlinePrediction,
                sharp = Icons.Sharp.OnlinePrediction,
                twoTone = Icons.TwoTone.OnlinePrediction
            ),
            IconData(
                name = "Opacity",
                filled = Icons.Filled.Opacity,
                outlined = Icons.Outlined.Opacity,
                rounded = Icons.Rounded.Opacity,
                sharp = Icons.Sharp.Opacity,
                twoTone = Icons.TwoTone.Opacity
            ),
            IconData(
                name = "OpenInBrowser",
                filled = Icons.Filled.OpenInBrowser,
                outlined = Icons.Outlined.OpenInBrowser,
                rounded = Icons.Rounded.OpenInBrowser,
                sharp = Icons.Sharp.OpenInBrowser,
                twoTone = Icons.TwoTone.OpenInBrowser
            ),
            IconData(
                name = "OpenInFull",
                filled = Icons.Filled.OpenInFull,
                outlined = Icons.Outlined.OpenInFull,
                rounded = Icons.Rounded.OpenInFull,
                sharp = Icons.Sharp.OpenInFull,
                twoTone = Icons.TwoTone.OpenInFull
            ),
            IconData(
                name = "OpenInNew",
                filled = Icons.Filled.OpenInNew,
                outlined = Icons.Outlined.OpenInNew,
                rounded = Icons.Rounded.OpenInNew,
                sharp = Icons.Sharp.OpenInNew,
                twoTone = Icons.TwoTone.OpenInNew
            ),
            IconData(
                name = "OpenWith",
                filled = Icons.Filled.OpenWith,
                outlined = Icons.Outlined.OpenWith,
                rounded = Icons.Rounded.OpenWith,
                sharp = Icons.Sharp.OpenWith,
                twoTone = Icons.TwoTone.OpenWith
            ),
            IconData(
                name = "Outbond",
                filled = Icons.Filled.Outbond,
                outlined = Icons.Outlined.Outbond,
                rounded = Icons.Rounded.Outbond,
                sharp = Icons.Sharp.Outbond,
                twoTone = Icons.TwoTone.Outbond
            ),
            IconData(
                name = "OutdoorGrill",
                filled = Icons.Filled.OutdoorGrill,
                outlined = Icons.Outlined.OutdoorGrill,
                rounded = Icons.Rounded.OutdoorGrill,
                sharp = Icons.Sharp.OutdoorGrill,
                twoTone = Icons.TwoTone.OutdoorGrill
            ),
            IconData(
                name = "Outlet",
                filled = Icons.Filled.Outlet,
                outlined = Icons.Outlined.Outlet,
                rounded = Icons.Rounded.Outlet,
                sharp = Icons.Sharp.Outlet,
                twoTone = Icons.TwoTone.Outlet
            ),
            IconData(
                name = "OutlinedFlag",
                filled = Icons.Filled.OutlinedFlag,
                outlined = Icons.Outlined.OutlinedFlag,
                rounded = Icons.Rounded.OutlinedFlag,
                sharp = Icons.Sharp.OutlinedFlag,
                twoTone = Icons.TwoTone.OutlinedFlag
            ),
            IconData(
                name = "Pages",
                filled = Icons.Filled.Pages,
                outlined = Icons.Outlined.Pages,
                rounded = Icons.Rounded.Pages,
                sharp = Icons.Sharp.Pages,
                twoTone = Icons.TwoTone.Pages
            ),
            IconData(
                name = "Pageview",
                filled = Icons.Filled.Pageview,
                outlined = Icons.Outlined.Pageview,
                rounded = Icons.Rounded.Pageview,
                sharp = Icons.Sharp.Pageview,
                twoTone = Icons.TwoTone.Pageview
            ),
            IconData(
                name = "Palette",
                filled = Icons.Filled.Palette,
                outlined = Icons.Outlined.Palette,
                rounded = Icons.Rounded.Palette,
                sharp = Icons.Sharp.Palette,
                twoTone = Icons.TwoTone.Palette
            ),
            IconData(
                name = "PanTool",
                filled = Icons.Filled.PanTool,
                outlined = Icons.Outlined.PanTool,
                rounded = Icons.Rounded.PanTool,
                sharp = Icons.Sharp.PanTool,
                twoTone = Icons.TwoTone.PanTool
            ),
            IconData(
                name = "Panorama",
                filled = Icons.Filled.Panorama,
                outlined = Icons.Outlined.Panorama,
                rounded = Icons.Rounded.Panorama,
                sharp = Icons.Sharp.Panorama,
                twoTone = Icons.TwoTone.Panorama
            ),
            IconData(
                name = "PanoramaFishEye",
                filled = Icons.Filled.PanoramaFishEye,
                outlined = Icons.Outlined.PanoramaFishEye,
                rounded = Icons.Rounded.PanoramaFishEye,
                sharp = Icons.Sharp.PanoramaFishEye,
                twoTone = Icons.TwoTone.PanoramaFishEye
            ),
            IconData(
                name = "PanoramaHorizontal",
                filled = Icons.Filled.PanoramaHorizontal,
                outlined = Icons.Outlined.PanoramaHorizontal,
                rounded = Icons.Rounded.PanoramaHorizontal,
                sharp = Icons.Sharp.PanoramaHorizontal,
                twoTone = Icons.TwoTone.PanoramaHorizontal
            ),
            IconData(
                name = "PanoramaVertical",
                filled = Icons.Filled.PanoramaVertical,
                outlined = Icons.Outlined.PanoramaVertical,
                rounded = Icons.Rounded.PanoramaVertical,
                sharp = Icons.Sharp.PanoramaVertical,
                twoTone = Icons.TwoTone.PanoramaVertical
            ),
            IconData(
                name = "PanoramaWideAngle",
                filled = Icons.Filled.PanoramaWideAngle,
                outlined = Icons.Outlined.PanoramaWideAngle,
                rounded = Icons.Rounded.PanoramaWideAngle,
                sharp = Icons.Sharp.PanoramaWideAngle,
                twoTone = Icons.TwoTone.PanoramaWideAngle
            ),
            IconData(
                name = "PartyMode",
                filled = Icons.Filled.PartyMode,
                outlined = Icons.Outlined.PartyMode,
                rounded = Icons.Rounded.PartyMode,
                sharp = Icons.Sharp.PartyMode,
                twoTone = Icons.TwoTone.PartyMode
            ),
            IconData(
                name = "Pause",
                filled = Icons.Filled.Pause,
                outlined = Icons.Outlined.Pause,
                rounded = Icons.Rounded.Pause,
                sharp = Icons.Sharp.Pause,
                twoTone = Icons.TwoTone.Pause
            ),
            IconData(
                name = "PauseCircleFilled",
                filled = Icons.Filled.PauseCircleFilled,
                outlined = Icons.Outlined.PauseCircleFilled,
                rounded = Icons.Rounded.PauseCircleFilled,
                sharp = Icons.Sharp.PauseCircleFilled,
                twoTone = Icons.TwoTone.PauseCircleFilled
            ),
            IconData(
                name = "PauseCircleOutline",
                filled = Icons.Filled.PauseCircleOutline,
                outlined = Icons.Outlined.PauseCircleOutline,
                rounded = Icons.Rounded.PauseCircleOutline,
                sharp = Icons.Sharp.PauseCircleOutline,
                twoTone = Icons.TwoTone.PauseCircleOutline
            ),
            IconData(
                name = "PausePresentation",
                filled = Icons.Filled.PausePresentation,
                outlined = Icons.Outlined.PausePresentation,
                rounded = Icons.Rounded.PausePresentation,
                sharp = Icons.Sharp.PausePresentation,
                twoTone = Icons.TwoTone.PausePresentation
            ),
            IconData(
                name = "Payment",
                filled = Icons.Filled.Payment,
                outlined = Icons.Outlined.Payment,
                rounded = Icons.Rounded.Payment,
                sharp = Icons.Sharp.Payment,
                twoTone = Icons.TwoTone.Payment
            ),
            IconData(
                name = "Payments",
                filled = Icons.Filled.Payments,
                outlined = Icons.Outlined.Payments,
                rounded = Icons.Rounded.Payments,
                sharp = Icons.Sharp.Payments,
                twoTone = Icons.TwoTone.Payments
            ),
            IconData(
                name = "PedalBike",
                filled = Icons.Filled.PedalBike,
                outlined = Icons.Outlined.PedalBike,
                rounded = Icons.Rounded.PedalBike,
                sharp = Icons.Sharp.PedalBike,
                twoTone = Icons.TwoTone.PedalBike
            ),
            IconData(
                name = "Pending",
                filled = Icons.Filled.Pending,
                outlined = Icons.Outlined.Pending,
                rounded = Icons.Rounded.Pending,
                sharp = Icons.Sharp.Pending,
                twoTone = Icons.TwoTone.Pending
            ),
            IconData(
                name = "PendingActions",
                filled = Icons.Filled.PendingActions,
                outlined = Icons.Outlined.PendingActions,
                rounded = Icons.Rounded.PendingActions,
                sharp = Icons.Sharp.PendingActions,
                twoTone = Icons.TwoTone.PendingActions
            ),
            IconData(
                name = "People",
                filled = Icons.Filled.People,
                outlined = Icons.Outlined.People,
                rounded = Icons.Rounded.People,
                sharp = Icons.Sharp.People,
                twoTone = Icons.TwoTone.People
            ),
            IconData(
                name = "PeopleAlt",
                filled = Icons.Filled.PeopleAlt,
                outlined = Icons.Outlined.PeopleAlt,
                rounded = Icons.Rounded.PeopleAlt,
                sharp = Icons.Sharp.PeopleAlt,
                twoTone = Icons.TwoTone.PeopleAlt
            ),
            IconData(
                name = "PeopleOutline",
                filled = Icons.Filled.PeopleOutline,
                outlined = Icons.Outlined.PeopleOutline,
                rounded = Icons.Rounded.PeopleOutline,
                sharp = Icons.Sharp.PeopleOutline,
                twoTone = Icons.TwoTone.PeopleOutline
            ),
            IconData(
                name = "PermCameraMic",
                filled = Icons.Filled.PermCameraMic,
                outlined = Icons.Outlined.PermCameraMic,
                rounded = Icons.Rounded.PermCameraMic,
                sharp = Icons.Sharp.PermCameraMic,
                twoTone = Icons.TwoTone.PermCameraMic
            ),
            IconData(
                name = "PermContactCalendar",
                filled = Icons.Filled.PermContactCalendar,
                outlined = Icons.Outlined.PermContactCalendar,
                rounded = Icons.Rounded.PermContactCalendar,
                sharp = Icons.Sharp.PermContactCalendar,
                twoTone = Icons.TwoTone.PermContactCalendar
            ),
            IconData(
                name = "PermDataSetting",
                filled = Icons.Filled.PermDataSetting,
                outlined = Icons.Outlined.PermDataSetting,
                rounded = Icons.Rounded.PermDataSetting,
                sharp = Icons.Sharp.PermDataSetting,
                twoTone = Icons.TwoTone.PermDataSetting
            ),
            IconData(
                name = "PermDeviceInformation",
                filled = Icons.Filled.PermDeviceInformation,
                outlined = Icons.Outlined.PermDeviceInformation,
                rounded = Icons.Rounded.PermDeviceInformation,
                sharp = Icons.Sharp.PermDeviceInformation,
                twoTone = Icons.TwoTone.PermDeviceInformation
            ),
            IconData(
                name = "PermIdentity",
                filled = Icons.Filled.PermIdentity,
                outlined = Icons.Outlined.PermIdentity,
                rounded = Icons.Rounded.PermIdentity,
                sharp = Icons.Sharp.PermIdentity,
                twoTone = Icons.TwoTone.PermIdentity
            ),
            IconData(
                name = "PermMedia",
                filled = Icons.Filled.PermMedia,
                outlined = Icons.Outlined.PermMedia,
                rounded = Icons.Rounded.PermMedia,
                sharp = Icons.Sharp.PermMedia,
                twoTone = Icons.TwoTone.PermMedia
            ),
            IconData(
                name = "PermPhoneMsg",
                filled = Icons.Filled.PermPhoneMsg,
                outlined = Icons.Outlined.PermPhoneMsg,
                rounded = Icons.Rounded.PermPhoneMsg,
                sharp = Icons.Sharp.PermPhoneMsg,
                twoTone = Icons.TwoTone.PermPhoneMsg
            ),
            IconData(
                name = "PermScanWifi",
                filled = Icons.Filled.PermScanWifi,
                outlined = Icons.Outlined.PermScanWifi,
                rounded = Icons.Rounded.PermScanWifi,
                sharp = Icons.Sharp.PermScanWifi,
                twoTone = Icons.TwoTone.PermScanWifi
            ),
            IconData(
                name = "PersonAdd",
                filled = Icons.Filled.PersonAdd,
                outlined = Icons.Outlined.PersonAdd,
                rounded = Icons.Rounded.PersonAdd,
                sharp = Icons.Sharp.PersonAdd,
                twoTone = Icons.TwoTone.PersonAdd
            ),
            IconData(
                name = "PersonAddAlt1",
                filled = Icons.Filled.PersonAddAlt1,
                outlined = Icons.Outlined.PersonAddAlt1,
                rounded = Icons.Rounded.PersonAddAlt1,
                sharp = Icons.Sharp.PersonAddAlt1,
                twoTone = Icons.TwoTone.PersonAddAlt1
            ),
            IconData(
                name = "PersonAddDisabled",
                filled = Icons.Filled.PersonAddDisabled,
                outlined = Icons.Outlined.PersonAddDisabled,
                rounded = Icons.Rounded.PersonAddDisabled,
                sharp = Icons.Sharp.PersonAddDisabled,
                twoTone = Icons.TwoTone.PersonAddDisabled
            ),
            IconData(
                name = "PersonOutline",
                filled = Icons.Filled.PersonOutline,
                outlined = Icons.Outlined.PersonOutline,
                rounded = Icons.Rounded.PersonOutline,
                sharp = Icons.Sharp.PersonOutline,
                twoTone = Icons.TwoTone.PersonOutline
            ),
            IconData(
                name = "PersonPin",
                filled = Icons.Filled.PersonPin,
                outlined = Icons.Outlined.PersonPin,
                rounded = Icons.Rounded.PersonPin,
                sharp = Icons.Sharp.PersonPin,
                twoTone = Icons.TwoTone.PersonPin
            ),
            IconData(
                name = "PersonPinCircle",
                filled = Icons.Filled.PersonPinCircle,
                outlined = Icons.Outlined.PersonPinCircle,
                rounded = Icons.Rounded.PersonPinCircle,
                sharp = Icons.Sharp.PersonPinCircle,
                twoTone = Icons.TwoTone.PersonPinCircle
            ),
            IconData(
                name = "PersonRemove",
                filled = Icons.Filled.PersonRemove,
                outlined = Icons.Outlined.PersonRemove,
                rounded = Icons.Rounded.PersonRemove,
                sharp = Icons.Sharp.PersonRemove,
                twoTone = Icons.TwoTone.PersonRemove
            ),
            IconData(
                name = "PersonRemoveAlt1",
                filled = Icons.Filled.PersonRemoveAlt1,
                outlined = Icons.Outlined.PersonRemoveAlt1,
                rounded = Icons.Rounded.PersonRemoveAlt1,
                sharp = Icons.Sharp.PersonRemoveAlt1,
                twoTone = Icons.TwoTone.PersonRemoveAlt1
            ),
            IconData(
                name = "PersonSearch",
                filled = Icons.Filled.PersonSearch,
                outlined = Icons.Outlined.PersonSearch,
                rounded = Icons.Rounded.PersonSearch,
                sharp = Icons.Sharp.PersonSearch,
                twoTone = Icons.TwoTone.PersonSearch
            ),
            IconData(
                name = "PersonalVideo",
                filled = Icons.Filled.PersonalVideo,
                outlined = Icons.Outlined.PersonalVideo,
                rounded = Icons.Rounded.PersonalVideo,
                sharp = Icons.Sharp.PersonalVideo,
                twoTone = Icons.TwoTone.PersonalVideo
            ),
            IconData(
                name = "PestControl",
                filled = Icons.Filled.PestControl,
                outlined = Icons.Outlined.PestControl,
                rounded = Icons.Rounded.PestControl,
                sharp = Icons.Sharp.PestControl,
                twoTone = Icons.TwoTone.PestControl
            ),
            IconData(
                name = "PestControlRodent",
                filled = Icons.Filled.PestControlRodent,
                outlined = Icons.Outlined.PestControlRodent,
                rounded = Icons.Rounded.PestControlRodent,
                sharp = Icons.Sharp.PestControlRodent,
                twoTone = Icons.TwoTone.PestControlRodent
            ),
            IconData(
                name = "Pets",
                filled = Icons.Filled.Pets,
                outlined = Icons.Outlined.Pets,
                rounded = Icons.Rounded.Pets,
                sharp = Icons.Sharp.Pets,
                twoTone = Icons.TwoTone.Pets
            ),
            IconData(
                name = "PhoneAndroid",
                filled = Icons.Filled.PhoneAndroid,
                outlined = Icons.Outlined.PhoneAndroid,
                rounded = Icons.Rounded.PhoneAndroid,
                sharp = Icons.Sharp.PhoneAndroid,
                twoTone = Icons.TwoTone.PhoneAndroid
            ),
            IconData(
                name = "PhoneBluetoothSpeaker",
                filled = Icons.Filled.PhoneBluetoothSpeaker,
                outlined = Icons.Outlined.PhoneBluetoothSpeaker,
                rounded = Icons.Rounded.PhoneBluetoothSpeaker,
                sharp = Icons.Sharp.PhoneBluetoothSpeaker,
                twoTone = Icons.TwoTone.PhoneBluetoothSpeaker
            ),
            IconData(
                name = "PhoneCallback",
                filled = Icons.Filled.PhoneCallback,
                outlined = Icons.Outlined.PhoneCallback,
                rounded = Icons.Rounded.PhoneCallback,
                sharp = Icons.Sharp.PhoneCallback,
                twoTone = Icons.TwoTone.PhoneCallback
            ),
            IconData(
                name = "PhoneDisabled",
                filled = Icons.Filled.PhoneDisabled,
                outlined = Icons.Outlined.PhoneDisabled,
                rounded = Icons.Rounded.PhoneDisabled,
                sharp = Icons.Sharp.PhoneDisabled,
                twoTone = Icons.TwoTone.PhoneDisabled
            ),
            IconData(
                name = "PhoneEnabled",
                filled = Icons.Filled.PhoneEnabled,
                outlined = Icons.Outlined.PhoneEnabled,
                rounded = Icons.Rounded.PhoneEnabled,
                sharp = Icons.Sharp.PhoneEnabled,
                twoTone = Icons.TwoTone.PhoneEnabled
            ),
            IconData(
                name = "PhoneForwarded",
                filled = Icons.Filled.PhoneForwarded,
                outlined = Icons.Outlined.PhoneForwarded,
                rounded = Icons.Rounded.PhoneForwarded,
                sharp = Icons.Sharp.PhoneForwarded,
                twoTone = Icons.TwoTone.PhoneForwarded
            ),
            IconData(
                name = "PhoneInTalk",
                filled = Icons.Filled.PhoneInTalk,
                outlined = Icons.Outlined.PhoneInTalk,
                rounded = Icons.Rounded.PhoneInTalk,
                sharp = Icons.Sharp.PhoneInTalk,
                twoTone = Icons.TwoTone.PhoneInTalk
            ),
            IconData(
                name = "PhoneIphone",
                filled = Icons.Filled.PhoneIphone,
                outlined = Icons.Outlined.PhoneIphone,
                rounded = Icons.Rounded.PhoneIphone,
                sharp = Icons.Sharp.PhoneIphone,
                twoTone = Icons.TwoTone.PhoneIphone
            ),
            IconData(
                name = "PhoneLocked",
                filled = Icons.Filled.PhoneLocked,
                outlined = Icons.Outlined.PhoneLocked,
                rounded = Icons.Rounded.PhoneLocked,
                sharp = Icons.Sharp.PhoneLocked,
                twoTone = Icons.TwoTone.PhoneLocked
            ),
            IconData(
                name = "PhoneMissed",
                filled = Icons.Filled.PhoneMissed,
                outlined = Icons.Outlined.PhoneMissed,
                rounded = Icons.Rounded.PhoneMissed,
                sharp = Icons.Sharp.PhoneMissed,
                twoTone = Icons.TwoTone.PhoneMissed
            ),
            IconData(
                name = "PhonePaused",
                filled = Icons.Filled.PhonePaused,
                outlined = Icons.Outlined.PhonePaused,
                rounded = Icons.Rounded.PhonePaused,
                sharp = Icons.Sharp.PhonePaused,
                twoTone = Icons.TwoTone.PhonePaused
            ),
            IconData(
                name = "Phonelink",
                filled = Icons.Filled.Phonelink,
                outlined = Icons.Outlined.Phonelink,
                rounded = Icons.Rounded.Phonelink,
                sharp = Icons.Sharp.Phonelink,
                twoTone = Icons.TwoTone.Phonelink
            ),
            IconData(
                name = "PhonelinkErase",
                filled = Icons.Filled.PhonelinkErase,
                outlined = Icons.Outlined.PhonelinkErase,
                rounded = Icons.Rounded.PhonelinkErase,
                sharp = Icons.Sharp.PhonelinkErase,
                twoTone = Icons.TwoTone.PhonelinkErase
            ),
            IconData(
                name = "PhonelinkLock",
                filled = Icons.Filled.PhonelinkLock,
                outlined = Icons.Outlined.PhonelinkLock,
                rounded = Icons.Rounded.PhonelinkLock,
                sharp = Icons.Sharp.PhonelinkLock,
                twoTone = Icons.TwoTone.PhonelinkLock
            ),
            IconData(
                name = "PhonelinkOff",
                filled = Icons.Filled.PhonelinkOff,
                outlined = Icons.Outlined.PhonelinkOff,
                rounded = Icons.Rounded.PhonelinkOff,
                sharp = Icons.Sharp.PhonelinkOff,
                twoTone = Icons.TwoTone.PhonelinkOff
            ),
            IconData(
                name = "PhonelinkRing",
                filled = Icons.Filled.PhonelinkRing,
                outlined = Icons.Outlined.PhonelinkRing,
                rounded = Icons.Rounded.PhonelinkRing,
                sharp = Icons.Sharp.PhonelinkRing,
                twoTone = Icons.TwoTone.PhonelinkRing
            ),
            IconData(
                name = "PhonelinkSetup",
                filled = Icons.Filled.PhonelinkSetup,
                outlined = Icons.Outlined.PhonelinkSetup,
                rounded = Icons.Rounded.PhonelinkSetup,
                sharp = Icons.Sharp.PhonelinkSetup,
                twoTone = Icons.TwoTone.PhonelinkSetup
            ),
            IconData(
                name = "Photo",
                filled = Icons.Filled.Photo,
                outlined = Icons.Outlined.Photo,
                rounded = Icons.Rounded.Photo,
                sharp = Icons.Sharp.Photo,
                twoTone = Icons.TwoTone.Photo
            ),
            IconData(
                name = "PhotoAlbum",
                filled = Icons.Filled.PhotoAlbum,
                outlined = Icons.Outlined.PhotoAlbum,
                rounded = Icons.Rounded.PhotoAlbum,
                sharp = Icons.Sharp.PhotoAlbum,
                twoTone = Icons.TwoTone.PhotoAlbum
            ),
            IconData(
                name = "PhotoCamera",
                filled = Icons.Filled.PhotoCamera,
                outlined = Icons.Outlined.PhotoCamera,
                rounded = Icons.Rounded.PhotoCamera,
                sharp = Icons.Sharp.PhotoCamera,
                twoTone = Icons.TwoTone.PhotoCamera
            ),
            IconData(
                name = "PhotoFilter",
                filled = Icons.Filled.PhotoFilter,
                outlined = Icons.Outlined.PhotoFilter,
                rounded = Icons.Rounded.PhotoFilter,
                sharp = Icons.Sharp.PhotoFilter,
                twoTone = Icons.TwoTone.PhotoFilter
            ),
            IconData(
                name = "PhotoLibrary",
                filled = Icons.Filled.PhotoLibrary,
                outlined = Icons.Outlined.PhotoLibrary,
                rounded = Icons.Rounded.PhotoLibrary,
                sharp = Icons.Sharp.PhotoLibrary,
                twoTone = Icons.TwoTone.PhotoLibrary
            ),
            IconData(
                name = "PhotoSizeSelectActual",
                filled = Icons.Filled.PhotoSizeSelectActual,
                outlined = Icons.Outlined.PhotoSizeSelectActual,
                rounded = Icons.Rounded.PhotoSizeSelectActual,
                sharp = Icons.Sharp.PhotoSizeSelectActual,
                twoTone = Icons.TwoTone.PhotoSizeSelectActual
            ),
            IconData(
                name = "PhotoSizeSelectLarge",
                filled = Icons.Filled.PhotoSizeSelectLarge,
                outlined = Icons.Outlined.PhotoSizeSelectLarge,
                rounded = Icons.Rounded.PhotoSizeSelectLarge,
                sharp = Icons.Sharp.PhotoSizeSelectLarge,
                twoTone = Icons.TwoTone.PhotoSizeSelectLarge
            ),
            IconData(
                name = "PhotoSizeSelectSmall",
                filled = Icons.Filled.PhotoSizeSelectSmall,
                outlined = Icons.Outlined.PhotoSizeSelectSmall,
                rounded = Icons.Rounded.PhotoSizeSelectSmall,
                sharp = Icons.Sharp.PhotoSizeSelectSmall,
                twoTone = Icons.TwoTone.PhotoSizeSelectSmall
            ),
            IconData(
                name = "PictureAsPdf",
                filled = Icons.Filled.PictureAsPdf,
                outlined = Icons.Outlined.PictureAsPdf,
                rounded = Icons.Rounded.PictureAsPdf,
                sharp = Icons.Sharp.PictureAsPdf,
                twoTone = Icons.TwoTone.PictureAsPdf
            ),
            IconData(
                name = "PictureInPicture",
                filled = Icons.Filled.PictureInPicture,
                outlined = Icons.Outlined.PictureInPicture,
                rounded = Icons.Rounded.PictureInPicture,
                sharp = Icons.Sharp.PictureInPicture,
                twoTone = Icons.TwoTone.PictureInPicture
            ),
            IconData(
                name = "PictureInPictureAlt",
                filled = Icons.Filled.PictureInPictureAlt,
                outlined = Icons.Outlined.PictureInPictureAlt,
                rounded = Icons.Rounded.PictureInPictureAlt,
                sharp = Icons.Sharp.PictureInPictureAlt,
                twoTone = Icons.TwoTone.PictureInPictureAlt
            ),
            IconData(
                name = "PieChart",
                filled = Icons.Filled.PieChart,
                outlined = Icons.Outlined.PieChart,
                rounded = Icons.Rounded.PieChart,
                sharp = Icons.Sharp.PieChart,
                twoTone = Icons.TwoTone.PieChart
            ),
            IconData(
                name = "PinDrop",
                filled = Icons.Filled.PinDrop,
                outlined = Icons.Outlined.PinDrop,
                rounded = Icons.Rounded.PinDrop,
                sharp = Icons.Sharp.PinDrop,
                twoTone = Icons.TwoTone.PinDrop
            ),
            IconData(
                name = "Plagiarism",
                filled = Icons.Filled.Plagiarism,
                outlined = Icons.Outlined.Plagiarism,
                rounded = Icons.Rounded.Plagiarism,
                sharp = Icons.Sharp.Plagiarism,
                twoTone = Icons.TwoTone.Plagiarism
            ),
            IconData(
                name = "PlayCircleFilled",
                filled = Icons.Filled.PlayCircleFilled,
                outlined = Icons.Outlined.PlayCircleFilled,
                rounded = Icons.Rounded.PlayCircleFilled,
                sharp = Icons.Sharp.PlayCircleFilled,
                twoTone = Icons.TwoTone.PlayCircleFilled
            ),
            IconData(
                name = "PlayCircleOutline",
                filled = Icons.Filled.PlayCircleOutline,
                outlined = Icons.Outlined.PlayCircleOutline,
                rounded = Icons.Rounded.PlayCircleOutline,
                sharp = Icons.Sharp.PlayCircleOutline,
                twoTone = Icons.TwoTone.PlayCircleOutline
            ),
            IconData(
                name = "PlayForWork",
                filled = Icons.Filled.PlayForWork,
                outlined = Icons.Outlined.PlayForWork,
                rounded = Icons.Rounded.PlayForWork,
                sharp = Icons.Sharp.PlayForWork,
                twoTone = Icons.TwoTone.PlayForWork
            ),
            IconData(
                name = "PlaylistAdd",
                filled = Icons.Filled.PlaylistAdd,
                outlined = Icons.Outlined.PlaylistAdd,
                rounded = Icons.Rounded.PlaylistAdd,
                sharp = Icons.Sharp.PlaylistAdd,
                twoTone = Icons.TwoTone.PlaylistAdd
            ),
            IconData(
                name = "PlaylistAddCheck",
                filled = Icons.Filled.PlaylistAddCheck,
                outlined = Icons.Outlined.PlaylistAddCheck,
                rounded = Icons.Rounded.PlaylistAddCheck,
                sharp = Icons.Sharp.PlaylistAddCheck,
                twoTone = Icons.TwoTone.PlaylistAddCheck
            ),
            IconData(
                name = "PlaylistPlay",
                filled = Icons.Filled.PlaylistPlay,
                outlined = Icons.Outlined.PlaylistPlay,
                rounded = Icons.Rounded.PlaylistPlay,
                sharp = Icons.Sharp.PlaylistPlay,
                twoTone = Icons.TwoTone.PlaylistPlay
            ),
            IconData(
                name = "Plumbing",
                filled = Icons.Filled.Plumbing,
                outlined = Icons.Outlined.Plumbing,
                rounded = Icons.Rounded.Plumbing,
                sharp = Icons.Sharp.Plumbing,
                twoTone = Icons.TwoTone.Plumbing
            ),
            IconData(
                name = "PlusOne",
                filled = Icons.Filled.PlusOne,
                outlined = Icons.Outlined.PlusOne,
                rounded = Icons.Rounded.PlusOne,
                sharp = Icons.Sharp.PlusOne,
                twoTone = Icons.TwoTone.PlusOne
            ),
            IconData(
                name = "PointOfSale",
                filled = Icons.Filled.PointOfSale,
                outlined = Icons.Outlined.PointOfSale,
                rounded = Icons.Rounded.PointOfSale,
                sharp = Icons.Sharp.PointOfSale,
                twoTone = Icons.TwoTone.PointOfSale
            ),
            IconData(
                name = "Policy",
                filled = Icons.Filled.Policy,
                outlined = Icons.Outlined.Policy,
                rounded = Icons.Rounded.Policy,
                sharp = Icons.Sharp.Policy,
                twoTone = Icons.TwoTone.Policy
            ),
            IconData(
                name = "Poll",
                filled = Icons.Filled.Poll,
                outlined = Icons.Outlined.Poll,
                rounded = Icons.Rounded.Poll,
                sharp = Icons.Sharp.Poll,
                twoTone = Icons.TwoTone.Poll
            ),
            IconData(
                name = "Polymer",
                filled = Icons.Filled.Polymer,
                outlined = Icons.Outlined.Polymer,
                rounded = Icons.Rounded.Polymer,
                sharp = Icons.Sharp.Polymer,
                twoTone = Icons.TwoTone.Polymer
            ),
            IconData(
                name = "Pool",
                filled = Icons.Filled.Pool,
                outlined = Icons.Outlined.Pool,
                rounded = Icons.Rounded.Pool,
                sharp = Icons.Sharp.Pool,
                twoTone = Icons.TwoTone.Pool
            ),
            IconData(
                name = "PortableWifiOff",
                filled = Icons.Filled.PortableWifiOff,
                outlined = Icons.Outlined.PortableWifiOff,
                rounded = Icons.Rounded.PortableWifiOff,
                sharp = Icons.Sharp.PortableWifiOff,
                twoTone = Icons.TwoTone.PortableWifiOff
            ),
            IconData(
                name = "Portrait",
                filled = Icons.Filled.Portrait,
                outlined = Icons.Outlined.Portrait,
                rounded = Icons.Rounded.Portrait,
                sharp = Icons.Sharp.Portrait,
                twoTone = Icons.TwoTone.Portrait
            ),
            IconData(
                name = "PostAdd",
                filled = Icons.Filled.PostAdd,
                outlined = Icons.Outlined.PostAdd,
                rounded = Icons.Rounded.PostAdd,
                sharp = Icons.Sharp.PostAdd,
                twoTone = Icons.TwoTone.PostAdd
            ),
            IconData(
                name = "Power",
                filled = Icons.Filled.Power,
                outlined = Icons.Outlined.Power,
                rounded = Icons.Rounded.Power,
                sharp = Icons.Sharp.Power,
                twoTone = Icons.TwoTone.Power
            ),
            IconData(
                name = "PowerInput",
                filled = Icons.Filled.PowerInput,
                outlined = Icons.Outlined.PowerInput,
                rounded = Icons.Rounded.PowerInput,
                sharp = Icons.Sharp.PowerInput,
                twoTone = Icons.TwoTone.PowerInput
            ),
            IconData(
                name = "PowerOff",
                filled = Icons.Filled.PowerOff,
                outlined = Icons.Outlined.PowerOff,
                rounded = Icons.Rounded.PowerOff,
                sharp = Icons.Sharp.PowerOff,
                twoTone = Icons.TwoTone.PowerOff
            ),
            IconData(
                name = "PowerSettingsNew",
                filled = Icons.Filled.PowerSettingsNew,
                outlined = Icons.Outlined.PowerSettingsNew,
                rounded = Icons.Rounded.PowerSettingsNew,
                sharp = Icons.Sharp.PowerSettingsNew,
                twoTone = Icons.TwoTone.PowerSettingsNew
            ),
            IconData(
                name = "PregnantWoman",
                filled = Icons.Filled.PregnantWoman,
                outlined = Icons.Outlined.PregnantWoman,
                rounded = Icons.Rounded.PregnantWoman,
                sharp = Icons.Sharp.PregnantWoman,
                twoTone = Icons.TwoTone.PregnantWoman
            ),
            IconData(
                name = "PresentToAll",
                filled = Icons.Filled.PresentToAll,
                outlined = Icons.Outlined.PresentToAll,
                rounded = Icons.Rounded.PresentToAll,
                sharp = Icons.Sharp.PresentToAll,
                twoTone = Icons.TwoTone.PresentToAll
            ),
            IconData(
                name = "Preview",
                filled = Icons.Filled.Preview,
                outlined = Icons.Outlined.Preview,
                rounded = Icons.Rounded.Preview,
                sharp = Icons.Sharp.Preview,
                twoTone = Icons.TwoTone.Preview
            ),
            IconData(
                name = "Print",
                filled = Icons.Filled.Print,
                outlined = Icons.Outlined.Print,
                rounded = Icons.Rounded.Print,
                sharp = Icons.Sharp.Print,
                twoTone = Icons.TwoTone.Print
            ),
            IconData(
                name = "PrintDisabled",
                filled = Icons.Filled.PrintDisabled,
                outlined = Icons.Outlined.PrintDisabled,
                rounded = Icons.Rounded.PrintDisabled,
                sharp = Icons.Sharp.PrintDisabled,
                twoTone = Icons.TwoTone.PrintDisabled
            ),
            IconData(
                name = "PriorityHigh",
                filled = Icons.Filled.PriorityHigh,
                outlined = Icons.Outlined.PriorityHigh,
                rounded = Icons.Rounded.PriorityHigh,
                sharp = Icons.Sharp.PriorityHigh,
                twoTone = Icons.TwoTone.PriorityHigh
            ),
            IconData(
                name = "PrivacyTip",
                filled = Icons.Filled.PrivacyTip,
                outlined = Icons.Outlined.PrivacyTip,
                rounded = Icons.Rounded.PrivacyTip,
                sharp = Icons.Sharp.PrivacyTip,
                twoTone = Icons.TwoTone.PrivacyTip
            ),
            IconData(
                name = "Psychology",
                filled = Icons.Filled.Psychology,
                outlined = Icons.Outlined.Psychology,
                rounded = Icons.Rounded.Psychology,
                sharp = Icons.Sharp.Psychology,
                twoTone = Icons.TwoTone.Psychology
            ),
            IconData(
                name = "Public",
                filled = Icons.Filled.Public,
                outlined = Icons.Outlined.Public,
                rounded = Icons.Rounded.Public,
                sharp = Icons.Sharp.Public,
                twoTone = Icons.TwoTone.Public
            ),
            IconData(
                name = "PublicOff",
                filled = Icons.Filled.PublicOff,
                outlined = Icons.Outlined.PublicOff,
                rounded = Icons.Rounded.PublicOff,
                sharp = Icons.Sharp.PublicOff,
                twoTone = Icons.TwoTone.PublicOff
            ),
            IconData(
                name = "Publish",
                filled = Icons.Filled.Publish,
                outlined = Icons.Outlined.Publish,
                rounded = Icons.Rounded.Publish,
                sharp = Icons.Sharp.Publish,
                twoTone = Icons.TwoTone.Publish
            ),
            IconData(
                name = "PublishedWithChanges",
                filled = Icons.Filled.PublishedWithChanges,
                outlined = Icons.Outlined.PublishedWithChanges,
                rounded = Icons.Rounded.PublishedWithChanges,
                sharp = Icons.Sharp.PublishedWithChanges,
                twoTone = Icons.TwoTone.PublishedWithChanges
            ),
            IconData(
                name = "PushPin",
                filled = Icons.Filled.PushPin,
                outlined = Icons.Outlined.PushPin,
                rounded = Icons.Rounded.PushPin,
                sharp = Icons.Sharp.PushPin,
                twoTone = Icons.TwoTone.PushPin
            ),
            IconData(
                name = "QrCode",
                filled = Icons.Filled.QrCode,
                outlined = Icons.Outlined.QrCode,
                rounded = Icons.Rounded.QrCode,
                sharp = Icons.Sharp.QrCode,
                twoTone = Icons.TwoTone.QrCode
            ),
            IconData(
                name = "QrCode2",
                filled = Icons.Filled.QrCode2,
                outlined = Icons.Outlined.QrCode2,
                rounded = Icons.Rounded.QrCode2,
                sharp = Icons.Sharp.QrCode2,
                twoTone = Icons.TwoTone.QrCode2
            ),
            IconData(
                name = "QrCodeScanner",
                filled = Icons.Filled.QrCodeScanner,
                outlined = Icons.Outlined.QrCodeScanner,
                rounded = Icons.Rounded.QrCodeScanner,
                sharp = Icons.Sharp.QrCodeScanner,
                twoTone = Icons.TwoTone.QrCodeScanner
            ),
            IconData(
                name = "QueryBuilder",
                filled = Icons.Filled.QueryBuilder,
                outlined = Icons.Outlined.QueryBuilder,
                rounded = Icons.Rounded.QueryBuilder,
                sharp = Icons.Sharp.QueryBuilder,
                twoTone = Icons.TwoTone.QueryBuilder
            ),
            IconData(
                name = "QuestionAnswer",
                filled = Icons.Filled.QuestionAnswer,
                outlined = Icons.Outlined.QuestionAnswer,
                rounded = Icons.Rounded.QuestionAnswer,
                sharp = Icons.Sharp.QuestionAnswer,
                twoTone = Icons.TwoTone.QuestionAnswer
            ),
            IconData(
                name = "Queue",
                filled = Icons.Filled.Queue,
                outlined = Icons.Outlined.Queue,
                rounded = Icons.Rounded.Queue,
                sharp = Icons.Sharp.Queue,
                twoTone = Icons.TwoTone.Queue
            ),
            IconData(
                name = "QueueMusic",
                filled = Icons.Filled.QueueMusic,
                outlined = Icons.Outlined.QueueMusic,
                rounded = Icons.Rounded.QueueMusic,
                sharp = Icons.Sharp.QueueMusic,
                twoTone = Icons.TwoTone.QueueMusic
            ),
            IconData(
                name = "QueuePlayNext",
                filled = Icons.Filled.QueuePlayNext,
                outlined = Icons.Outlined.QueuePlayNext,
                rounded = Icons.Rounded.QueuePlayNext,
                sharp = Icons.Sharp.QueuePlayNext,
                twoTone = Icons.TwoTone.QueuePlayNext
            ),
            IconData(
                name = "Quickreply",
                filled = Icons.Filled.Quickreply,
                outlined = Icons.Outlined.Quickreply,
                rounded = Icons.Rounded.Quickreply,
                sharp = Icons.Sharp.Quickreply,
                twoTone = Icons.TwoTone.Quickreply
            ),
            IconData(
                name = "Radio",
                filled = Icons.Filled.Radio,
                outlined = Icons.Outlined.Radio,
                rounded = Icons.Rounded.Radio,
                sharp = Icons.Sharp.Radio,
                twoTone = Icons.TwoTone.Radio
            ),
            IconData(
                name = "RadioButtonChecked",
                filled = Icons.Filled.RadioButtonChecked,
                outlined = Icons.Outlined.RadioButtonChecked,
                rounded = Icons.Rounded.RadioButtonChecked,
                sharp = Icons.Sharp.RadioButtonChecked,
                twoTone = Icons.TwoTone.RadioButtonChecked
            ),
            IconData(
                name = "RadioButtonUnchecked",
                filled = Icons.Filled.RadioButtonUnchecked,
                outlined = Icons.Outlined.RadioButtonUnchecked,
                rounded = Icons.Rounded.RadioButtonUnchecked,
                sharp = Icons.Sharp.RadioButtonUnchecked,
                twoTone = Icons.TwoTone.RadioButtonUnchecked
            ),
            IconData(
                name = "RateReview",
                filled = Icons.Filled.RateReview,
                outlined = Icons.Outlined.RateReview,
                rounded = Icons.Rounded.RateReview,
                sharp = Icons.Sharp.RateReview,
                twoTone = Icons.TwoTone.RateReview
            ),
            IconData(
                name = "ReadMore",
                filled = Icons.Filled.ReadMore,
                outlined = Icons.Outlined.ReadMore,
                rounded = Icons.Rounded.ReadMore,
                sharp = Icons.Sharp.ReadMore,
                twoTone = Icons.TwoTone.ReadMore
            ),
            IconData(
                name = "Receipt",
                filled = Icons.Filled.Receipt,
                outlined = Icons.Outlined.Receipt,
                rounded = Icons.Rounded.Receipt,
                sharp = Icons.Sharp.Receipt,
                twoTone = Icons.TwoTone.Receipt
            ),
            IconData(
                name = "ReceiptLong",
                filled = Icons.Filled.ReceiptLong,
                outlined = Icons.Outlined.ReceiptLong,
                rounded = Icons.Rounded.ReceiptLong,
                sharp = Icons.Sharp.ReceiptLong,
                twoTone = Icons.TwoTone.ReceiptLong
            ),
            IconData(
                name = "RecentActors",
                filled = Icons.Filled.RecentActors,
                outlined = Icons.Outlined.RecentActors,
                rounded = Icons.Rounded.RecentActors,
                sharp = Icons.Sharp.RecentActors,
                twoTone = Icons.TwoTone.RecentActors
            ),
            IconData(
                name = "RecordVoiceOver",
                filled = Icons.Filled.RecordVoiceOver,
                outlined = Icons.Outlined.RecordVoiceOver,
                rounded = Icons.Rounded.RecordVoiceOver,
                sharp = Icons.Sharp.RecordVoiceOver,
                twoTone = Icons.TwoTone.RecordVoiceOver
            ),
            IconData(
                name = "Redeem",
                filled = Icons.Filled.Redeem,
                outlined = Icons.Outlined.Redeem,
                rounded = Icons.Rounded.Redeem,
                sharp = Icons.Sharp.Redeem,
                twoTone = Icons.TwoTone.Redeem
            ),
            IconData(
                name = "Redo",
                filled = Icons.Filled.Redo,
                outlined = Icons.Outlined.Redo,
                rounded = Icons.Rounded.Redo,
                sharp = Icons.Sharp.Redo,
                twoTone = Icons.TwoTone.Redo
            ),
            IconData(
                name = "ReduceCapacity",
                filled = Icons.Filled.ReduceCapacity,
                outlined = Icons.Outlined.ReduceCapacity,
                rounded = Icons.Rounded.ReduceCapacity,
                sharp = Icons.Sharp.ReduceCapacity,
                twoTone = Icons.TwoTone.ReduceCapacity
            ),
            IconData(
                name = "Remove",
                filled = Icons.Filled.Remove,
                outlined = Icons.Outlined.Remove,
                rounded = Icons.Rounded.Remove,
                sharp = Icons.Sharp.Remove,
                twoTone = Icons.TwoTone.Remove
            ),
            IconData(
                name = "RemoveCircle",
                filled = Icons.Filled.RemoveCircle,
                outlined = Icons.Outlined.RemoveCircle,
                rounded = Icons.Rounded.RemoveCircle,
                sharp = Icons.Sharp.RemoveCircle,
                twoTone = Icons.TwoTone.RemoveCircle
            ),
            IconData(
                name = "RemoveCircleOutline",
                filled = Icons.Filled.RemoveCircleOutline,
                outlined = Icons.Outlined.RemoveCircleOutline,
                rounded = Icons.Rounded.RemoveCircleOutline,
                sharp = Icons.Sharp.RemoveCircleOutline,
                twoTone = Icons.TwoTone.RemoveCircleOutline
            ),
            IconData(
                name = "RemoveFromQueue",
                filled = Icons.Filled.RemoveFromQueue,
                outlined = Icons.Outlined.RemoveFromQueue,
                rounded = Icons.Rounded.RemoveFromQueue,
                sharp = Icons.Sharp.RemoveFromQueue,
                twoTone = Icons.TwoTone.RemoveFromQueue
            ),
            IconData(
                name = "RemoveRedEye",
                filled = Icons.Filled.RemoveRedEye,
                outlined = Icons.Outlined.RemoveRedEye,
                rounded = Icons.Rounded.RemoveRedEye,
                sharp = Icons.Sharp.RemoveRedEye,
                twoTone = Icons.TwoTone.RemoveRedEye
            ),
            IconData(
                name = "RemoveShoppingCart",
                filled = Icons.Filled.RemoveShoppingCart,
                outlined = Icons.Outlined.RemoveShoppingCart,
                rounded = Icons.Rounded.RemoveShoppingCart,
                sharp = Icons.Sharp.RemoveShoppingCart,
                twoTone = Icons.TwoTone.RemoveShoppingCart
            ),
            IconData(
                name = "Reorder",
                filled = Icons.Filled.Reorder,
                outlined = Icons.Outlined.Reorder,
                rounded = Icons.Rounded.Reorder,
                sharp = Icons.Sharp.Reorder,
                twoTone = Icons.TwoTone.Reorder
            ),
            IconData(
                name = "Repeat",
                filled = Icons.Filled.Repeat,
                outlined = Icons.Outlined.Repeat,
                rounded = Icons.Rounded.Repeat,
                sharp = Icons.Sharp.Repeat,
                twoTone = Icons.TwoTone.Repeat
            ),
            IconData(
                name = "RepeatOne",
                filled = Icons.Filled.RepeatOne,
                outlined = Icons.Outlined.RepeatOne,
                rounded = Icons.Rounded.RepeatOne,
                sharp = Icons.Sharp.RepeatOne,
                twoTone = Icons.TwoTone.RepeatOne
            ),
            IconData(
                name = "Replay",
                filled = Icons.Filled.Replay,
                outlined = Icons.Outlined.Replay,
                rounded = Icons.Rounded.Replay,
                sharp = Icons.Sharp.Replay,
                twoTone = Icons.TwoTone.Replay
            ),
            IconData(
                name = "Replay10",
                filled = Icons.Filled.Replay10,
                outlined = Icons.Outlined.Replay10,
                rounded = Icons.Rounded.Replay10,
                sharp = Icons.Sharp.Replay10,
                twoTone = Icons.TwoTone.Replay10
            ),
            IconData(
                name = "Replay30",
                filled = Icons.Filled.Replay30,
                outlined = Icons.Outlined.Replay30,
                rounded = Icons.Rounded.Replay30,
                sharp = Icons.Sharp.Replay30,
                twoTone = Icons.TwoTone.Replay30
            ),
            IconData(
                name = "Replay5",
                filled = Icons.Filled.Replay5,
                outlined = Icons.Outlined.Replay5,
                rounded = Icons.Rounded.Replay5,
                sharp = Icons.Sharp.Replay5,
                twoTone = Icons.TwoTone.Replay5
            ),
            IconData(
                name = "Reply",
                filled = Icons.Filled.Reply,
                outlined = Icons.Outlined.Reply,
                rounded = Icons.Rounded.Reply,
                sharp = Icons.Sharp.Reply,
                twoTone = Icons.TwoTone.Reply
            ),
            IconData(
                name = "ReplyAll",
                filled = Icons.Filled.ReplyAll,
                outlined = Icons.Outlined.ReplyAll,
                rounded = Icons.Rounded.ReplyAll,
                sharp = Icons.Sharp.ReplyAll,
                twoTone = Icons.TwoTone.ReplyAll
            ),
            IconData(
                name = "Report",
                filled = Icons.Filled.Report,
                outlined = Icons.Outlined.Report,
                rounded = Icons.Rounded.Report,
                sharp = Icons.Sharp.Report,
                twoTone = Icons.TwoTone.Report
            ),
            IconData(
                name = "ReportOff",
                filled = Icons.Filled.ReportOff,
                outlined = Icons.Outlined.ReportOff,
                rounded = Icons.Rounded.ReportOff,
                sharp = Icons.Sharp.ReportOff,
                twoTone = Icons.TwoTone.ReportOff
            ),
            IconData(
                name = "ReportProblem",
                filled = Icons.Filled.ReportProblem,
                outlined = Icons.Outlined.ReportProblem,
                rounded = Icons.Rounded.ReportProblem,
                sharp = Icons.Sharp.ReportProblem,
                twoTone = Icons.TwoTone.ReportProblem
            ),
            IconData(
                name = "RequestPage",
                filled = Icons.Filled.RequestPage,
                outlined = Icons.Outlined.RequestPage,
                rounded = Icons.Rounded.RequestPage,
                sharp = Icons.Sharp.RequestPage,
                twoTone = Icons.TwoTone.RequestPage
            ),
            IconData(
                name = "RequestQuote",
                filled = Icons.Filled.RequestQuote,
                outlined = Icons.Outlined.RequestQuote,
                rounded = Icons.Rounded.RequestQuote,
                sharp = Icons.Sharp.RequestQuote,
                twoTone = Icons.TwoTone.RequestQuote
            ),
            IconData(
                name = "Restaurant",
                filled = Icons.Filled.Restaurant,
                outlined = Icons.Outlined.Restaurant,
                rounded = Icons.Rounded.Restaurant,
                sharp = Icons.Sharp.Restaurant,
                twoTone = Icons.TwoTone.Restaurant
            ),
            IconData(
                name = "RestaurantMenu",
                filled = Icons.Filled.RestaurantMenu,
                outlined = Icons.Outlined.RestaurantMenu,
                rounded = Icons.Rounded.RestaurantMenu,
                sharp = Icons.Sharp.RestaurantMenu,
                twoTone = Icons.TwoTone.RestaurantMenu
            ),
            IconData(
                name = "Restore",
                filled = Icons.Filled.Restore,
                outlined = Icons.Outlined.Restore,
                rounded = Icons.Rounded.Restore,
                sharp = Icons.Sharp.Restore,
                twoTone = Icons.TwoTone.Restore
            ),
            IconData(
                name = "RestoreFromTrash",
                filled = Icons.Filled.RestoreFromTrash,
                outlined = Icons.Outlined.RestoreFromTrash,
                rounded = Icons.Rounded.RestoreFromTrash,
                sharp = Icons.Sharp.RestoreFromTrash,
                twoTone = Icons.TwoTone.RestoreFromTrash
            ),
            IconData(
                name = "RestorePage",
                filled = Icons.Filled.RestorePage,
                outlined = Icons.Outlined.RestorePage,
                rounded = Icons.Rounded.RestorePage,
                sharp = Icons.Sharp.RestorePage,
                twoTone = Icons.TwoTone.RestorePage
            ),
            IconData(
                name = "RiceBowl",
                filled = Icons.Filled.RiceBowl,
                outlined = Icons.Outlined.RiceBowl,
                rounded = Icons.Rounded.RiceBowl,
                sharp = Icons.Sharp.RiceBowl,
                twoTone = Icons.TwoTone.RiceBowl
            ),
            IconData(
                name = "RingVolume",
                filled = Icons.Filled.RingVolume,
                outlined = Icons.Outlined.RingVolume,
                rounded = Icons.Rounded.RingVolume,
                sharp = Icons.Sharp.RingVolume,
                twoTone = Icons.TwoTone.RingVolume
            ),
            IconData(
                name = "Roofing",
                filled = Icons.Filled.Roofing,
                outlined = Icons.Outlined.Roofing,
                rounded = Icons.Rounded.Roofing,
                sharp = Icons.Sharp.Roofing,
                twoTone = Icons.TwoTone.Roofing
            ),
            IconData(
                name = "Room",
                filled = Icons.Filled.Room,
                outlined = Icons.Outlined.Room,
                rounded = Icons.Rounded.Room,
                sharp = Icons.Sharp.Room,
                twoTone = Icons.TwoTone.Room
            ),
            IconData(
                name = "RoomPreferences",
                filled = Icons.Filled.RoomPreferences,
                outlined = Icons.Outlined.RoomPreferences,
                rounded = Icons.Rounded.RoomPreferences,
                sharp = Icons.Sharp.RoomPreferences,
                twoTone = Icons.TwoTone.RoomPreferences
            ),
            IconData(
                name = "RoomService",
                filled = Icons.Filled.RoomService,
                outlined = Icons.Outlined.RoomService,
                rounded = Icons.Rounded.RoomService,
                sharp = Icons.Sharp.RoomService,
                twoTone = Icons.TwoTone.RoomService
            ),
            IconData(
                name = "Rotate90DegreesCcw",
                filled = Icons.Filled.Rotate90DegreesCcw,
                outlined = Icons.Outlined.Rotate90DegreesCcw,
                rounded = Icons.Rounded.Rotate90DegreesCcw,
                sharp = Icons.Sharp.Rotate90DegreesCcw,
                twoTone = Icons.TwoTone.Rotate90DegreesCcw
            ),
            IconData(
                name = "RotateLeft",
                filled = Icons.Filled.RotateLeft,
                outlined = Icons.Outlined.RotateLeft,
                rounded = Icons.Rounded.RotateLeft,
                sharp = Icons.Sharp.RotateLeft,
                twoTone = Icons.TwoTone.RotateLeft
            ),
            IconData(
                name = "RotateRight",
                filled = Icons.Filled.RotateRight,
                outlined = Icons.Outlined.RotateRight,
                rounded = Icons.Rounded.RotateRight,
                sharp = Icons.Sharp.RotateRight,
                twoTone = Icons.TwoTone.RotateRight
            ),
            IconData(
                name = "RoundedCorner",
                filled = Icons.Filled.RoundedCorner,
                outlined = Icons.Outlined.RoundedCorner,
                rounded = Icons.Rounded.RoundedCorner,
                sharp = Icons.Sharp.RoundedCorner,
                twoTone = Icons.TwoTone.RoundedCorner
            ),
            IconData(
                name = "Router",
                filled = Icons.Filled.Router,
                outlined = Icons.Outlined.Router,
                rounded = Icons.Rounded.Router,
                sharp = Icons.Sharp.Router,
                twoTone = Icons.TwoTone.Router
            ),
            IconData(
                name = "Rowing",
                filled = Icons.Filled.Rowing,
                outlined = Icons.Outlined.Rowing,
                rounded = Icons.Rounded.Rowing,
                sharp = Icons.Sharp.Rowing,
                twoTone = Icons.TwoTone.Rowing
            ),
            IconData(
                name = "RssFeed",
                filled = Icons.Filled.RssFeed,
                outlined = Icons.Outlined.RssFeed,
                rounded = Icons.Rounded.RssFeed,
                sharp = Icons.Sharp.RssFeed,
                twoTone = Icons.TwoTone.RssFeed
            ),
            IconData(
                name = "Rule",
                filled = Icons.Filled.Rule,
                outlined = Icons.Outlined.Rule,
                rounded = Icons.Rounded.Rule,
                sharp = Icons.Sharp.Rule,
                twoTone = Icons.TwoTone.Rule
            ),
            IconData(
                name = "RuleFolder",
                filled = Icons.Filled.RuleFolder,
                outlined = Icons.Outlined.RuleFolder,
                rounded = Icons.Rounded.RuleFolder,
                sharp = Icons.Sharp.RuleFolder,
                twoTone = Icons.TwoTone.RuleFolder
            ),
            IconData(
                name = "RunCircle",
                filled = Icons.Filled.RunCircle,
                outlined = Icons.Outlined.RunCircle,
                rounded = Icons.Rounded.RunCircle,
                sharp = Icons.Sharp.RunCircle,
                twoTone = Icons.TwoTone.RunCircle
            ),
            IconData(
                name = "RvHookup",
                filled = Icons.Filled.RvHookup,
                outlined = Icons.Outlined.RvHookup,
                rounded = Icons.Rounded.RvHookup,
                sharp = Icons.Sharp.RvHookup,
                twoTone = Icons.TwoTone.RvHookup
            ),
            IconData(
                name = "Sanitizer",
                filled = Icons.Filled.Sanitizer,
                outlined = Icons.Outlined.Sanitizer,
                rounded = Icons.Rounded.Sanitizer,
                sharp = Icons.Sharp.Sanitizer,
                twoTone = Icons.TwoTone.Sanitizer
            ),
            IconData(
                name = "Satellite",
                filled = Icons.Filled.Satellite,
                outlined = Icons.Outlined.Satellite,
                rounded = Icons.Rounded.Satellite,
                sharp = Icons.Sharp.Satellite,
                twoTone = Icons.TwoTone.Satellite
            ),
            IconData(
                name = "Save",
                filled = Icons.Filled.Save,
                outlined = Icons.Outlined.Save,
                rounded = Icons.Rounded.Save,
                sharp = Icons.Sharp.Save,
                twoTone = Icons.TwoTone.Save
            ),
            IconData(
                name = "SaveAlt",
                filled = Icons.Filled.SaveAlt,
                outlined = Icons.Outlined.SaveAlt,
                rounded = Icons.Rounded.SaveAlt,
                sharp = Icons.Sharp.SaveAlt,
                twoTone = Icons.TwoTone.SaveAlt
            ),
            IconData(
                name = "Scanner",
                filled = Icons.Filled.Scanner,
                outlined = Icons.Outlined.Scanner,
                rounded = Icons.Rounded.Scanner,
                sharp = Icons.Sharp.Scanner,
                twoTone = Icons.TwoTone.Scanner
            ),
            IconData(
                name = "ScatterPlot",
                filled = Icons.Filled.ScatterPlot,
                outlined = Icons.Outlined.ScatterPlot,
                rounded = Icons.Rounded.ScatterPlot,
                sharp = Icons.Sharp.ScatterPlot,
                twoTone = Icons.TwoTone.ScatterPlot
            ),
            IconData(
                name = "Schedule",
                filled = Icons.Filled.Schedule,
                outlined = Icons.Outlined.Schedule,
                rounded = Icons.Rounded.Schedule,
                sharp = Icons.Sharp.Schedule,
                twoTone = Icons.TwoTone.Schedule
            ),
            IconData(
                name = "School",
                filled = Icons.Filled.School,
                outlined = Icons.Outlined.School,
                rounded = Icons.Rounded.School,
                sharp = Icons.Sharp.School,
                twoTone = Icons.TwoTone.School
            ),
            IconData(
                name = "Science",
                filled = Icons.Filled.Science,
                outlined = Icons.Outlined.Science,
                rounded = Icons.Rounded.Science,
                sharp = Icons.Sharp.Science,
                twoTone = Icons.TwoTone.Science
            ),
            IconData(
                name = "Score",
                filled = Icons.Filled.Score,
                outlined = Icons.Outlined.Score,
                rounded = Icons.Rounded.Score,
                sharp = Icons.Sharp.Score,
                twoTone = Icons.TwoTone.Score
            ),
            IconData(
                name = "ScreenLockLandscape",
                filled = Icons.Filled.ScreenLockLandscape,
                outlined = Icons.Outlined.ScreenLockLandscape,
                rounded = Icons.Rounded.ScreenLockLandscape,
                sharp = Icons.Sharp.ScreenLockLandscape,
                twoTone = Icons.TwoTone.ScreenLockLandscape
            ),
            IconData(
                name = "ScreenLockPortrait",
                filled = Icons.Filled.ScreenLockPortrait,
                outlined = Icons.Outlined.ScreenLockPortrait,
                rounded = Icons.Rounded.ScreenLockPortrait,
                sharp = Icons.Sharp.ScreenLockPortrait,
                twoTone = Icons.TwoTone.ScreenLockPortrait
            ),
            IconData(
                name = "ScreenLockRotation",
                filled = Icons.Filled.ScreenLockRotation,
                outlined = Icons.Outlined.ScreenLockRotation,
                rounded = Icons.Rounded.ScreenLockRotation,
                sharp = Icons.Sharp.ScreenLockRotation,
                twoTone = Icons.TwoTone.ScreenLockRotation
            ),
            IconData(
                name = "ScreenRotation",
                filled = Icons.Filled.ScreenRotation,
                outlined = Icons.Outlined.ScreenRotation,
                rounded = Icons.Rounded.ScreenRotation,
                sharp = Icons.Sharp.ScreenRotation,
                twoTone = Icons.TwoTone.ScreenRotation
            ),
            IconData(
                name = "ScreenShare",
                filled = Icons.Filled.ScreenShare,
                outlined = Icons.Outlined.ScreenShare,
                rounded = Icons.Rounded.ScreenShare,
                sharp = Icons.Sharp.ScreenShare,
                twoTone = Icons.TwoTone.ScreenShare
            ),
            IconData(
                name = "SdCard",
                filled = Icons.Filled.SdCard,
                outlined = Icons.Outlined.SdCard,
                rounded = Icons.Rounded.SdCard,
                sharp = Icons.Sharp.SdCard,
                twoTone = Icons.TwoTone.SdCard
            ),
            IconData(
                name = "SdStorage",
                filled = Icons.Filled.SdStorage,
                outlined = Icons.Outlined.SdStorage,
                rounded = Icons.Rounded.SdStorage,
                sharp = Icons.Sharp.SdStorage,
                twoTone = Icons.TwoTone.SdStorage
            ),
            IconData(
                name = "SearchOff",
                filled = Icons.Filled.SearchOff,
                outlined = Icons.Outlined.SearchOff,
                rounded = Icons.Rounded.SearchOff,
                sharp = Icons.Sharp.SearchOff,
                twoTone = Icons.TwoTone.SearchOff
            ),
            IconData(
                name = "Security",
                filled = Icons.Filled.Security,
                outlined = Icons.Outlined.Security,
                rounded = Icons.Rounded.Security,
                sharp = Icons.Sharp.Security,
                twoTone = Icons.TwoTone.Security
            ),
            IconData(
                name = "SelectAll",
                filled = Icons.Filled.SelectAll,
                outlined = Icons.Outlined.SelectAll,
                rounded = Icons.Rounded.SelectAll,
                sharp = Icons.Sharp.SelectAll,
                twoTone = Icons.TwoTone.SelectAll
            ),
            IconData(
                name = "SelfImprovement",
                filled = Icons.Filled.SelfImprovement,
                outlined = Icons.Outlined.SelfImprovement,
                rounded = Icons.Rounded.SelfImprovement,
                sharp = Icons.Sharp.SelfImprovement,
                twoTone = Icons.TwoTone.SelfImprovement
            ),
            IconData(
                name = "SensorDoor",
                filled = Icons.Filled.SensorDoor,
                outlined = Icons.Outlined.SensorDoor,
                rounded = Icons.Rounded.SensorDoor,
                sharp = Icons.Sharp.SensorDoor,
                twoTone = Icons.TwoTone.SensorDoor
            ),
            IconData(
                name = "SensorWindow",
                filled = Icons.Filled.SensorWindow,
                outlined = Icons.Outlined.SensorWindow,
                rounded = Icons.Rounded.SensorWindow,
                sharp = Icons.Sharp.SensorWindow,
                twoTone = Icons.TwoTone.SensorWindow
            ),
            IconData(
                name = "SentimentDissatisfied",
                filled = Icons.Filled.SentimentDissatisfied,
                outlined = Icons.Outlined.SentimentDissatisfied,
                rounded = Icons.Rounded.SentimentDissatisfied,
                sharp = Icons.Sharp.SentimentDissatisfied,
                twoTone = Icons.TwoTone.SentimentDissatisfied
            ),
            IconData(
                name = "SentimentSatisfied",
                filled = Icons.Filled.SentimentSatisfied,
                outlined = Icons.Outlined.SentimentSatisfied,
                rounded = Icons.Rounded.SentimentSatisfied,
                sharp = Icons.Sharp.SentimentSatisfied,
                twoTone = Icons.TwoTone.SentimentSatisfied
            ),
            IconData(
                name = "SentimentSatisfiedAlt",
                filled = Icons.Filled.SentimentSatisfiedAlt,
                outlined = Icons.Outlined.SentimentSatisfiedAlt,
                rounded = Icons.Rounded.SentimentSatisfiedAlt,
                sharp = Icons.Sharp.SentimentSatisfiedAlt,
                twoTone = Icons.TwoTone.SentimentSatisfiedAlt
            ),
            IconData(
                name = "SentimentVeryDissatisfied",
                filled = Icons.Filled.SentimentVeryDissatisfied,
                outlined = Icons.Outlined.SentimentVeryDissatisfied,
                rounded = Icons.Rounded.SentimentVeryDissatisfied,
                sharp = Icons.Sharp.SentimentVeryDissatisfied,
                twoTone = Icons.TwoTone.SentimentVeryDissatisfied
            ),
            IconData(
                name = "SentimentVerySatisfied",
                filled = Icons.Filled.SentimentVerySatisfied,
                outlined = Icons.Outlined.SentimentVerySatisfied,
                rounded = Icons.Rounded.SentimentVerySatisfied,
                sharp = Icons.Sharp.SentimentVerySatisfied,
                twoTone = Icons.TwoTone.SentimentVerySatisfied
            ),
            IconData(
                name = "SetMeal",
                filled = Icons.Filled.SetMeal,
                outlined = Icons.Outlined.SetMeal,
                rounded = Icons.Rounded.SetMeal,
                sharp = Icons.Sharp.SetMeal,
                twoTone = Icons.TwoTone.SetMeal
            ),
            IconData(
                name = "SettingsApplications",
                filled = Icons.Filled.SettingsApplications,
                outlined = Icons.Outlined.SettingsApplications,
                rounded = Icons.Rounded.SettingsApplications,
                sharp = Icons.Sharp.SettingsApplications,
                twoTone = Icons.TwoTone.SettingsApplications
            ),
            IconData(
                name = "SettingsBackupRestore",
                filled = Icons.Filled.SettingsBackupRestore,
                outlined = Icons.Outlined.SettingsBackupRestore,
                rounded = Icons.Rounded.SettingsBackupRestore,
                sharp = Icons.Sharp.SettingsBackupRestore,
                twoTone = Icons.TwoTone.SettingsBackupRestore
            ),
            IconData(
                name = "SettingsBluetooth",
                filled = Icons.Filled.SettingsBluetooth,
                outlined = Icons.Outlined.SettingsBluetooth,
                rounded = Icons.Rounded.SettingsBluetooth,
                sharp = Icons.Sharp.SettingsBluetooth,
                twoTone = Icons.TwoTone.SettingsBluetooth
            ),
            IconData(
                name = "SettingsBrightness",
                filled = Icons.Filled.SettingsBrightness,
                outlined = Icons.Outlined.SettingsBrightness,
                rounded = Icons.Rounded.SettingsBrightness,
                sharp = Icons.Sharp.SettingsBrightness,
                twoTone = Icons.TwoTone.SettingsBrightness
            ),
            IconData(
                name = "SettingsCell",
                filled = Icons.Filled.SettingsCell,
                outlined = Icons.Outlined.SettingsCell,
                rounded = Icons.Rounded.SettingsCell,
                sharp = Icons.Sharp.SettingsCell,
                twoTone = Icons.TwoTone.SettingsCell
            ),
            IconData(
                name = "SettingsEthernet",
                filled = Icons.Filled.SettingsEthernet,
                outlined = Icons.Outlined.SettingsEthernet,
                rounded = Icons.Rounded.SettingsEthernet,
                sharp = Icons.Sharp.SettingsEthernet,
                twoTone = Icons.TwoTone.SettingsEthernet
            ),
            IconData(
                name = "SettingsInputAntenna",
                filled = Icons.Filled.SettingsInputAntenna,
                outlined = Icons.Outlined.SettingsInputAntenna,
                rounded = Icons.Rounded.SettingsInputAntenna,
                sharp = Icons.Sharp.SettingsInputAntenna,
                twoTone = Icons.TwoTone.SettingsInputAntenna
            ),
            IconData(
                name = "SettingsInputComponent",
                filled = Icons.Filled.SettingsInputComponent,
                outlined = Icons.Outlined.SettingsInputComponent,
                rounded = Icons.Rounded.SettingsInputComponent,
                sharp = Icons.Sharp.SettingsInputComponent,
                twoTone = Icons.TwoTone.SettingsInputComponent
            ),
            IconData(
                name = "SettingsInputComposite",
                filled = Icons.Filled.SettingsInputComposite,
                outlined = Icons.Outlined.SettingsInputComposite,
                rounded = Icons.Rounded.SettingsInputComposite,
                sharp = Icons.Sharp.SettingsInputComposite,
                twoTone = Icons.TwoTone.SettingsInputComposite
            ),
            IconData(
                name = "SettingsInputHdmi",
                filled = Icons.Filled.SettingsInputHdmi,
                outlined = Icons.Outlined.SettingsInputHdmi,
                rounded = Icons.Rounded.SettingsInputHdmi,
                sharp = Icons.Sharp.SettingsInputHdmi,
                twoTone = Icons.TwoTone.SettingsInputHdmi
            ),
            IconData(
                name = "SettingsInputSvideo",
                filled = Icons.Filled.SettingsInputSvideo,
                outlined = Icons.Outlined.SettingsInputSvideo,
                rounded = Icons.Rounded.SettingsInputSvideo,
                sharp = Icons.Sharp.SettingsInputSvideo,
                twoTone = Icons.TwoTone.SettingsInputSvideo
            ),
            IconData(
                name = "SettingsOverscan",
                filled = Icons.Filled.SettingsOverscan,
                outlined = Icons.Outlined.SettingsOverscan,
                rounded = Icons.Rounded.SettingsOverscan,
                sharp = Icons.Sharp.SettingsOverscan,
                twoTone = Icons.TwoTone.SettingsOverscan
            ),
            IconData(
                name = "SettingsPhone",
                filled = Icons.Filled.SettingsPhone,
                outlined = Icons.Outlined.SettingsPhone,
                rounded = Icons.Rounded.SettingsPhone,
                sharp = Icons.Sharp.SettingsPhone,
                twoTone = Icons.TwoTone.SettingsPhone
            ),
            IconData(
                name = "SettingsPower",
                filled = Icons.Filled.SettingsPower,
                outlined = Icons.Outlined.SettingsPower,
                rounded = Icons.Rounded.SettingsPower,
                sharp = Icons.Sharp.SettingsPower,
                twoTone = Icons.TwoTone.SettingsPower
            ),
            IconData(
                name = "SettingsRemote",
                filled = Icons.Filled.SettingsRemote,
                outlined = Icons.Outlined.SettingsRemote,
                rounded = Icons.Rounded.SettingsRemote,
                sharp = Icons.Sharp.SettingsRemote,
                twoTone = Icons.TwoTone.SettingsRemote
            ),
            IconData(
                name = "SettingsSystemDaydream",
                filled = Icons.Filled.SettingsSystemDaydream,
                outlined = Icons.Outlined.SettingsSystemDaydream,
                rounded = Icons.Rounded.SettingsSystemDaydream,
                sharp = Icons.Sharp.SettingsSystemDaydream,
                twoTone = Icons.TwoTone.SettingsSystemDaydream
            ),
            IconData(
                name = "SettingsVoice",
                filled = Icons.Filled.SettingsVoice,
                outlined = Icons.Outlined.SettingsVoice,
                rounded = Icons.Rounded.SettingsVoice,
                sharp = Icons.Sharp.SettingsVoice,
                twoTone = Icons.TwoTone.SettingsVoice
            ),
            IconData(
                name = "Shop",
                filled = Icons.Filled.Shop,
                outlined = Icons.Outlined.Shop,
                rounded = Icons.Rounded.Shop,
                sharp = Icons.Sharp.Shop,
                twoTone = Icons.TwoTone.Shop
            ),
            IconData(
                name = "ShopTwo",
                filled = Icons.Filled.ShopTwo,
                outlined = Icons.Outlined.ShopTwo,
                rounded = Icons.Rounded.ShopTwo,
                sharp = Icons.Sharp.ShopTwo,
                twoTone = Icons.TwoTone.ShopTwo
            ),
            IconData(
                name = "ShoppingBag",
                filled = Icons.Filled.ShoppingBag,
                outlined = Icons.Outlined.ShoppingBag,
                rounded = Icons.Rounded.ShoppingBag,
                sharp = Icons.Sharp.ShoppingBag,
                twoTone = Icons.TwoTone.ShoppingBag
            ),
            IconData(
                name = "ShoppingBasket",
                filled = Icons.Filled.ShoppingBasket,
                outlined = Icons.Outlined.ShoppingBasket,
                rounded = Icons.Rounded.ShoppingBasket,
                sharp = Icons.Sharp.ShoppingBasket,
                twoTone = Icons.TwoTone.ShoppingBasket
            ),
            IconData(
                name = "ShortText",
                filled = Icons.Filled.ShortText,
                outlined = Icons.Outlined.ShortText,
                rounded = Icons.Rounded.ShortText,
                sharp = Icons.Sharp.ShortText,
                twoTone = Icons.TwoTone.ShortText
            ),
            IconData(
                name = "ShowChart",
                filled = Icons.Filled.ShowChart,
                outlined = Icons.Outlined.ShowChart,
                rounded = Icons.Rounded.ShowChart,
                sharp = Icons.Sharp.ShowChart,
                twoTone = Icons.TwoTone.ShowChart
            ),
            IconData(
                name = "Shuffle",
                filled = Icons.Filled.Shuffle,
                outlined = Icons.Outlined.Shuffle,
                rounded = Icons.Rounded.Shuffle,
                sharp = Icons.Sharp.Shuffle,
                twoTone = Icons.TwoTone.Shuffle
            ),
            IconData(
                name = "ShutterSpeed",
                filled = Icons.Filled.ShutterSpeed,
                outlined = Icons.Outlined.ShutterSpeed,
                rounded = Icons.Rounded.ShutterSpeed,
                sharp = Icons.Sharp.ShutterSpeed,
                twoTone = Icons.TwoTone.ShutterSpeed
            ),
            IconData(
                name = "Sick",
                filled = Icons.Filled.Sick,
                outlined = Icons.Outlined.Sick,
                rounded = Icons.Rounded.Sick,
                sharp = Icons.Sharp.Sick,
                twoTone = Icons.TwoTone.Sick
            ),
            IconData(
                name = "SignalCellular4Bar",
                filled = Icons.Filled.SignalCellular4Bar,
                outlined = Icons.Outlined.SignalCellular4Bar,
                rounded = Icons.Rounded.SignalCellular4Bar,
                sharp = Icons.Sharp.SignalCellular4Bar,
                twoTone = Icons.TwoTone.SignalCellular4Bar
            ),
            IconData(
                name = "SignalCellularAlt",
                filled = Icons.Filled.SignalCellularAlt,
                outlined = Icons.Outlined.SignalCellularAlt,
                rounded = Icons.Rounded.SignalCellularAlt,
                sharp = Icons.Sharp.SignalCellularAlt,
                twoTone = Icons.TwoTone.SignalCellularAlt
            ),
            IconData(
                name = "SignalCellularConnectedNoInternet4Bar",
                filled = Icons.Filled.SignalCellularConnectedNoInternet4Bar,
                outlined = Icons.Outlined.SignalCellularConnectedNoInternet4Bar,
                rounded = Icons.Rounded.SignalCellularConnectedNoInternet4Bar,
                sharp = Icons.Sharp.SignalCellularConnectedNoInternet4Bar,
                twoTone = Icons.TwoTone.SignalCellularConnectedNoInternet4Bar
            ),
            IconData(
                name = "SignalCellularNoSim",
                filled = Icons.Filled.SignalCellularNoSim,
                outlined = Icons.Outlined.SignalCellularNoSim,
                rounded = Icons.Rounded.SignalCellularNoSim,
                sharp = Icons.Sharp.SignalCellularNoSim,
                twoTone = Icons.TwoTone.SignalCellularNoSim
            ),
            IconData(
                name = "SignalCellularNull",
                filled = Icons.Filled.SignalCellularNull,
                outlined = Icons.Outlined.SignalCellularNull,
                rounded = Icons.Rounded.SignalCellularNull,
                sharp = Icons.Sharp.SignalCellularNull,
                twoTone = Icons.TwoTone.SignalCellularNull
            ),
            IconData(
                name = "SignalCellularOff",
                filled = Icons.Filled.SignalCellularOff,
                outlined = Icons.Outlined.SignalCellularOff,
                rounded = Icons.Rounded.SignalCellularOff,
                sharp = Icons.Sharp.SignalCellularOff,
                twoTone = Icons.TwoTone.SignalCellularOff
            ),
            IconData(
                name = "SignalWifi4Bar",
                filled = Icons.Filled.SignalWifi4Bar,
                outlined = Icons.Outlined.SignalWifi4Bar,
                rounded = Icons.Rounded.SignalWifi4Bar,
                sharp = Icons.Sharp.SignalWifi4Bar,
                twoTone = Icons.TwoTone.SignalWifi4Bar
            ),
            IconData(
                name = "SignalWifi4BarLock",
                filled = Icons.Filled.SignalWifi4BarLock,
                outlined = Icons.Outlined.SignalWifi4BarLock,
                rounded = Icons.Rounded.SignalWifi4BarLock,
                sharp = Icons.Sharp.SignalWifi4BarLock,
                twoTone = Icons.TwoTone.SignalWifi4BarLock
            ),
            IconData(
                name = "SignalWifiOff",
                filled = Icons.Filled.SignalWifiOff,
                outlined = Icons.Outlined.SignalWifiOff,
                rounded = Icons.Rounded.SignalWifiOff,
                sharp = Icons.Sharp.SignalWifiOff,
                twoTone = Icons.TwoTone.SignalWifiOff
            ),
            IconData(
                name = "SimCard",
                filled = Icons.Filled.SimCard,
                outlined = Icons.Outlined.SimCard,
                rounded = Icons.Rounded.SimCard,
                sharp = Icons.Sharp.SimCard,
                twoTone = Icons.TwoTone.SimCard
            ),
            IconData(
                name = "SingleBed",
                filled = Icons.Filled.SingleBed,
                outlined = Icons.Outlined.SingleBed,
                rounded = Icons.Rounded.SingleBed,
                sharp = Icons.Sharp.SingleBed,
                twoTone = Icons.TwoTone.SingleBed
            ),
            IconData(
                name = "SkipNext",
                filled = Icons.Filled.SkipNext,
                outlined = Icons.Outlined.SkipNext,
                rounded = Icons.Rounded.SkipNext,
                sharp = Icons.Sharp.SkipNext,
                twoTone = Icons.TwoTone.SkipNext
            ),
            IconData(
                name = "SkipPrevious",
                filled = Icons.Filled.SkipPrevious,
                outlined = Icons.Outlined.SkipPrevious,
                rounded = Icons.Rounded.SkipPrevious,
                sharp = Icons.Sharp.SkipPrevious,
                twoTone = Icons.TwoTone.SkipPrevious
            ),
            IconData(
                name = "Slideshow",
                filled = Icons.Filled.Slideshow,
                outlined = Icons.Outlined.Slideshow,
                rounded = Icons.Rounded.Slideshow,
                sharp = Icons.Sharp.Slideshow,
                twoTone = Icons.TwoTone.Slideshow
            ),
            IconData(
                name = "SlowMotionVideo",
                filled = Icons.Filled.SlowMotionVideo,
                outlined = Icons.Outlined.SlowMotionVideo,
                rounded = Icons.Rounded.SlowMotionVideo,
                sharp = Icons.Sharp.SlowMotionVideo,
                twoTone = Icons.TwoTone.SlowMotionVideo
            ),
            IconData(
                name = "SmartButton",
                filled = Icons.Filled.SmartButton,
                outlined = Icons.Outlined.SmartButton,
                rounded = Icons.Rounded.SmartButton,
                sharp = Icons.Sharp.SmartButton,
                twoTone = Icons.TwoTone.SmartButton
            ),
            IconData(
                name = "Smartphone",
                filled = Icons.Filled.Smartphone,
                outlined = Icons.Outlined.Smartphone,
                rounded = Icons.Rounded.Smartphone,
                sharp = Icons.Sharp.Smartphone,
                twoTone = Icons.TwoTone.Smartphone
            ),
            IconData(
                name = "SmokeFree",
                filled = Icons.Filled.SmokeFree,
                outlined = Icons.Outlined.SmokeFree,
                rounded = Icons.Rounded.SmokeFree,
                sharp = Icons.Sharp.SmokeFree,
                twoTone = Icons.TwoTone.SmokeFree
            ),
            IconData(
                name = "SmokingRooms",
                filled = Icons.Filled.SmokingRooms,
                outlined = Icons.Outlined.SmokingRooms,
                rounded = Icons.Rounded.SmokingRooms,
                sharp = Icons.Sharp.SmokingRooms,
                twoTone = Icons.TwoTone.SmokingRooms
            ),
            IconData(
                name = "Sms",
                filled = Icons.Filled.Sms,
                outlined = Icons.Outlined.Sms,
                rounded = Icons.Rounded.Sms,
                sharp = Icons.Sharp.Sms,
                twoTone = Icons.TwoTone.Sms
            ),
            IconData(
                name = "SmsFailed",
                filled = Icons.Filled.SmsFailed,
                outlined = Icons.Outlined.SmsFailed,
                rounded = Icons.Rounded.SmsFailed,
                sharp = Icons.Sharp.SmsFailed,
                twoTone = Icons.TwoTone.SmsFailed
            ),
            IconData(
                name = "SnippetFolder",
                filled = Icons.Filled.SnippetFolder,
                outlined = Icons.Outlined.SnippetFolder,
                rounded = Icons.Rounded.SnippetFolder,
                sharp = Icons.Sharp.SnippetFolder,
                twoTone = Icons.TwoTone.SnippetFolder
            ),
            IconData(
                name = "Snooze",
                filled = Icons.Filled.Snooze,
                outlined = Icons.Outlined.Snooze,
                rounded = Icons.Rounded.Snooze,
                sharp = Icons.Sharp.Snooze,
                twoTone = Icons.TwoTone.Snooze
            ),
            IconData(
                name = "Soap",
                filled = Icons.Filled.Soap,
                outlined = Icons.Outlined.Soap,
                rounded = Icons.Rounded.Soap,
                sharp = Icons.Sharp.Soap,
                twoTone = Icons.TwoTone.Soap
            ),
            IconData(
                name = "Sort",
                filled = Icons.Filled.Sort,
                outlined = Icons.Outlined.Sort,
                rounded = Icons.Rounded.Sort,
                sharp = Icons.Sharp.Sort,
                twoTone = Icons.TwoTone.Sort
            ),
            IconData(
                name = "SortByAlpha",
                filled = Icons.Filled.SortByAlpha,
                outlined = Icons.Outlined.SortByAlpha,
                rounded = Icons.Rounded.SortByAlpha,
                sharp = Icons.Sharp.SortByAlpha,
                twoTone = Icons.TwoTone.SortByAlpha
            ),
            IconData(
                name = "Source",
                filled = Icons.Filled.Source,
                outlined = Icons.Outlined.Source,
                rounded = Icons.Rounded.Source,
                sharp = Icons.Sharp.Source,
                twoTone = Icons.TwoTone.Source
            ),
            IconData(
                name = "South",
                filled = Icons.Filled.South,
                outlined = Icons.Outlined.South,
                rounded = Icons.Rounded.South,
                sharp = Icons.Sharp.South,
                twoTone = Icons.TwoTone.South
            ),
            IconData(
                name = "SouthEast",
                filled = Icons.Filled.SouthEast,
                outlined = Icons.Outlined.SouthEast,
                rounded = Icons.Rounded.SouthEast,
                sharp = Icons.Sharp.SouthEast,
                twoTone = Icons.TwoTone.SouthEast
            ),
            IconData(
                name = "SouthWest",
                filled = Icons.Filled.SouthWest,
                outlined = Icons.Outlined.SouthWest,
                rounded = Icons.Rounded.SouthWest,
                sharp = Icons.Sharp.SouthWest,
                twoTone = Icons.TwoTone.SouthWest
            ),
            IconData(
                name = "Spa",
                filled = Icons.Filled.Spa,
                outlined = Icons.Outlined.Spa,
                rounded = Icons.Rounded.Spa,
                sharp = Icons.Sharp.Spa,
                twoTone = Icons.TwoTone.Spa
            ),
            IconData(
                name = "SpaceBar",
                filled = Icons.Filled.SpaceBar,
                outlined = Icons.Outlined.SpaceBar,
                rounded = Icons.Rounded.SpaceBar,
                sharp = Icons.Sharp.SpaceBar,
                twoTone = Icons.TwoTone.SpaceBar
            ),
            IconData(
                name = "Speaker",
                filled = Icons.Filled.Speaker,
                outlined = Icons.Outlined.Speaker,
                rounded = Icons.Rounded.Speaker,
                sharp = Icons.Sharp.Speaker,
                twoTone = Icons.TwoTone.Speaker
            ),
            IconData(
                name = "SpeakerGroup",
                filled = Icons.Filled.SpeakerGroup,
                outlined = Icons.Outlined.SpeakerGroup,
                rounded = Icons.Rounded.SpeakerGroup,
                sharp = Icons.Sharp.SpeakerGroup,
                twoTone = Icons.TwoTone.SpeakerGroup
            ),
            IconData(
                name = "SpeakerNotes",
                filled = Icons.Filled.SpeakerNotes,
                outlined = Icons.Outlined.SpeakerNotes,
                rounded = Icons.Rounded.SpeakerNotes,
                sharp = Icons.Sharp.SpeakerNotes,
                twoTone = Icons.TwoTone.SpeakerNotes
            ),
            IconData(
                name = "SpeakerNotesOff",
                filled = Icons.Filled.SpeakerNotesOff,
                outlined = Icons.Outlined.SpeakerNotesOff,
                rounded = Icons.Rounded.SpeakerNotesOff,
                sharp = Icons.Sharp.SpeakerNotesOff,
                twoTone = Icons.TwoTone.SpeakerNotesOff
            ),
            IconData(
                name = "SpeakerPhone",
                filled = Icons.Filled.SpeakerPhone,
                outlined = Icons.Outlined.SpeakerPhone,
                rounded = Icons.Rounded.SpeakerPhone,
                sharp = Icons.Sharp.SpeakerPhone,
                twoTone = Icons.TwoTone.SpeakerPhone
            ),
            IconData(
                name = "Speed",
                filled = Icons.Filled.Speed,
                outlined = Icons.Outlined.Speed,
                rounded = Icons.Rounded.Speed,
                sharp = Icons.Sharp.Speed,
                twoTone = Icons.TwoTone.Speed
            ),
            IconData(
                name = "Spellcheck",
                filled = Icons.Filled.Spellcheck,
                outlined = Icons.Outlined.Spellcheck,
                rounded = Icons.Rounded.Spellcheck,
                sharp = Icons.Sharp.Spellcheck,
                twoTone = Icons.TwoTone.Spellcheck
            ),
            IconData(
                name = "Sports",
                filled = Icons.Filled.Sports,
                outlined = Icons.Outlined.Sports,
                rounded = Icons.Rounded.Sports,
                sharp = Icons.Sharp.Sports,
                twoTone = Icons.TwoTone.Sports
            ),
            IconData(
                name = "SportsBar",
                filled = Icons.Filled.SportsBar,
                outlined = Icons.Outlined.SportsBar,
                rounded = Icons.Rounded.SportsBar,
                sharp = Icons.Sharp.SportsBar,
                twoTone = Icons.TwoTone.SportsBar
            ),
            IconData(
                name = "SportsBaseball",
                filled = Icons.Filled.SportsBaseball,
                outlined = Icons.Outlined.SportsBaseball,
                rounded = Icons.Rounded.SportsBaseball,
                sharp = Icons.Sharp.SportsBaseball,
                twoTone = Icons.TwoTone.SportsBaseball
            ),
            IconData(
                name = "SportsBasketball",
                filled = Icons.Filled.SportsBasketball,
                outlined = Icons.Outlined.SportsBasketball,
                rounded = Icons.Rounded.SportsBasketball,
                sharp = Icons.Sharp.SportsBasketball,
                twoTone = Icons.TwoTone.SportsBasketball
            ),
            IconData(
                name = "SportsCricket",
                filled = Icons.Filled.SportsCricket,
                outlined = Icons.Outlined.SportsCricket,
                rounded = Icons.Rounded.SportsCricket,
                sharp = Icons.Sharp.SportsCricket,
                twoTone = Icons.TwoTone.SportsCricket
            ),
            IconData(
                name = "SportsEsports",
                filled = Icons.Filled.SportsEsports,
                outlined = Icons.Outlined.SportsEsports,
                rounded = Icons.Rounded.SportsEsports,
                sharp = Icons.Sharp.SportsEsports,
                twoTone = Icons.TwoTone.SportsEsports
            ),
            IconData(
                name = "SportsFootball",
                filled = Icons.Filled.SportsFootball,
                outlined = Icons.Outlined.SportsFootball,
                rounded = Icons.Rounded.SportsFootball,
                sharp = Icons.Sharp.SportsFootball,
                twoTone = Icons.TwoTone.SportsFootball
            ),
            IconData(
                name = "SportsGolf",
                filled = Icons.Filled.SportsGolf,
                outlined = Icons.Outlined.SportsGolf,
                rounded = Icons.Rounded.SportsGolf,
                sharp = Icons.Sharp.SportsGolf,
                twoTone = Icons.TwoTone.SportsGolf
            ),
            IconData(
                name = "SportsHandball",
                filled = Icons.Filled.SportsHandball,
                outlined = Icons.Outlined.SportsHandball,
                rounded = Icons.Rounded.SportsHandball,
                sharp = Icons.Sharp.SportsHandball,
                twoTone = Icons.TwoTone.SportsHandball
            ),
            IconData(
                name = "SportsHockey",
                filled = Icons.Filled.SportsHockey,
                outlined = Icons.Outlined.SportsHockey,
                rounded = Icons.Rounded.SportsHockey,
                sharp = Icons.Sharp.SportsHockey,
                twoTone = Icons.TwoTone.SportsHockey
            ),
            IconData(
                name = "SportsKabaddi",
                filled = Icons.Filled.SportsKabaddi,
                outlined = Icons.Outlined.SportsKabaddi,
                rounded = Icons.Rounded.SportsKabaddi,
                sharp = Icons.Sharp.SportsKabaddi,
                twoTone = Icons.TwoTone.SportsKabaddi
            ),
            IconData(
                name = "SportsMma",
                filled = Icons.Filled.SportsMma,
                outlined = Icons.Outlined.SportsMma,
                rounded = Icons.Rounded.SportsMma,
                sharp = Icons.Sharp.SportsMma,
                twoTone = Icons.TwoTone.SportsMma
            ),
            IconData(
                name = "SportsMotorsports",
                filled = Icons.Filled.SportsMotorsports,
                outlined = Icons.Outlined.SportsMotorsports,
                rounded = Icons.Rounded.SportsMotorsports,
                sharp = Icons.Sharp.SportsMotorsports,
                twoTone = Icons.TwoTone.SportsMotorsports
            ),
            IconData(
                name = "SportsRugby",
                filled = Icons.Filled.SportsRugby,
                outlined = Icons.Outlined.SportsRugby,
                rounded = Icons.Rounded.SportsRugby,
                sharp = Icons.Sharp.SportsRugby,
                twoTone = Icons.TwoTone.SportsRugby
            ),
            IconData(
                name = "SportsSoccer",
                filled = Icons.Filled.SportsSoccer,
                outlined = Icons.Outlined.SportsSoccer,
                rounded = Icons.Rounded.SportsSoccer,
                sharp = Icons.Sharp.SportsSoccer,
                twoTone = Icons.TwoTone.SportsSoccer
            ),
            IconData(
                name = "SportsTennis",
                filled = Icons.Filled.SportsTennis,
                outlined = Icons.Outlined.SportsTennis,
                rounded = Icons.Rounded.SportsTennis,
                sharp = Icons.Sharp.SportsTennis,
                twoTone = Icons.TwoTone.SportsTennis
            ),
            IconData(
                name = "SportsVolleyball",
                filled = Icons.Filled.SportsVolleyball,
                outlined = Icons.Outlined.SportsVolleyball,
                rounded = Icons.Rounded.SportsVolleyball,
                sharp = Icons.Sharp.SportsVolleyball,
                twoTone = Icons.TwoTone.SportsVolleyball
            ),
            IconData(
                name = "SquareFoot",
                filled = Icons.Filled.SquareFoot,
                outlined = Icons.Outlined.SquareFoot,
                rounded = Icons.Rounded.SquareFoot,
                sharp = Icons.Sharp.SquareFoot,
                twoTone = Icons.TwoTone.SquareFoot
            ),
            IconData(
                name = "StackedLineChart",
                filled = Icons.Filled.StackedLineChart,
                outlined = Icons.Outlined.StackedLineChart,
                rounded = Icons.Rounded.StackedLineChart,
                sharp = Icons.Sharp.StackedLineChart,
                twoTone = Icons.TwoTone.StackedLineChart
            ),
            IconData(
                name = "Stairs",
                filled = Icons.Filled.Stairs,
                outlined = Icons.Outlined.Stairs,
                rounded = Icons.Rounded.Stairs,
                sharp = Icons.Sharp.Stairs,
                twoTone = Icons.TwoTone.Stairs
            ),
            IconData(
                name = "StarBorder",
                filled = Icons.Filled.StarBorder,
                outlined = Icons.Outlined.StarBorder,
                rounded = Icons.Rounded.StarBorder,
                sharp = Icons.Sharp.StarBorder,
                twoTone = Icons.TwoTone.StarBorder
            ),
            IconData(
                name = "StarHalf",
                filled = Icons.Filled.StarHalf,
                outlined = Icons.Outlined.StarHalf,
                rounded = Icons.Rounded.StarHalf,
                sharp = Icons.Sharp.StarHalf,
                twoTone = Icons.TwoTone.StarHalf
            ),
            IconData(
                name = "StarOutline",
                filled = Icons.Filled.StarOutline,
                outlined = Icons.Outlined.StarOutline,
                rounded = Icons.Rounded.StarOutline,
                sharp = Icons.Sharp.StarOutline,
                twoTone = Icons.TwoTone.StarOutline
            ),
            IconData(
                name = "StarRate",
                filled = Icons.Filled.StarRate,
                outlined = Icons.Outlined.StarRate,
                rounded = Icons.Rounded.StarRate,
                sharp = Icons.Sharp.StarRate,
                twoTone = Icons.TwoTone.StarRate
            ),
            IconData(
                name = "Stars",
                filled = Icons.Filled.Stars,
                outlined = Icons.Outlined.Stars,
                rounded = Icons.Rounded.Stars,
                sharp = Icons.Sharp.Stars,
                twoTone = Icons.TwoTone.Stars
            ),
            IconData(
                name = "StayCurrentLandscape",
                filled = Icons.Filled.StayCurrentLandscape,
                outlined = Icons.Outlined.StayCurrentLandscape,
                rounded = Icons.Rounded.StayCurrentLandscape,
                sharp = Icons.Sharp.StayCurrentLandscape,
                twoTone = Icons.TwoTone.StayCurrentLandscape
            ),
            IconData(
                name = "StayCurrentPortrait",
                filled = Icons.Filled.StayCurrentPortrait,
                outlined = Icons.Outlined.StayCurrentPortrait,
                rounded = Icons.Rounded.StayCurrentPortrait,
                sharp = Icons.Sharp.StayCurrentPortrait,
                twoTone = Icons.TwoTone.StayCurrentPortrait
            ),
            IconData(
                name = "StayPrimaryLandscape",
                filled = Icons.Filled.StayPrimaryLandscape,
                outlined = Icons.Outlined.StayPrimaryLandscape,
                rounded = Icons.Rounded.StayPrimaryLandscape,
                sharp = Icons.Sharp.StayPrimaryLandscape,
                twoTone = Icons.TwoTone.StayPrimaryLandscape
            ),
            IconData(
                name = "StayPrimaryPortrait",
                filled = Icons.Filled.StayPrimaryPortrait,
                outlined = Icons.Outlined.StayPrimaryPortrait,
                rounded = Icons.Rounded.StayPrimaryPortrait,
                sharp = Icons.Sharp.StayPrimaryPortrait,
                twoTone = Icons.TwoTone.StayPrimaryPortrait
            ),
            IconData(
                name = "StickyNote2",
                filled = Icons.Filled.StickyNote2,
                outlined = Icons.Outlined.StickyNote2,
                rounded = Icons.Rounded.StickyNote2,
                sharp = Icons.Sharp.StickyNote2,
                twoTone = Icons.TwoTone.StickyNote2
            ),
            IconData(
                name = "Stop",
                filled = Icons.Filled.Stop,
                outlined = Icons.Outlined.Stop,
                rounded = Icons.Rounded.Stop,
                sharp = Icons.Sharp.Stop,
                twoTone = Icons.TwoTone.Stop
            ),
            IconData(
                name = "StopCircle",
                filled = Icons.Filled.StopCircle,
                outlined = Icons.Outlined.StopCircle,
                rounded = Icons.Rounded.StopCircle,
                sharp = Icons.Sharp.StopCircle,
                twoTone = Icons.TwoTone.StopCircle
            ),
            IconData(
                name = "StopScreenShare",
                filled = Icons.Filled.StopScreenShare,
                outlined = Icons.Outlined.StopScreenShare,
                rounded = Icons.Rounded.StopScreenShare,
                sharp = Icons.Sharp.StopScreenShare,
                twoTone = Icons.TwoTone.StopScreenShare
            ),
            IconData(
                name = "Storage",
                filled = Icons.Filled.Storage,
                outlined = Icons.Outlined.Storage,
                rounded = Icons.Rounded.Storage,
                sharp = Icons.Sharp.Storage,
                twoTone = Icons.TwoTone.Storage
            ),
            IconData(
                name = "Store",
                filled = Icons.Filled.Store,
                outlined = Icons.Outlined.Store,
                rounded = Icons.Rounded.Store,
                sharp = Icons.Sharp.Store,
                twoTone = Icons.TwoTone.Store
            ),
            IconData(
                name = "StoreMallDirectory",
                filled = Icons.Filled.StoreMallDirectory,
                outlined = Icons.Outlined.StoreMallDirectory,
                rounded = Icons.Rounded.StoreMallDirectory,
                sharp = Icons.Sharp.StoreMallDirectory,
                twoTone = Icons.TwoTone.StoreMallDirectory
            ),
            IconData(
                name = "Storefront",
                filled = Icons.Filled.Storefront,
                outlined = Icons.Outlined.Storefront,
                rounded = Icons.Rounded.Storefront,
                sharp = Icons.Sharp.Storefront,
                twoTone = Icons.TwoTone.Storefront
            ),
            IconData(
                name = "Straighten",
                filled = Icons.Filled.Straighten,
                outlined = Icons.Outlined.Straighten,
                rounded = Icons.Rounded.Straighten,
                sharp = Icons.Sharp.Straighten,
                twoTone = Icons.TwoTone.Straighten
            ),
            IconData(
                name = "Streetview",
                filled = Icons.Filled.Streetview,
                outlined = Icons.Outlined.Streetview,
                rounded = Icons.Rounded.Streetview,
                sharp = Icons.Sharp.Streetview,
                twoTone = Icons.TwoTone.Streetview
            ),
            IconData(
                name = "StrikethroughS",
                filled = Icons.Filled.StrikethroughS,
                outlined = Icons.Outlined.StrikethroughS,
                rounded = Icons.Rounded.StrikethroughS,
                sharp = Icons.Sharp.StrikethroughS,
                twoTone = Icons.TwoTone.StrikethroughS
            ),
            IconData(
                name = "Stroller",
                filled = Icons.Filled.Stroller,
                outlined = Icons.Outlined.Stroller,
                rounded = Icons.Rounded.Stroller,
                sharp = Icons.Sharp.Stroller,
                twoTone = Icons.TwoTone.Stroller
            ),
            IconData(
                name = "Style",
                filled = Icons.Filled.Style,
                outlined = Icons.Outlined.Style,
                rounded = Icons.Rounded.Style,
                sharp = Icons.Sharp.Style,
                twoTone = Icons.TwoTone.Style
            ),
            IconData(
                name = "SubdirectoryArrowLeft",
                filled = Icons.Filled.SubdirectoryArrowLeft,
                outlined = Icons.Outlined.SubdirectoryArrowLeft,
                rounded = Icons.Rounded.SubdirectoryArrowLeft,
                sharp = Icons.Sharp.SubdirectoryArrowLeft,
                twoTone = Icons.TwoTone.SubdirectoryArrowLeft
            ),
            IconData(
                name = "SubdirectoryArrowRight",
                filled = Icons.Filled.SubdirectoryArrowRight,
                outlined = Icons.Outlined.SubdirectoryArrowRight,
                rounded = Icons.Rounded.SubdirectoryArrowRight,
                sharp = Icons.Sharp.SubdirectoryArrowRight,
                twoTone = Icons.TwoTone.SubdirectoryArrowRight
            ),
            IconData(
                name = "Subject",
                filled = Icons.Filled.Subject,
                outlined = Icons.Outlined.Subject,
                rounded = Icons.Rounded.Subject,
                sharp = Icons.Sharp.Subject,
                twoTone = Icons.TwoTone.Subject
            ),
            IconData(
                name = "Subscript",
                filled = Icons.Filled.Subscript,
                outlined = Icons.Outlined.Subscript,
                rounded = Icons.Rounded.Subscript,
                sharp = Icons.Sharp.Subscript,
                twoTone = Icons.TwoTone.Subscript
            ),
            IconData(
                name = "Subscriptions",
                filled = Icons.Filled.Subscriptions,
                outlined = Icons.Outlined.Subscriptions,
                rounded = Icons.Rounded.Subscriptions,
                sharp = Icons.Sharp.Subscriptions,
                twoTone = Icons.TwoTone.Subscriptions
            ),
            IconData(
                name = "Subtitles",
                filled = Icons.Filled.Subtitles,
                outlined = Icons.Outlined.Subtitles,
                rounded = Icons.Rounded.Subtitles,
                sharp = Icons.Sharp.Subtitles,
                twoTone = Icons.TwoTone.Subtitles
            ),
            IconData(
                name = "SubtitlesOff",
                filled = Icons.Filled.SubtitlesOff,
                outlined = Icons.Outlined.SubtitlesOff,
                rounded = Icons.Rounded.SubtitlesOff,
                sharp = Icons.Sharp.SubtitlesOff,
                twoTone = Icons.TwoTone.SubtitlesOff
            ),
            IconData(
                name = "Subway",
                filled = Icons.Filled.Subway,
                outlined = Icons.Outlined.Subway,
                rounded = Icons.Rounded.Subway,
                sharp = Icons.Sharp.Subway,
                twoTone = Icons.TwoTone.Subway
            ),
            IconData(
                name = "Superscript",
                filled = Icons.Filled.Superscript,
                outlined = Icons.Outlined.Superscript,
                rounded = Icons.Rounded.Superscript,
                sharp = Icons.Sharp.Superscript,
                twoTone = Icons.TwoTone.Superscript
            ),
            IconData(
                name = "SupervisedUserCircle",
                filled = Icons.Filled.SupervisedUserCircle,
                outlined = Icons.Outlined.SupervisedUserCircle,
                rounded = Icons.Rounded.SupervisedUserCircle,
                sharp = Icons.Sharp.SupervisedUserCircle,
                twoTone = Icons.TwoTone.SupervisedUserCircle
            ),
            IconData(
                name = "SupervisorAccount",
                filled = Icons.Filled.SupervisorAccount,
                outlined = Icons.Outlined.SupervisorAccount,
                rounded = Icons.Rounded.SupervisorAccount,
                sharp = Icons.Sharp.SupervisorAccount,
                twoTone = Icons.TwoTone.SupervisorAccount
            ),
            IconData(
                name = "Support",
                filled = Icons.Filled.Support,
                outlined = Icons.Outlined.Support,
                rounded = Icons.Rounded.Support,
                sharp = Icons.Sharp.Support,
                twoTone = Icons.TwoTone.Support
            ),
            IconData(
                name = "SupportAgent",
                filled = Icons.Filled.SupportAgent,
                outlined = Icons.Outlined.SupportAgent,
                rounded = Icons.Rounded.SupportAgent,
                sharp = Icons.Sharp.SupportAgent,
                twoTone = Icons.TwoTone.SupportAgent
            ),
            IconData(
                name = "SurroundSound",
                filled = Icons.Filled.SurroundSound,
                outlined = Icons.Outlined.SurroundSound,
                rounded = Icons.Rounded.SurroundSound,
                sharp = Icons.Sharp.SurroundSound,
                twoTone = Icons.TwoTone.SurroundSound
            ),
            IconData(
                name = "SwapCalls",
                filled = Icons.Filled.SwapCalls,
                outlined = Icons.Outlined.SwapCalls,
                rounded = Icons.Rounded.SwapCalls,
                sharp = Icons.Sharp.SwapCalls,
                twoTone = Icons.TwoTone.SwapCalls
            ),
            IconData(
                name = "SwapHoriz",
                filled = Icons.Filled.SwapHoriz,
                outlined = Icons.Outlined.SwapHoriz,
                rounded = Icons.Rounded.SwapHoriz,
                sharp = Icons.Sharp.SwapHoriz,
                twoTone = Icons.TwoTone.SwapHoriz
            ),
            IconData(
                name = "SwapHorizontalCircle",
                filled = Icons.Filled.SwapHorizontalCircle,
                outlined = Icons.Outlined.SwapHorizontalCircle,
                rounded = Icons.Rounded.SwapHorizontalCircle,
                sharp = Icons.Sharp.SwapHorizontalCircle,
                twoTone = Icons.TwoTone.SwapHorizontalCircle
            ),
            IconData(
                name = "SwapVert",
                filled = Icons.Filled.SwapVert,
                outlined = Icons.Outlined.SwapVert,
                rounded = Icons.Rounded.SwapVert,
                sharp = Icons.Sharp.SwapVert,
                twoTone = Icons.TwoTone.SwapVert
            ),
            IconData(
                name = "SwapVerticalCircle",
                filled = Icons.Filled.SwapVerticalCircle,
                outlined = Icons.Outlined.SwapVerticalCircle,
                rounded = Icons.Rounded.SwapVerticalCircle,
                sharp = Icons.Sharp.SwapVerticalCircle,
                twoTone = Icons.TwoTone.SwapVerticalCircle
            ),
            IconData(
                name = "SwitchCamera",
                filled = Icons.Filled.SwitchCamera,
                outlined = Icons.Outlined.SwitchCamera,
                rounded = Icons.Rounded.SwitchCamera,
                sharp = Icons.Sharp.SwitchCamera,
                twoTone = Icons.TwoTone.SwitchCamera
            ),
            IconData(
                name = "SwitchLeft",
                filled = Icons.Filled.SwitchLeft,
                outlined = Icons.Outlined.SwitchLeft,
                rounded = Icons.Rounded.SwitchLeft,
                sharp = Icons.Sharp.SwitchLeft,
                twoTone = Icons.TwoTone.SwitchLeft
            ),
            IconData(
                name = "SwitchRight",
                filled = Icons.Filled.SwitchRight,
                outlined = Icons.Outlined.SwitchRight,
                rounded = Icons.Rounded.SwitchRight,
                sharp = Icons.Sharp.SwitchRight,
                twoTone = Icons.TwoTone.SwitchRight
            ),
            IconData(
                name = "SwitchVideo",
                filled = Icons.Filled.SwitchVideo,
                outlined = Icons.Outlined.SwitchVideo,
                rounded = Icons.Rounded.SwitchVideo,
                sharp = Icons.Sharp.SwitchVideo,
                twoTone = Icons.TwoTone.SwitchVideo
            ),
            IconData(
                name = "Sync",
                filled = Icons.Filled.Sync,
                outlined = Icons.Outlined.Sync,
                rounded = Icons.Rounded.Sync,
                sharp = Icons.Sharp.Sync,
                twoTone = Icons.TwoTone.Sync
            ),
            IconData(
                name = "SyncAlt",
                filled = Icons.Filled.SyncAlt,
                outlined = Icons.Outlined.SyncAlt,
                rounded = Icons.Rounded.SyncAlt,
                sharp = Icons.Sharp.SyncAlt,
                twoTone = Icons.TwoTone.SyncAlt
            ),
            IconData(
                name = "SyncDisabled",
                filled = Icons.Filled.SyncDisabled,
                outlined = Icons.Outlined.SyncDisabled,
                rounded = Icons.Rounded.SyncDisabled,
                sharp = Icons.Sharp.SyncDisabled,
                twoTone = Icons.TwoTone.SyncDisabled
            ),
            IconData(
                name = "SyncProblem",
                filled = Icons.Filled.SyncProblem,
                outlined = Icons.Outlined.SyncProblem,
                rounded = Icons.Rounded.SyncProblem,
                sharp = Icons.Sharp.SyncProblem,
                twoTone = Icons.TwoTone.SyncProblem
            ),
            IconData(
                name = "SystemUpdate",
                filled = Icons.Filled.SystemUpdate,
                outlined = Icons.Outlined.SystemUpdate,
                rounded = Icons.Rounded.SystemUpdate,
                sharp = Icons.Sharp.SystemUpdate,
                twoTone = Icons.TwoTone.SystemUpdate
            ),
            IconData(
                name = "SystemUpdateAlt",
                filled = Icons.Filled.SystemUpdateAlt,
                outlined = Icons.Outlined.SystemUpdateAlt,
                rounded = Icons.Rounded.SystemUpdateAlt,
                sharp = Icons.Sharp.SystemUpdateAlt,
                twoTone = Icons.TwoTone.SystemUpdateAlt
            ),
            IconData(
                name = "Tab",
                filled = Icons.Filled.Tab,
                outlined = Icons.Outlined.Tab,
                rounded = Icons.Rounded.Tab,
                sharp = Icons.Sharp.Tab,
                twoTone = Icons.TwoTone.Tab
            ),
            IconData(
                name = "TabUnselected",
                filled = Icons.Filled.TabUnselected,
                outlined = Icons.Outlined.TabUnselected,
                rounded = Icons.Rounded.TabUnselected,
                sharp = Icons.Sharp.TabUnselected,
                twoTone = Icons.TwoTone.TabUnselected
            ),
            IconData(
                name = "TableChart",
                filled = Icons.Filled.TableChart,
                outlined = Icons.Outlined.TableChart,
                rounded = Icons.Rounded.TableChart,
                sharp = Icons.Sharp.TableChart,
                twoTone = Icons.TwoTone.TableChart
            ),
            IconData(
                name = "TableRows",
                filled = Icons.Filled.TableRows,
                outlined = Icons.Outlined.TableRows,
                rounded = Icons.Rounded.TableRows,
                sharp = Icons.Sharp.TableRows,
                twoTone = Icons.TwoTone.TableRows
            ),
            IconData(
                name = "TableView",
                filled = Icons.Filled.TableView,
                outlined = Icons.Outlined.TableView,
                rounded = Icons.Rounded.TableView,
                sharp = Icons.Sharp.TableView,
                twoTone = Icons.TwoTone.TableView
            ),
            IconData(
                name = "Tablet",
                filled = Icons.Filled.Tablet,
                outlined = Icons.Outlined.Tablet,
                rounded = Icons.Rounded.Tablet,
                sharp = Icons.Sharp.Tablet,
                twoTone = Icons.TwoTone.Tablet
            ),
            IconData(
                name = "TabletAndroid",
                filled = Icons.Filled.TabletAndroid,
                outlined = Icons.Outlined.TabletAndroid,
                rounded = Icons.Rounded.TabletAndroid,
                sharp = Icons.Sharp.TabletAndroid,
                twoTone = Icons.TwoTone.TabletAndroid
            ),
            IconData(
                name = "TabletMac",
                filled = Icons.Filled.TabletMac,
                outlined = Icons.Outlined.TabletMac,
                rounded = Icons.Rounded.TabletMac,
                sharp = Icons.Sharp.TabletMac,
                twoTone = Icons.TwoTone.TabletMac
            ),
            IconData(
                name = "TagFaces",
                filled = Icons.Filled.TagFaces,
                outlined = Icons.Outlined.TagFaces,
                rounded = Icons.Rounded.TagFaces,
                sharp = Icons.Sharp.TagFaces,
                twoTone = Icons.TwoTone.TagFaces
            ),
            IconData(
                name = "TapAndPlay",
                filled = Icons.Filled.TapAndPlay,
                outlined = Icons.Outlined.TapAndPlay,
                rounded = Icons.Rounded.TapAndPlay,
                sharp = Icons.Sharp.TapAndPlay,
                twoTone = Icons.TwoTone.TapAndPlay
            ),
            IconData(
                name = "Tapas",
                filled = Icons.Filled.Tapas,
                outlined = Icons.Outlined.Tapas,
                rounded = Icons.Rounded.Tapas,
                sharp = Icons.Sharp.Tapas,
                twoTone = Icons.TwoTone.Tapas
            ),
            IconData(
                name = "Terrain",
                filled = Icons.Filled.Terrain,
                outlined = Icons.Outlined.Terrain,
                rounded = Icons.Rounded.Terrain,
                sharp = Icons.Sharp.Terrain,
                twoTone = Icons.TwoTone.Terrain
            ),
            IconData(
                name = "TextFields",
                filled = Icons.Filled.TextFields,
                outlined = Icons.Outlined.TextFields,
                rounded = Icons.Rounded.TextFields,
                sharp = Icons.Sharp.TextFields,
                twoTone = Icons.TwoTone.TextFields
            ),
            IconData(
                name = "TextFormat",
                filled = Icons.Filled.TextFormat,
                outlined = Icons.Outlined.TextFormat,
                rounded = Icons.Rounded.TextFormat,
                sharp = Icons.Sharp.TextFormat,
                twoTone = Icons.TwoTone.TextFormat
            ),
            IconData(
                name = "TextRotateUp",
                filled = Icons.Filled.TextRotateUp,
                outlined = Icons.Outlined.TextRotateUp,
                rounded = Icons.Rounded.TextRotateUp,
                sharp = Icons.Sharp.TextRotateUp,
                twoTone = Icons.TwoTone.TextRotateUp
            ),
            IconData(
                name = "TextRotateVertical",
                filled = Icons.Filled.TextRotateVertical,
                outlined = Icons.Outlined.TextRotateVertical,
                rounded = Icons.Rounded.TextRotateVertical,
                sharp = Icons.Sharp.TextRotateVertical,
                twoTone = Icons.TwoTone.TextRotateVertical
            ),
            IconData(
                name = "TextRotationAngledown",
                filled = Icons.Filled.TextRotationAngledown,
                outlined = Icons.Outlined.TextRotationAngledown,
                rounded = Icons.Rounded.TextRotationAngledown,
                sharp = Icons.Sharp.TextRotationAngledown,
                twoTone = Icons.TwoTone.TextRotationAngledown
            ),
            IconData(
                name = "TextRotationAngleup",
                filled = Icons.Filled.TextRotationAngleup,
                outlined = Icons.Outlined.TextRotationAngleup,
                rounded = Icons.Rounded.TextRotationAngleup,
                sharp = Icons.Sharp.TextRotationAngleup,
                twoTone = Icons.TwoTone.TextRotationAngleup
            ),
            IconData(
                name = "TextRotationDown",
                filled = Icons.Filled.TextRotationDown,
                outlined = Icons.Outlined.TextRotationDown,
                rounded = Icons.Rounded.TextRotationDown,
                sharp = Icons.Sharp.TextRotationDown,
                twoTone = Icons.TwoTone.TextRotationDown
            ),
            IconData(
                name = "TextRotationNone",
                filled = Icons.Filled.TextRotationNone,
                outlined = Icons.Outlined.TextRotationNone,
                rounded = Icons.Rounded.TextRotationNone,
                sharp = Icons.Sharp.TextRotationNone,
                twoTone = Icons.TwoTone.TextRotationNone
            ),
            IconData(
                name = "TextSnippet",
                filled = Icons.Filled.TextSnippet,
                outlined = Icons.Outlined.TextSnippet,
                rounded = Icons.Rounded.TextSnippet,
                sharp = Icons.Sharp.TextSnippet,
                twoTone = Icons.TwoTone.TextSnippet
            ),
            IconData(
                name = "Textsms",
                filled = Icons.Filled.Textsms,
                outlined = Icons.Outlined.Textsms,
                rounded = Icons.Rounded.Textsms,
                sharp = Icons.Sharp.Textsms,
                twoTone = Icons.TwoTone.Textsms
            ),
            IconData(
                name = "Texture",
                filled = Icons.Filled.Texture,
                outlined = Icons.Outlined.Texture,
                rounded = Icons.Rounded.Texture,
                sharp = Icons.Sharp.Texture,
                twoTone = Icons.TwoTone.Texture
            ),
            IconData(
                name = "Theaters",
                filled = Icons.Filled.Theaters,
                outlined = Icons.Outlined.Theaters,
                rounded = Icons.Rounded.Theaters,
                sharp = Icons.Sharp.Theaters,
                twoTone = Icons.TwoTone.Theaters
            ),
            IconData(
                name = "ThumbDown",
                filled = Icons.Filled.ThumbDown,
                outlined = Icons.Outlined.ThumbDown,
                rounded = Icons.Rounded.ThumbDown,
                sharp = Icons.Sharp.ThumbDown,
                twoTone = Icons.TwoTone.ThumbDown
            ),
            IconData(
                name = "ThumbDownAlt",
                filled = Icons.Filled.ThumbDownAlt,
                outlined = Icons.Outlined.ThumbDownAlt,
                rounded = Icons.Rounded.ThumbDownAlt,
                sharp = Icons.Sharp.ThumbDownAlt,
                twoTone = Icons.TwoTone.ThumbDownAlt
            ),
            IconData(
                name = "ThumbUpAlt",
                filled = Icons.Filled.ThumbUpAlt,
                outlined = Icons.Outlined.ThumbUpAlt,
                rounded = Icons.Rounded.ThumbUpAlt,
                sharp = Icons.Sharp.ThumbUpAlt,
                twoTone = Icons.TwoTone.ThumbUpAlt
            ),
            IconData(
                name = "ThumbsUpDown",
                filled = Icons.Filled.ThumbsUpDown,
                outlined = Icons.Outlined.ThumbsUpDown,
                rounded = Icons.Rounded.ThumbsUpDown,
                sharp = Icons.Sharp.ThumbsUpDown,
                twoTone = Icons.TwoTone.ThumbsUpDown
            ),
            IconData(
                name = "TimeToLeave",
                filled = Icons.Filled.TimeToLeave,
                outlined = Icons.Outlined.TimeToLeave,
                rounded = Icons.Rounded.TimeToLeave,
                sharp = Icons.Sharp.TimeToLeave,
                twoTone = Icons.TwoTone.TimeToLeave
            ),
            IconData(
                name = "Timelapse",
                filled = Icons.Filled.Timelapse,
                outlined = Icons.Outlined.Timelapse,
                rounded = Icons.Rounded.Timelapse,
                sharp = Icons.Sharp.Timelapse,
                twoTone = Icons.TwoTone.Timelapse
            ),
            IconData(
                name = "Timeline",
                filled = Icons.Filled.Timeline,
                outlined = Icons.Outlined.Timeline,
                rounded = Icons.Rounded.Timeline,
                sharp = Icons.Sharp.Timeline,
                twoTone = Icons.TwoTone.Timeline
            ),
            IconData(
                name = "Timer",
                filled = Icons.Filled.Timer,
                outlined = Icons.Outlined.Timer,
                rounded = Icons.Rounded.Timer,
                sharp = Icons.Sharp.Timer,
                twoTone = Icons.TwoTone.Timer
            ),
            IconData(
                name = "Timer10",
                filled = Icons.Filled.Timer10,
                outlined = Icons.Outlined.Timer10,
                rounded = Icons.Rounded.Timer10,
                sharp = Icons.Sharp.Timer10,
                twoTone = Icons.TwoTone.Timer10
            ),
            IconData(
                name = "Timer3",
                filled = Icons.Filled.Timer3,
                outlined = Icons.Outlined.Timer3,
                rounded = Icons.Rounded.Timer3,
                sharp = Icons.Sharp.Timer3,
                twoTone = Icons.TwoTone.Timer3
            ),
            IconData(
                name = "TimerOff",
                filled = Icons.Filled.TimerOff,
                outlined = Icons.Outlined.TimerOff,
                rounded = Icons.Rounded.TimerOff,
                sharp = Icons.Sharp.TimerOff,
                twoTone = Icons.TwoTone.TimerOff
            ),
            IconData(
                name = "Title",
                filled = Icons.Filled.Title,
                outlined = Icons.Outlined.Title,
                rounded = Icons.Rounded.Title,
                sharp = Icons.Sharp.Title,
                twoTone = Icons.TwoTone.Title
            ),
            IconData(
                name = "Toc",
                filled = Icons.Filled.Toc,
                outlined = Icons.Outlined.Toc,
                rounded = Icons.Rounded.Toc,
                sharp = Icons.Sharp.Toc,
                twoTone = Icons.TwoTone.Toc
            ),
            IconData(
                name = "Today",
                filled = Icons.Filled.Today,
                outlined = Icons.Outlined.Today,
                rounded = Icons.Rounded.Today,
                sharp = Icons.Sharp.Today,
                twoTone = Icons.TwoTone.Today
            ),
            IconData(
                name = "ToggleOff",
                filled = Icons.Filled.ToggleOff,
                outlined = Icons.Outlined.ToggleOff,
                rounded = Icons.Rounded.ToggleOff,
                sharp = Icons.Sharp.ToggleOff,
                twoTone = Icons.TwoTone.ToggleOff
            ),
            IconData(
                name = "ToggleOn",
                filled = Icons.Filled.ToggleOn,
                outlined = Icons.Outlined.ToggleOn,
                rounded = Icons.Rounded.ToggleOn,
                sharp = Icons.Sharp.ToggleOn,
                twoTone = Icons.TwoTone.ToggleOn
            ),
            IconData(
                name = "Toll",
                filled = Icons.Filled.Toll,
                outlined = Icons.Outlined.Toll,
                rounded = Icons.Rounded.Toll,
                sharp = Icons.Sharp.Toll,
                twoTone = Icons.TwoTone.Toll
            ),
            IconData(
                name = "Tonality",
                filled = Icons.Filled.Tonality,
                outlined = Icons.Outlined.Tonality,
                rounded = Icons.Rounded.Tonality,
                sharp = Icons.Sharp.Tonality,
                twoTone = Icons.TwoTone.Tonality
            ),
            IconData(
                name = "Topic",
                filled = Icons.Filled.Topic,
                outlined = Icons.Outlined.Topic,
                rounded = Icons.Rounded.Topic,
                sharp = Icons.Sharp.Topic,
                twoTone = Icons.TwoTone.Topic
            ),
            IconData(
                name = "TouchApp",
                filled = Icons.Filled.TouchApp,
                outlined = Icons.Outlined.TouchApp,
                rounded = Icons.Rounded.TouchApp,
                sharp = Icons.Sharp.TouchApp,
                twoTone = Icons.TwoTone.TouchApp
            ),
            IconData(
                name = "Tour",
                filled = Icons.Filled.Tour,
                outlined = Icons.Outlined.Tour,
                rounded = Icons.Rounded.Tour,
                sharp = Icons.Sharp.Tour,
                twoTone = Icons.TwoTone.Tour
            ),
            IconData(
                name = "Toys",
                filled = Icons.Filled.Toys,
                outlined = Icons.Outlined.Toys,
                rounded = Icons.Rounded.Toys,
                sharp = Icons.Sharp.Toys,
                twoTone = Icons.TwoTone.Toys
            ),
            IconData(
                name = "TrackChanges",
                filled = Icons.Filled.TrackChanges,
                outlined = Icons.Outlined.TrackChanges,
                rounded = Icons.Rounded.TrackChanges,
                sharp = Icons.Sharp.TrackChanges,
                twoTone = Icons.TwoTone.TrackChanges
            ),
            IconData(
                name = "Traffic",
                filled = Icons.Filled.Traffic,
                outlined = Icons.Outlined.Traffic,
                rounded = Icons.Rounded.Traffic,
                sharp = Icons.Sharp.Traffic,
                twoTone = Icons.TwoTone.Traffic
            ),
            IconData(
                name = "Train",
                filled = Icons.Filled.Train,
                outlined = Icons.Outlined.Train,
                rounded = Icons.Rounded.Train,
                sharp = Icons.Sharp.Train,
                twoTone = Icons.TwoTone.Train
            ),
            IconData(
                name = "Tram",
                filled = Icons.Filled.Tram,
                outlined = Icons.Outlined.Tram,
                rounded = Icons.Rounded.Tram,
                sharp = Icons.Sharp.Tram,
                twoTone = Icons.TwoTone.Tram
            ),
            IconData(
                name = "TransferWithinAStation",
                filled = Icons.Filled.TransferWithinAStation,
                outlined = Icons.Outlined.TransferWithinAStation,
                rounded = Icons.Rounded.TransferWithinAStation,
                sharp = Icons.Sharp.TransferWithinAStation,
                twoTone = Icons.TwoTone.TransferWithinAStation
            ),
            IconData(
                name = "Transform",
                filled = Icons.Filled.Transform,
                outlined = Icons.Outlined.Transform,
                rounded = Icons.Rounded.Transform,
                sharp = Icons.Sharp.Transform,
                twoTone = Icons.TwoTone.Transform
            ),
            IconData(
                name = "TransitEnterexit",
                filled = Icons.Filled.TransitEnterexit,
                outlined = Icons.Outlined.TransitEnterexit,
                rounded = Icons.Rounded.TransitEnterexit,
                sharp = Icons.Sharp.TransitEnterexit,
                twoTone = Icons.TwoTone.TransitEnterexit
            ),
            IconData(
                name = "Translate",
                filled = Icons.Filled.Translate,
                outlined = Icons.Outlined.Translate,
                rounded = Icons.Rounded.Translate,
                sharp = Icons.Sharp.Translate,
                twoTone = Icons.TwoTone.Translate
            ),
            IconData(
                name = "TrendingDown",
                filled = Icons.Filled.TrendingDown,
                outlined = Icons.Outlined.TrendingDown,
                rounded = Icons.Rounded.TrendingDown,
                sharp = Icons.Sharp.TrendingDown,
                twoTone = Icons.TwoTone.TrendingDown
            ),
            IconData(
                name = "TrendingFlat",
                filled = Icons.Filled.TrendingFlat,
                outlined = Icons.Outlined.TrendingFlat,
                rounded = Icons.Rounded.TrendingFlat,
                sharp = Icons.Sharp.TrendingFlat,
                twoTone = Icons.TwoTone.TrendingFlat
            ),
            IconData(
                name = "TrendingUp",
                filled = Icons.Filled.TrendingUp,
                outlined = Icons.Outlined.TrendingUp,
                rounded = Icons.Rounded.TrendingUp,
                sharp = Icons.Sharp.TrendingUp,
                twoTone = Icons.TwoTone.TrendingUp
            ),
            IconData(
                name = "TripOrigin",
                filled = Icons.Filled.TripOrigin,
                outlined = Icons.Outlined.TripOrigin,
                rounded = Icons.Rounded.TripOrigin,
                sharp = Icons.Sharp.TripOrigin,
                twoTone = Icons.TwoTone.TripOrigin
            ),
            IconData(
                name = "Tty",
                filled = Icons.Filled.Tty,
                outlined = Icons.Outlined.Tty,
                rounded = Icons.Rounded.Tty,
                sharp = Icons.Sharp.Tty,
                twoTone = Icons.TwoTone.Tty
            ),
            IconData(
                name = "Tune",
                filled = Icons.Filled.Tune,
                outlined = Icons.Outlined.Tune,
                rounded = Icons.Rounded.Tune,
                sharp = Icons.Sharp.Tune,
                twoTone = Icons.TwoTone.Tune
            ),
            IconData(
                name = "TurnedIn",
                filled = Icons.Filled.TurnedIn,
                outlined = Icons.Outlined.TurnedIn,
                rounded = Icons.Rounded.TurnedIn,
                sharp = Icons.Sharp.TurnedIn,
                twoTone = Icons.TwoTone.TurnedIn
            ),
            IconData(
                name = "TurnedInNot",
                filled = Icons.Filled.TurnedInNot,
                outlined = Icons.Outlined.TurnedInNot,
                rounded = Icons.Rounded.TurnedInNot,
                sharp = Icons.Sharp.TurnedInNot,
                twoTone = Icons.TwoTone.TurnedInNot
            ),
            IconData(
                name = "Tv",
                filled = Icons.Filled.Tv,
                outlined = Icons.Outlined.Tv,
                rounded = Icons.Rounded.Tv,
                sharp = Icons.Sharp.Tv,
                twoTone = Icons.TwoTone.Tv
            ),
            IconData(
                name = "TvOff",
                filled = Icons.Filled.TvOff,
                outlined = Icons.Outlined.TvOff,
                rounded = Icons.Rounded.TvOff,
                sharp = Icons.Sharp.TvOff,
                twoTone = Icons.TwoTone.TvOff
            ),
            IconData(
                name = "TwoWheeler",
                filled = Icons.Filled.TwoWheeler,
                outlined = Icons.Outlined.TwoWheeler,
                rounded = Icons.Rounded.TwoWheeler,
                sharp = Icons.Sharp.TwoWheeler,
                twoTone = Icons.TwoTone.TwoWheeler
            ),
            IconData(
                name = "Umbrella",
                filled = Icons.Filled.Umbrella,
                outlined = Icons.Outlined.Umbrella,
                rounded = Icons.Rounded.Umbrella,
                sharp = Icons.Sharp.Umbrella,
                twoTone = Icons.TwoTone.Umbrella
            ),
            IconData(
                name = "Unarchive",
                filled = Icons.Filled.Unarchive,
                outlined = Icons.Outlined.Unarchive,
                rounded = Icons.Rounded.Unarchive,
                sharp = Icons.Sharp.Unarchive,
                twoTone = Icons.TwoTone.Unarchive
            ),
            IconData(
                name = "Undo",
                filled = Icons.Filled.Undo,
                outlined = Icons.Outlined.Undo,
                rounded = Icons.Rounded.Undo,
                sharp = Icons.Sharp.Undo,
                twoTone = Icons.TwoTone.Undo
            ),
            IconData(
                name = "UnfoldLess",
                filled = Icons.Filled.UnfoldLess,
                outlined = Icons.Outlined.UnfoldLess,
                rounded = Icons.Rounded.UnfoldLess,
                sharp = Icons.Sharp.UnfoldLess,
                twoTone = Icons.TwoTone.UnfoldLess
            ),
            IconData(
                name = "UnfoldMore",
                filled = Icons.Filled.UnfoldMore,
                outlined = Icons.Outlined.UnfoldMore,
                rounded = Icons.Rounded.UnfoldMore,
                sharp = Icons.Sharp.UnfoldMore,
                twoTone = Icons.TwoTone.UnfoldMore
            ),
            IconData(
                name = "Unpublished",
                filled = Icons.Filled.Unpublished,
                outlined = Icons.Outlined.Unpublished,
                rounded = Icons.Rounded.Unpublished,
                sharp = Icons.Sharp.Unpublished,
                twoTone = Icons.TwoTone.Unpublished
            ),
            IconData(
                name = "Unsubscribe",
                filled = Icons.Filled.Unsubscribe,
                outlined = Icons.Outlined.Unsubscribe,
                rounded = Icons.Rounded.Unsubscribe,
                sharp = Icons.Sharp.Unsubscribe,
                twoTone = Icons.TwoTone.Unsubscribe
            ),
            IconData(
                name = "Update",
                filled = Icons.Filled.Update,
                outlined = Icons.Outlined.Update,
                rounded = Icons.Rounded.Update,
                sharp = Icons.Sharp.Update,
                twoTone = Icons.TwoTone.Update
            ),
            IconData(
                name = "UpdateDisabled",
                filled = Icons.Filled.UpdateDisabled,
                outlined = Icons.Outlined.UpdateDisabled,
                rounded = Icons.Rounded.UpdateDisabled,
                sharp = Icons.Sharp.UpdateDisabled,
                twoTone = Icons.TwoTone.UpdateDisabled
            ),
            IconData(
                name = "Upgrade",
                filled = Icons.Filled.Upgrade,
                outlined = Icons.Outlined.Upgrade,
                rounded = Icons.Rounded.Upgrade,
                sharp = Icons.Sharp.Upgrade,
                twoTone = Icons.TwoTone.Upgrade
            ),
            IconData(
                name = "Usb",
                filled = Icons.Filled.Usb,
                outlined = Icons.Outlined.Usb,
                rounded = Icons.Rounded.Usb,
                sharp = Icons.Sharp.Usb,
                twoTone = Icons.TwoTone.Usb
            ),
            IconData(
                name = "Verified",
                filled = Icons.Filled.Verified,
                outlined = Icons.Outlined.Verified,
                rounded = Icons.Rounded.Verified,
                sharp = Icons.Sharp.Verified,
                twoTone = Icons.TwoTone.Verified
            ),
            IconData(
                name = "VerifiedUser",
                filled = Icons.Filled.VerifiedUser,
                outlined = Icons.Outlined.VerifiedUser,
                rounded = Icons.Rounded.VerifiedUser,
                sharp = Icons.Sharp.VerifiedUser,
                twoTone = Icons.TwoTone.VerifiedUser
            ),
            IconData(
                name = "VerticalAlignBottom",
                filled = Icons.Filled.VerticalAlignBottom,
                outlined = Icons.Outlined.VerticalAlignBottom,
                rounded = Icons.Rounded.VerticalAlignBottom,
                sharp = Icons.Sharp.VerticalAlignBottom,
                twoTone = Icons.TwoTone.VerticalAlignBottom
            ),
            IconData(
                name = "VerticalAlignCenter",
                filled = Icons.Filled.VerticalAlignCenter,
                outlined = Icons.Outlined.VerticalAlignCenter,
                rounded = Icons.Rounded.VerticalAlignCenter,
                sharp = Icons.Sharp.VerticalAlignCenter,
                twoTone = Icons.TwoTone.VerticalAlignCenter
            ),
            IconData(
                name = "VerticalAlignTop",
                filled = Icons.Filled.VerticalAlignTop,
                outlined = Icons.Outlined.VerticalAlignTop,
                rounded = Icons.Rounded.VerticalAlignTop,
                sharp = Icons.Sharp.VerticalAlignTop,
                twoTone = Icons.TwoTone.VerticalAlignTop
            ),
            IconData(
                name = "VerticalDistribute",
                filled = Icons.Filled.VerticalDistribute,
                outlined = Icons.Outlined.VerticalDistribute,
                rounded = Icons.Rounded.VerticalDistribute,
                sharp = Icons.Sharp.VerticalDistribute,
                twoTone = Icons.TwoTone.VerticalDistribute
            ),
            IconData(
                name = "VerticalSplit",
                filled = Icons.Filled.VerticalSplit,
                outlined = Icons.Outlined.VerticalSplit,
                rounded = Icons.Rounded.VerticalSplit,
                sharp = Icons.Sharp.VerticalSplit,
                twoTone = Icons.TwoTone.VerticalSplit
            ),
            IconData(
                name = "Vibration",
                filled = Icons.Filled.Vibration,
                outlined = Icons.Outlined.Vibration,
                rounded = Icons.Rounded.Vibration,
                sharp = Icons.Sharp.Vibration,
                twoTone = Icons.TwoTone.Vibration
            ),
            IconData(
                name = "VideoCall",
                filled = Icons.Filled.VideoCall,
                outlined = Icons.Outlined.VideoCall,
                rounded = Icons.Rounded.VideoCall,
                sharp = Icons.Sharp.VideoCall,
                twoTone = Icons.TwoTone.VideoCall
            ),
            IconData(
                name = "VideoLabel",
                filled = Icons.Filled.VideoLabel,
                outlined = Icons.Outlined.VideoLabel,
                rounded = Icons.Rounded.VideoLabel,
                sharp = Icons.Sharp.VideoLabel,
                twoTone = Icons.TwoTone.VideoLabel
            ),
            IconData(
                name = "VideoLibrary",
                filled = Icons.Filled.VideoLibrary,
                outlined = Icons.Outlined.VideoLibrary,
                rounded = Icons.Rounded.VideoLibrary,
                sharp = Icons.Sharp.VideoLibrary,
                twoTone = Icons.TwoTone.VideoLibrary
            ),
            IconData(
                name = "VideoSettings",
                filled = Icons.Filled.VideoSettings,
                outlined = Icons.Outlined.VideoSettings,
                rounded = Icons.Rounded.VideoSettings,
                sharp = Icons.Sharp.VideoSettings,
                twoTone = Icons.TwoTone.VideoSettings
            ),
            IconData(
                name = "Videocam",
                filled = Icons.Filled.Videocam,
                outlined = Icons.Outlined.Videocam,
                rounded = Icons.Rounded.Videocam,
                sharp = Icons.Sharp.Videocam,
                twoTone = Icons.TwoTone.Videocam
            ),
            IconData(
                name = "VideocamOff",
                filled = Icons.Filled.VideocamOff,
                outlined = Icons.Outlined.VideocamOff,
                rounded = Icons.Rounded.VideocamOff,
                sharp = Icons.Sharp.VideocamOff,
                twoTone = Icons.TwoTone.VideocamOff
            ),
            IconData(
                name = "VideogameAsset",
                filled = Icons.Filled.VideogameAsset,
                outlined = Icons.Outlined.VideogameAsset,
                rounded = Icons.Rounded.VideogameAsset,
                sharp = Icons.Sharp.VideogameAsset,
                twoTone = Icons.TwoTone.VideogameAsset
            ),
            IconData(
                name = "ViewAgenda",
                filled = Icons.Filled.ViewAgenda,
                outlined = Icons.Outlined.ViewAgenda,
                rounded = Icons.Rounded.ViewAgenda,
                sharp = Icons.Sharp.ViewAgenda,
                twoTone = Icons.TwoTone.ViewAgenda
            ),
            IconData(
                name = "ViewArray",
                filled = Icons.Filled.ViewArray,
                outlined = Icons.Outlined.ViewArray,
                rounded = Icons.Rounded.ViewArray,
                sharp = Icons.Sharp.ViewArray,
                twoTone = Icons.TwoTone.ViewArray
            ),
            IconData(
                name = "ViewCarousel",
                filled = Icons.Filled.ViewCarousel,
                outlined = Icons.Outlined.ViewCarousel,
                rounded = Icons.Rounded.ViewCarousel,
                sharp = Icons.Sharp.ViewCarousel,
                twoTone = Icons.TwoTone.ViewCarousel
            ),
            IconData(
                name = "ViewColumn",
                filled = Icons.Filled.ViewColumn,
                outlined = Icons.Outlined.ViewColumn,
                rounded = Icons.Rounded.ViewColumn,
                sharp = Icons.Sharp.ViewColumn,
                twoTone = Icons.TwoTone.ViewColumn
            ),
            IconData(
                name = "ViewComfy",
                filled = Icons.Filled.ViewComfy,
                outlined = Icons.Outlined.ViewComfy,
                rounded = Icons.Rounded.ViewComfy,
                sharp = Icons.Sharp.ViewComfy,
                twoTone = Icons.TwoTone.ViewComfy
            ),
            IconData(
                name = "ViewCompact",
                filled = Icons.Filled.ViewCompact,
                outlined = Icons.Outlined.ViewCompact,
                rounded = Icons.Rounded.ViewCompact,
                sharp = Icons.Sharp.ViewCompact,
                twoTone = Icons.TwoTone.ViewCompact
            ),
            IconData(
                name = "ViewDay",
                filled = Icons.Filled.ViewDay,
                outlined = Icons.Outlined.ViewDay,
                rounded = Icons.Rounded.ViewDay,
                sharp = Icons.Sharp.ViewDay,
                twoTone = Icons.TwoTone.ViewDay
            ),
            IconData(
                name = "ViewHeadline",
                filled = Icons.Filled.ViewHeadline,
                outlined = Icons.Outlined.ViewHeadline,
                rounded = Icons.Rounded.ViewHeadline,
                sharp = Icons.Sharp.ViewHeadline,
                twoTone = Icons.TwoTone.ViewHeadline
            ),
            IconData(
                name = "ViewList",
                filled = Icons.Filled.ViewList,
                outlined = Icons.Outlined.ViewList,
                rounded = Icons.Rounded.ViewList,
                sharp = Icons.Sharp.ViewList,
                twoTone = Icons.TwoTone.ViewList
            ),
            IconData(
                name = "ViewModule",
                filled = Icons.Filled.ViewModule,
                outlined = Icons.Outlined.ViewModule,
                rounded = Icons.Rounded.ViewModule,
                sharp = Icons.Sharp.ViewModule,
                twoTone = Icons.TwoTone.ViewModule
            ),
            IconData(
                name = "ViewQuilt",
                filled = Icons.Filled.ViewQuilt,
                outlined = Icons.Outlined.ViewQuilt,
                rounded = Icons.Rounded.ViewQuilt,
                sharp = Icons.Sharp.ViewQuilt,
                twoTone = Icons.TwoTone.ViewQuilt
            ),
            IconData(
                name = "ViewSidebar",
                filled = Icons.Filled.ViewSidebar,
                outlined = Icons.Outlined.ViewSidebar,
                rounded = Icons.Rounded.ViewSidebar,
                sharp = Icons.Sharp.ViewSidebar,
                twoTone = Icons.TwoTone.ViewSidebar
            ),
            IconData(
                name = "ViewStream",
                filled = Icons.Filled.ViewStream,
                outlined = Icons.Outlined.ViewStream,
                rounded = Icons.Rounded.ViewStream,
                sharp = Icons.Sharp.ViewStream,
                twoTone = Icons.TwoTone.ViewStream
            ),
            IconData(
                name = "ViewWeek",
                filled = Icons.Filled.ViewWeek,
                outlined = Icons.Outlined.ViewWeek,
                rounded = Icons.Rounded.ViewWeek,
                sharp = Icons.Sharp.ViewWeek,
                twoTone = Icons.TwoTone.ViewWeek
            ),
            IconData(
                name = "Vignette",
                filled = Icons.Filled.Vignette,
                outlined = Icons.Outlined.Vignette,
                rounded = Icons.Rounded.Vignette,
                sharp = Icons.Sharp.Vignette,
                twoTone = Icons.TwoTone.Vignette
            ),
            IconData(
                name = "Visibility",
                filled = Icons.Filled.Visibility,
                outlined = Icons.Outlined.Visibility,
                rounded = Icons.Rounded.Visibility,
                sharp = Icons.Sharp.Visibility,
                twoTone = Icons.TwoTone.Visibility
            ),
            IconData(
                name = "VisibilityOff",
                filled = Icons.Filled.VisibilityOff,
                outlined = Icons.Outlined.VisibilityOff,
                rounded = Icons.Rounded.VisibilityOff,
                sharp = Icons.Sharp.VisibilityOff,
                twoTone = Icons.TwoTone.VisibilityOff
            ),
            IconData(
                name = "VoiceChat",
                filled = Icons.Filled.VoiceChat,
                outlined = Icons.Outlined.VoiceChat,
                rounded = Icons.Rounded.VoiceChat,
                sharp = Icons.Sharp.VoiceChat,
                twoTone = Icons.TwoTone.VoiceChat
            ),
            IconData(
                name = "VoiceOverOff",
                filled = Icons.Filled.VoiceOverOff,
                outlined = Icons.Outlined.VoiceOverOff,
                rounded = Icons.Rounded.VoiceOverOff,
                sharp = Icons.Sharp.VoiceOverOff,
                twoTone = Icons.TwoTone.VoiceOverOff
            ),
            IconData(
                name = "Voicemail",
                filled = Icons.Filled.Voicemail,
                outlined = Icons.Outlined.Voicemail,
                rounded = Icons.Rounded.Voicemail,
                sharp = Icons.Sharp.Voicemail,
                twoTone = Icons.TwoTone.Voicemail
            ),
            IconData(
                name = "VolumeDown",
                filled = Icons.Filled.VolumeDown,
                outlined = Icons.Outlined.VolumeDown,
                rounded = Icons.Rounded.VolumeDown,
                sharp = Icons.Sharp.VolumeDown,
                twoTone = Icons.TwoTone.VolumeDown
            ),
            IconData(
                name = "VolumeMute",
                filled = Icons.Filled.VolumeMute,
                outlined = Icons.Outlined.VolumeMute,
                rounded = Icons.Rounded.VolumeMute,
                sharp = Icons.Sharp.VolumeMute,
                twoTone = Icons.TwoTone.VolumeMute
            ),
            IconData(
                name = "VolumeOff",
                filled = Icons.Filled.VolumeOff,
                outlined = Icons.Outlined.VolumeOff,
                rounded = Icons.Rounded.VolumeOff,
                sharp = Icons.Sharp.VolumeOff,
                twoTone = Icons.TwoTone.VolumeOff
            ),
            IconData(
                name = "VolumeUp",
                filled = Icons.Filled.VolumeUp,
                outlined = Icons.Outlined.VolumeUp,
                rounded = Icons.Rounded.VolumeUp,
                sharp = Icons.Sharp.VolumeUp,
                twoTone = Icons.TwoTone.VolumeUp
            ),
            IconData(
                name = "VpnKey",
                filled = Icons.Filled.VpnKey,
                outlined = Icons.Outlined.VpnKey,
                rounded = Icons.Rounded.VpnKey,
                sharp = Icons.Sharp.VpnKey,
                twoTone = Icons.TwoTone.VpnKey
            ),
            IconData(
                name = "VpnLock",
                filled = Icons.Filled.VpnLock,
                outlined = Icons.Outlined.VpnLock,
                rounded = Icons.Rounded.VpnLock,
                sharp = Icons.Sharp.VpnLock,
                twoTone = Icons.TwoTone.VpnLock
            ),
            IconData(
                name = "Wallpaper",
                filled = Icons.Filled.Wallpaper,
                outlined = Icons.Outlined.Wallpaper,
                rounded = Icons.Rounded.Wallpaper,
                sharp = Icons.Sharp.Wallpaper,
                twoTone = Icons.TwoTone.Wallpaper
            ),
            IconData(
                name = "Wash",
                filled = Icons.Filled.Wash,
                outlined = Icons.Outlined.Wash,
                rounded = Icons.Rounded.Wash,
                sharp = Icons.Sharp.Wash,
                twoTone = Icons.TwoTone.Wash
            ),
            IconData(
                name = "Watch",
                filled = Icons.Filled.Watch,
                outlined = Icons.Outlined.Watch,
                rounded = Icons.Rounded.Watch,
                sharp = Icons.Sharp.Watch,
                twoTone = Icons.TwoTone.Watch
            ),
            IconData(
                name = "WatchLater",
                filled = Icons.Filled.WatchLater,
                outlined = Icons.Outlined.WatchLater,
                rounded = Icons.Rounded.WatchLater,
                sharp = Icons.Sharp.WatchLater,
                twoTone = Icons.TwoTone.WatchLater
            ),
            IconData(
                name = "WaterDamage",
                filled = Icons.Filled.WaterDamage,
                outlined = Icons.Outlined.WaterDamage,
                rounded = Icons.Rounded.WaterDamage,
                sharp = Icons.Sharp.WaterDamage,
                twoTone = Icons.TwoTone.WaterDamage
            ),
            IconData(
                name = "Waves",
                filled = Icons.Filled.Waves,
                outlined = Icons.Outlined.Waves,
                rounded = Icons.Rounded.Waves,
                sharp = Icons.Sharp.Waves,
                twoTone = Icons.TwoTone.Waves
            ),
            IconData(
                name = "WbAuto",
                filled = Icons.Filled.WbAuto,
                outlined = Icons.Outlined.WbAuto,
                rounded = Icons.Rounded.WbAuto,
                sharp = Icons.Sharp.WbAuto,
                twoTone = Icons.TwoTone.WbAuto
            ),
            IconData(
                name = "WbCloudy",
                filled = Icons.Filled.WbCloudy,
                outlined = Icons.Outlined.WbCloudy,
                rounded = Icons.Rounded.WbCloudy,
                sharp = Icons.Sharp.WbCloudy,
                twoTone = Icons.TwoTone.WbCloudy
            ),
            IconData(
                name = "WbIncandescent",
                filled = Icons.Filled.WbIncandescent,
                outlined = Icons.Outlined.WbIncandescent,
                rounded = Icons.Rounded.WbIncandescent,
                sharp = Icons.Sharp.WbIncandescent,
                twoTone = Icons.TwoTone.WbIncandescent
            ),
            IconData(
                name = "WbIridescent",
                filled = Icons.Filled.WbIridescent,
                outlined = Icons.Outlined.WbIridescent,
                rounded = Icons.Rounded.WbIridescent,
                sharp = Icons.Sharp.WbIridescent,
                twoTone = Icons.TwoTone.WbIridescent
            ),
            IconData(
                name = "WbSunny",
                filled = Icons.Filled.WbSunny,
                outlined = Icons.Outlined.WbSunny,
                rounded = Icons.Rounded.WbSunny,
                sharp = Icons.Sharp.WbSunny,
                twoTone = Icons.TwoTone.WbSunny
            ),
            IconData(
                name = "Wc",
                filled = Icons.Filled.Wc,
                outlined = Icons.Outlined.Wc,
                rounded = Icons.Rounded.Wc,
                sharp = Icons.Sharp.Wc,
                twoTone = Icons.TwoTone.Wc
            ),
            IconData(
                name = "Web",
                filled = Icons.Filled.Web,
                outlined = Icons.Outlined.Web,
                rounded = Icons.Rounded.Web,
                sharp = Icons.Sharp.Web,
                twoTone = Icons.TwoTone.Web
            ),
            IconData(
                name = "WebAsset",
                filled = Icons.Filled.WebAsset,
                outlined = Icons.Outlined.WebAsset,
                rounded = Icons.Rounded.WebAsset,
                sharp = Icons.Sharp.WebAsset,
                twoTone = Icons.TwoTone.WebAsset
            ),
            IconData(
                name = "Weekend",
                filled = Icons.Filled.Weekend,
                outlined = Icons.Outlined.Weekend,
                rounded = Icons.Rounded.Weekend,
                sharp = Icons.Sharp.Weekend,
                twoTone = Icons.TwoTone.Weekend
            ),
            IconData(
                name = "West",
                filled = Icons.Filled.West,
                outlined = Icons.Outlined.West,
                rounded = Icons.Rounded.West,
                sharp = Icons.Sharp.West,
                twoTone = Icons.TwoTone.West
            ),
            IconData(
                name = "Whatshot",
                filled = Icons.Filled.Whatshot,
                outlined = Icons.Outlined.Whatshot,
                rounded = Icons.Rounded.Whatshot,
                sharp = Icons.Sharp.Whatshot,
                twoTone = Icons.TwoTone.Whatshot
            ),
            IconData(
                name = "WheelchairPickup",
                filled = Icons.Filled.WheelchairPickup,
                outlined = Icons.Outlined.WheelchairPickup,
                rounded = Icons.Rounded.WheelchairPickup,
                sharp = Icons.Sharp.WheelchairPickup,
                twoTone = Icons.TwoTone.WheelchairPickup
            ),
            IconData(
                name = "WhereToVote",
                filled = Icons.Filled.WhereToVote,
                outlined = Icons.Outlined.WhereToVote,
                rounded = Icons.Rounded.WhereToVote,
                sharp = Icons.Sharp.WhereToVote,
                twoTone = Icons.TwoTone.WhereToVote
            ),
            IconData(
                name = "Widgets",
                filled = Icons.Filled.Widgets,
                outlined = Icons.Outlined.Widgets,
                rounded = Icons.Rounded.Widgets,
                sharp = Icons.Sharp.Widgets,
                twoTone = Icons.TwoTone.Widgets
            ),
            IconData(
                name = "Wifi",
                filled = Icons.Filled.Wifi,
                outlined = Icons.Outlined.Wifi,
                rounded = Icons.Rounded.Wifi,
                sharp = Icons.Sharp.Wifi,
                twoTone = Icons.TwoTone.Wifi
            ),
            IconData(
                name = "WifiCalling",
                filled = Icons.Filled.WifiCalling,
                outlined = Icons.Outlined.WifiCalling,
                rounded = Icons.Rounded.WifiCalling,
                sharp = Icons.Sharp.WifiCalling,
                twoTone = Icons.TwoTone.WifiCalling
            ),
            IconData(
                name = "WifiLock",
                filled = Icons.Filled.WifiLock,
                outlined = Icons.Outlined.WifiLock,
                rounded = Icons.Rounded.WifiLock,
                sharp = Icons.Sharp.WifiLock,
                twoTone = Icons.TwoTone.WifiLock
            ),
            IconData(
                name = "WifiOff",
                filled = Icons.Filled.WifiOff,
                outlined = Icons.Outlined.WifiOff,
                rounded = Icons.Rounded.WifiOff,
                sharp = Icons.Sharp.WifiOff,
                twoTone = Icons.TwoTone.WifiOff
            ),
            IconData(
                name = "WifiProtectedSetup",
                filled = Icons.Filled.WifiProtectedSetup,
                outlined = Icons.Outlined.WifiProtectedSetup,
                rounded = Icons.Rounded.WifiProtectedSetup,
                sharp = Icons.Sharp.WifiProtectedSetup,
                twoTone = Icons.TwoTone.WifiProtectedSetup
            ),
            IconData(
                name = "WifiTethering",
                filled = Icons.Filled.WifiTethering,
                outlined = Icons.Outlined.WifiTethering,
                rounded = Icons.Rounded.WifiTethering,
                sharp = Icons.Sharp.WifiTethering,
                twoTone = Icons.TwoTone.WifiTethering
            ),
            IconData(
                name = "WineBar",
                filled = Icons.Filled.WineBar,
                outlined = Icons.Outlined.WineBar,
                rounded = Icons.Rounded.WineBar,
                sharp = Icons.Sharp.WineBar,
                twoTone = Icons.TwoTone.WineBar
            ),
            IconData(
                name = "Work",
                filled = Icons.Filled.Work,
                outlined = Icons.Outlined.Work,
                rounded = Icons.Rounded.Work,
                sharp = Icons.Sharp.Work,
                twoTone = Icons.TwoTone.Work
            ),
            IconData(
                name = "WorkOff",
                filled = Icons.Filled.WorkOff,
                outlined = Icons.Outlined.WorkOff,
                rounded = Icons.Rounded.WorkOff,
                sharp = Icons.Sharp.WorkOff,
                twoTone = Icons.TwoTone.WorkOff
            ),
            IconData(
                name = "WorkOutline",
                filled = Icons.Filled.WorkOutline,
                outlined = Icons.Outlined.WorkOutline,
                rounded = Icons.Rounded.WorkOutline,
                sharp = Icons.Sharp.WorkOutline,
                twoTone = Icons.TwoTone.WorkOutline
            ),
            IconData(
                name = "WrapText",
                filled = Icons.Filled.WrapText,
                outlined = Icons.Outlined.WrapText,
                rounded = Icons.Rounded.WrapText,
                sharp = Icons.Sharp.WrapText,
                twoTone = Icons.TwoTone.WrapText
            ),
            IconData(
                name = "WrongLocation",
                filled = Icons.Filled.WrongLocation,
                outlined = Icons.Outlined.WrongLocation,
                rounded = Icons.Rounded.WrongLocation,
                sharp = Icons.Sharp.WrongLocation,
                twoTone = Icons.TwoTone.WrongLocation
            ),
            IconData(
                name = "Wysiwyg",
                filled = Icons.Filled.Wysiwyg,
                outlined = Icons.Outlined.Wysiwyg,
                rounded = Icons.Rounded.Wysiwyg,
                sharp = Icons.Sharp.Wysiwyg,
                twoTone = Icons.TwoTone.Wysiwyg
            ),
            IconData(
                name = "YoutubeSearchedFor",
                filled = Icons.Filled.YoutubeSearchedFor,
                outlined = Icons.Outlined.YoutubeSearchedFor,
                rounded = Icons.Rounded.YoutubeSearchedFor,
                sharp = Icons.Sharp.YoutubeSearchedFor,
                twoTone = Icons.TwoTone.YoutubeSearchedFor
            ),
            IconData(
                name = "ZoomIn",
                filled = Icons.Filled.ZoomIn,
                outlined = Icons.Outlined.ZoomIn,
                rounded = Icons.Rounded.ZoomIn,
                sharp = Icons.Sharp.ZoomIn,
                twoTone = Icons.TwoTone.ZoomIn
            ),
            IconData(
                name = "ZoomOut",
                filled = Icons.Filled.ZoomOut,
                outlined = Icons.Outlined.ZoomOut,
                rounded = Icons.Rounded.ZoomOut,
                sharp = Icons.Sharp.ZoomOut,
                twoTone = Icons.TwoTone.ZoomOut
            ),
            IconData(
                name = "ZoomOutMap",
                filled = Icons.Filled.ZoomOutMap,
                outlined = Icons.Outlined.ZoomOutMap,
                rounded = Icons.Rounded.ZoomOutMap,
                sharp = Icons.Sharp.ZoomOutMap,
                twoTone = Icons.TwoTone.ZoomOutMap
            ),
            IconData(
                name = "_360",
                filled = Icons.Filled._360,
                outlined = Icons.Outlined._360,
                rounded = Icons.Rounded._360,
                sharp = Icons.Sharp._360,
                twoTone = Icons.TwoTone._360
            ),
            IconData(
                name = "_3dRotation",
                filled = Icons.Filled._3dRotation,
                outlined = Icons.Outlined._3dRotation,
                rounded = Icons.Rounded._3dRotation,
                sharp = Icons.Sharp._3dRotation,
                twoTone = Icons.TwoTone._3dRotation
            ),
            IconData(
                name = "_4k",
                filled = Icons.Filled._4k,
                outlined = Icons.Outlined._4k,
                rounded = Icons.Rounded._4k,
                sharp = Icons.Sharp._4k,
                twoTone = Icons.TwoTone._4k
            ),
            IconData(
                name = "_5g",
                filled = Icons.Filled._5g,
                outlined = Icons.Outlined._5g,
                rounded = Icons.Rounded._5g,
                sharp = Icons.Sharp._5g,
                twoTone = Icons.TwoTone._5g
            ),
            IconData(
                name = "_6FtApart",
                filled = Icons.Filled._6FtApart,
                outlined = Icons.Outlined._6FtApart,
                rounded = Icons.Rounded._6FtApart,
                sharp = Icons.Sharp._6FtApart,
                twoTone = Icons.TwoTone._6FtApart
            )
        )
    }
}
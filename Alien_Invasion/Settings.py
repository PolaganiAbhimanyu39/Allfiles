class Settings:
    """A class to store all settings for alien invasion."""
    def __init__(self):
        """Initialize the game settings."""
        #Screen settings
        self.screen_width = 1200
        self.screen_height = 800
        # Ship settings
        self.ship_speed = 1.5
        self.ship_limit = 3
        self.bg_color = (254,254,254)
        self.bullet_speed = 3.0
        self.bullet_width = 5
        self.bullet_height = 40
        self.bullet_color = (60,60,60)
        self.bullets_allowed = 3
        # Alien_settings
        self.alien_speed = 1.0
        self.fleet_drop_speed = 100
        # Fleet direction of 1 represents right; -1 represents left.
        self.fleet_direction = 1


        